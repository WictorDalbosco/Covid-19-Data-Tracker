
package com.mycompany.portalcovidd;

 /**
 * Essa � a classe inicial do programa para coleta de dados a respeito do COVID-19 utilizando o Selenium como
 * ferramenta de web scraping de dados e drivers de busca apropriados para navegadores tipo edge/chrome.
 * Possui apenas o m�todo main, que cuida da execu��o do jogo.
 *
 * @author Wictor Dalbosco Silva        N�USP 11871027
 * @author Lu�sa Balleroni Shimabucoro  N�USP 11832385
 *
 */
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.chrome.ChromeOptions;
import java.nio.file.Paths;

public class ColetaDados {

    /**
     * M�todo que retorna dados sobre a pandemia do COVID-19 em todos os estados brasileiros
     * @return Vetor de objetos contendo informa��es sobre COVID-19 por todos os estados do Brasil
     *          uid: N�mero do ID do estado;
     *          uf: Sigla estado;
     *          state: Nome do estado;
     *          cases: N�mero de casos;
     *          deaths: N�mero de mortes;
     *          suspects: N�mero de suspeitas;
     *          refuses: N�mero de recuperados;
     *          datetime: Data do dado coletado;
     */
    private static final String Link = "https://chromedriver.storage.googleapis.com/index.html?path=92.0.4515.43/";
    
    public static DadosEstados [] getCovidStatus(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver edge = new ChromeDriver(options);

        try {
            edge.get("https://github.com/devarthurribeiro/covid19-brazil-api/blob/master/data/ms/report.json");

            DadosEstados[] informacoesEstados = new DadosEstados[27];

            String uid = null;
            String uf = null;
            String state = null;
            String cases = null;
            String deaths = null;
            String suspects = null;
            String refuses = null;
            String datetime = null;

            //Itera��es por todos os estados
            for (int i = 0; i < 27; i++){

                //Itera��o sobre todos os campos do JSON
                for (int j = (i*10)+3, k = 1; j < (i*10)+11; j++){

                    //String para consulta do id no elemento do html
                    String id = "LC" + j;
                    WebElement linha = edge.findElement(By.id(id));

                    String text = linha.getText();
                    String[] array;

                    //Tratamento das strings (retirar aspas, v�rgulas e dois pontos)
                    array = text.split("(: )");
                    array = array[1].split("(,)");
                    array = array[0].split("(\")");

                    //Vemos qual atributo est� sendo consultado no site
                    switch (k) {
                        case 1:
                            uid = array[0];
                            break;
                        case 2:
                            uf = array[1];
                            break;
                        case 3:
                            state = array[1];
                            break;
                        case 4:
                            cases = array[0];
                            break;
                        case 5:
                            deaths = array[0];
                            break;
                        case 6:
                            suspects = array[0];
                            break;
                        case 7:
                            refuses = array[0];
                            break;
                        case 8:
                            datetime = array[1];
                            break;
                        default:
                            System.out.println("Op��o inv�lida");
                    }
                    k++;
                }
                informacoesEstados[i] = new DadosEstados(uid,uf,state,cases,deaths,suspects,refuses,datetime);
            }

            return informacoesEstados;
        }finally {
            edge.quit();
        }
    }

    /**
     * M�todo que retorna informa��es sobre a vacina em todos os estados brasileiros
     *
     * @return Vetor de objetos contendo informa��es sobre a campanha de vacin��o por todos os estados
     *          nomeEstado;
     *          nVacAplicadas;
     *          nVac1Dose: N�mero de 1 doses aplicadas;
     *          percentPopulcao1dose:Percentual da popula��o vacinada;
     *          nVac2doseOuUnica:N�mero de doses �nicas ou 2 doses aplicadas;
     *          percentPopImunizada: Percentual da popula��o do estado vacinada;
     *          vacAplicadasUltimas24hrs: N�mero de vacinas aplicadas nas �ltimas 24 horas no estado;
     *          percentDosesUsadas: Percentual de doses utilizadas;
     */
    public static DadosVacina[] getVaccineStatus(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver edge = new ChromeDriver(options);

        try{
            edge.get("https://especiais.g1.globo.com/bemestar/vacina/2021/mapa-brasil-vacina-covid/");

            DadosVacina[] informarcoesVacina = new DadosVacina[27];

            String nomeEstado = null;
            String nVacAplicadas = null;
            String nVac1Dose = null;
            String percentPopulcao1dose = null;
            String nVac2doseOuUnica = null;
            String percentPopImunizada = null;
            String vacAplicadasUltimas24hrs = null;
            String percentDosesUsadas = null;

            //Itera��es por todos os estados
            for (int i = 1; i <= 27; i++){

                String id = ""+i;

                for (int j = 0; j < 8; j++){

                    //Buscamos o field da tabela no elemento
                    WebElement field = edge.findElement(By.xpath("//*[@id=\"covid_data_table\"]/tbody/tr["+id+"]/td["+(j+1)+"]"));
                    String array = field.getText();

                    //Vemos qual atributo est� sendo consultado no site
                    switch (j) {
                        case 0:
                            nomeEstado = ""+array;
                            break;
                        case 1:
                            nVacAplicadas = ""+array;
                            break;
                        case 2:
                            nVac1Dose = ""+array;
                            break;
                        case 3:
                            percentPopulcao1dose = ""+array;
                            break;
                        case 4:
                            nVac2doseOuUnica = ""+array;
                            break;
                        case 5:
                            percentPopImunizada = ""+array;
                            break;
                        case 6:
                            vacAplicadasUltimas24hrs = ""+array;
                            break;
                        case 7:
                            percentDosesUsadas = ""+array;
                            break;
                        default:
                            System.out.println("Op��o inv�lida");
                    }
                }
                informarcoesVacina[i-1] = new DadosVacina(nomeEstado,nVacAplicadas,nVac1Dose,percentPopulcao1dose,nVac2doseOuUnica,percentPopImunizada,vacAplicadasUltimas24hrs,percentDosesUsadas);
            }
            return informarcoesVacina;

        }finally {
            edge.quit();
        }
    }

    /**
     *  M�todo que informa como est� a situa��o da pandemia nos 10 primeiros pa�ses em que a situa��o est� mais cr�tica
     *
     * @return Vetor de objetos contendo informa��es a respeito da pandemia do COVID-19 em 10 pa�ses incluindo o BRASIL
     *          nomePais;
     *          nCasos;
     *          nMortes;
     *          nRecuperados;
     *          casosAtivos: Casos de pessoas infectadas atualmente com o v�rus.
     */
    public static DadosPaises[] getCountriesStatus(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver edge = new ChromeDriver(options);

        try{
            edge.get("https://www.trt.net.tr/portuguese/covid19");

            DadosPaises[] informacoesPaises = new DadosPaises[10];

            String nomePais = null;
            String nCasos = null;
            String nMortes = null;
            String nRecuperados = null;
            String casosAtivos = null;

            //Itera��es pelos primeiros 10 pa�ses
            for (int i = 1; i <= 10; i++){

                String id = ""+i;

                for (int j = 0; j <= 4; j++){

                    //Buscamos o field da tabela no elemento
                    WebElement field = edge.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr["+id+"]/td["+(j+1)+"]"));
                    String array = field.getText();

                    //Vemos qual atributo est� sendo consultado no site
                    switch (j) {
                        case 0:
                            nomePais = ""+array;
                            break;
                        case 1:
                            nCasos = ""+array;
                            break;
                        case 2:
                            nMortes = ""+array;
                            break;
                        case 3:
                            nRecuperados = ""+array;
                            break;
                        case 4:
                            casosAtivos = ""+array;
                            break;
                        default:
                            System.out.println("Op��o inv�lida");
                    }
                }
                informacoesPaises[i-1] = new DadosPaises(nomePais,nCasos,nMortes,nRecuperados,casosAtivos);
                System.out.println(informacoesPaises[i-1]);
            }
            return informacoesPaises;

        }finally {
            edge.quit();
        }
    }

    /**
     * M�todo utilizada para recuperar informa��es atualizadas sobre o COVID-19 no mundo
     * @return objeto que contem as informa��es relevantes sobre a pandemia
     *
     *         nCasos: N�mero de casos totais no mundo
     *         nMortes: N�mero totais de �bitos no mundo
     *         nRecuperados: N�mero total de pessoas recuperadas do v�rus
     */
    public static Dados getWorldStatus(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver edge = new ChromeDriver(options);

        try{
            edge.get("https://www.trt.net.tr/portuguese/covid19");

            Dados informarcoesMundo;

            String nCasos = null;
            String nMortes = null;
            String nRecuperados = null;
            

            for (int j = 1; j <= 3; j++){

                //Buscamos o field da tabela no elemento
                WebElement field = edge.findElement(By.xpath("/html/body/div[3]/main/div[6]/div["+j+"]/div/span[2]"));
                String array = field.getText();

                //Vemos qual atributo est� sendo consultado no site
                switch (j) {
                    case 1:
                       
                        nCasos = ""+array;
                        break;
                    case 2:
                        nMortes = ""+array;
                        break;
                    case 3:
                        nRecuperados = ""+array;
                        break;
                    default:
                        System.out.println("Op��o inv�lida");
                }
            }

            informarcoesMundo = new Dados(nCasos,nMortes,nRecuperados);


            return informarcoesMundo;

        }finally {
            edge.quit();
        }
    }

    /**
     * M�todo utilizado para fazer consultas em um site externo com infroma��es atualizadas sobre COVID-19
     * em uma cidade brasileira qualquer informada na busca
     * @param nomeCidadeBuscada Busca informa��es sobre dados do COVID-19 em uma cidade digitada no Brasil
     * @return Objeto cidade com informa��es a respeito do COVID-19
     *         dataInfo: Informa��es da data de coleta dos dados
     *         nomeCidade: Nome da cidade buscada;
     *         nomeEstado: Nome do estado;
     *         confirmados: Casos confirmados por estado;
     *         confirmadosPor100kHab: Casos confirmado por 100km quadrados;
     *         obitos: N�mero de �bitos;
     *         letalidade: Taxa de letalidade do v�rus;
     *         obitosPor100kHab: Obitos por 100km quadrados;
     *
     */
    public static DadosMunicipais getCityStatus(String nomeCidadeBuscada){

        boolean encontrouCidade = true;

        //Nomes de cidade n�o contem n�meros
        if (nomeCidadeBuscada.matches("^[0-9]*$")){
            System.out.println("Apenas caracteres s�o aceitos");
            return null;
        }

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver edge = new ChromeDriver(options);

        try{

            DadosMunicipais informarcoesCidade = null;

            edge.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            edge.get("https://brasil.io/covid19/");

            edge.findElement(By.xpath("//*[@id=\"DataTables_Table_0_filter\"]/label/input")).sendKeys(nomeCidadeBuscada);

            String dataInfo = null;
            String nomeCidade = null;
            String nomeEstado = null;
            String confirmados = null;
            String confirmadosPor100kHab = null;
            String obitos = null;
            String letalidade = null;
            String obitosPor100kHab = null;

            //Navega��o pelos par�metros da tabela de dados da cidade buscada
            for (int i = 1; i <= 8; i++){
                WebElement cidade = edge.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td["+i+"]"));
                if(cidade.getText().equals("No matching records found")){
                    encontrouCidade = false;
                    break;
                }
                String array = cidade.getText();


                //Vemos qual atributo est� sendo consultado no site
                switch (i) {
                    case 1:
                        dataInfo = ""+array;
                        break;
                    case 2:
                        nomeCidade = ""+array;
                        break;
                    case 3:
                        nomeEstado = ""+array;
                        break;
                    case 4:
                        confirmados = ""+array;
                        break;
                    case 5:
                        confirmadosPor100kHab = ""+array;
                        break;
                    case 6:
                        obitos = ""+array;
                        break;
                    case 7:
                        letalidade = ""+array;
                        break;
                    case 8:
                        obitosPor100kHab = ""+array;
                        break;
                    default:
                        System.out.println("Op��o inv�lida");
                }
            }
            if (encontrouCidade){
                informarcoesCidade = new DadosMunicipais(dataInfo,nomeCidade,nomeEstado,confirmados,confirmadosPor100kHab,obitos,letalidade,obitosPor100kHab);
            }else{
                System.out.println("A cidade digitada n�o foi encontrada");
            }

            return informarcoesCidade;

        }finally {
            edge.quit();
        }
    }
//
    public static Noticias[] coletarNoticias(){
        Noticias[] noticias = new Noticias[4];

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver edge = new ChromeDriver(options);

//        edge.get("https://bit.ly/3x4HvxN");
        edge.get("https://www.google.com/search?q=Coronavirus+em+Brasil&source=lnms&tbm=nws&sa=X&ved=2ahUKEwjn_M_fl4LyAhU7FrkGHeNFCAgQ_AUoAXoECAEQAw");;
//        edge.get("https://news.google.com/search?q=covid%20brasil&hl=pt-BR&gl=BR&ceid=BR%3Apt-419");

        for (int i = 1; i <= 4; i++) {


            // Fonte
            WebElement fonte = null;
            try{        
                fonte = edge.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/g-card["+i+"]/div/div/a/div/div[2]/div[1]"));
                System.out.println(fonte.getText());
            }catch(org.openqa.selenium.NoSuchElementException e){
                break;
            }
            // T�tulo                                     //*[@id="rso"]/div[1]/div/g-card[1]/div/div/a/div/div[2]/div[2]
                                                            //*[@id="rso"]/div[1]/div/g-card[1]/div/div/a/div/div[2]/div[2]
            WebElement titulo = edge.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/g-card["+i+"]/div/div/a/div/div[2]/div[2]"));
            System.out.println(titulo.getText());
            // Tempo
            WebElement tempoPublicacao = edge.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/g-card["+i+"]/div/div/a/div/div[2]/div[3]/span/span/span"));
            System.out.println(tempoPublicacao.getText());
            // Link
            String link = edge.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/g-card["+i+"]/div/div/a[@href]")).getAttribute("href");
            System.out.println(link);
            System.out.println();



            // Fonte
//            WebElement fonte = null;
//            try{
//                fonte = edge.findElement(By.xpath("//*[@id=\"rso\"]/div["+i+"]/g-card/div/div/div[2]/a/div/div[2]/div[1]"));
//                System.out.println(fonte.getText());
//            }catch(org.openqa.selenium.NoSuchElementException e){
//                break;
//            }
//            // T�tulo
//            WebElement titulo = edge.findElement(By.xpath("//*[@id=\"rso\"]/div["+i+"]/g-card/div/div/div[2]/a/div/div[2]/div[2]"));
//            System.out.println(titulo.getText());
//            // Tempo
//            WebElement tempoPublicacao = edge.findElement(By.xpath("//*[@id=\"rso\"]/div["+i+"]/g-card/div/div/div[2]/a/div/div[2]/div[3]/div[2]/span/span/span"));
//            System.out.println(tempoPublicacao.getText());
//            // Link
//            String link = edge.findElement(By.xpath("//*[@id=\"rso\"]/div["+i+"]/g-card/div/div/div[2]/a[@href]")).getAttribute("href");
//            System.out.println(link);
//            System.out.println();

            noticias[i-1] = new Noticias(fonte.getText(), titulo.getText(), tempoPublicacao.getText(), link);
        }
        if (noticias != null){
                return noticias;
        }else{
            edge.get("https://bit.ly/3x4HvxN");
            
            for (int i = 1; i <= 4; i++) {
            
//

            // Fonte
            WebElement fonte = null;
            try{        
                fonte = edge.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/g-card["+i+"]/div/div/a/div/div[2]/div[1]"));
                System.out.println(fonte.getText());
            }catch(org.openqa.selenium.NoSuchElementException e){
                break;
            }
            // T�tulo                                     //*[@id="rso"]/div[1]/div/g-card[1]/div/div/a/div/div[2]/div[2]
                                                            //*[@id="rso"]/div[1]/div/g-card[1]/div/div/a/div/div[2]/div[2]
            WebElement titulo = edge.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/g-card["+i+"]/div/div/a/div/div[2]/div[2]"));
            System.out.println(titulo.getText());
            // Tempo
            WebElement tempoPublicacao = edge.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/g-card["+i+"]/div/div/a/div/div[2]/div[3]/span/span/span"));
            System.out.println(tempoPublicacao.getText());
            // Link
            String link = edge.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/g-card["+i+"]/div/div/a[@href]")).getAttribute("href");
            System.out.println(link);
            System.out.println();
            noticias[i-1] = new Noticias(fonte.getText(), titulo.getText(), tempoPublicacao.getText(), link);
        }
            return noticias;
        }
    }

    /**
     * Fun��o principal para coleta de dados a respeito da campanha de vacina��o em todos os estados Brasileiros e mundo
     * e informa��es atualizadas diariamente sobre os status da pandemia de COVID-19.
     * @param args
     */
    public static void main (String[] args) throws IOException{

        System.setProperty("webdriver.edge.driver","chromedriver.exe");

        DadosEstados[] informacoesEstados = getCovidStatus();
        DadosVacina[] informacoesVacina = getVaccineStatus();
        DadosPaises[] informacoesPaises = getCountriesStatus();
        Dados informacoesMundo = getWorldStatus();
        DadosMunicipais informacoesCidade = getCityStatus("S�o Carlos");
        Noticias [] noticiasCovid = coletarNoticias();
    }
}