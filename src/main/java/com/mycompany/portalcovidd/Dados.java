package com.mycompany.portalcovidd;

/**
 * Essa � a classe sobre os dados do COVID-19 do mundo
 *
 * @author Wictor Dalbosco Silva        N�USP 11871027
 * @author Lu�sa Balleroni Shimabucoro  N�USP 11832385
 *
 * @Params:
 *         nCasos: N�mero de casos totais no mundo
 *         nMortes: N�mero totais de �bitos no mundo
 *         nRecuperados: N�mero total de pessoas recuperadas do v�rus
 */
public class Dados {
    String nCasos;
    String nMortes;
    String nRecuperados;

    public Dados(){}

    public Dados(String nCasos, String nMortes, String nRecuperados) {
        this.nCasos = nCasos;
        this.nMortes = nMortes;
        this.nRecuperados = nRecuperados;
    }

    public String toString() {
        return "Mundo [ nCasos: "+ nCasos+ " nmortes: "+nMortes+", nRec: "+ nRecuperados+ "]";
    }

    public String getnCasos() {
        return nCasos;
    }

    public void setnCasos(String nCasos) {
        this.nCasos = nCasos;
    }

    public String getnMortes() {
        return nMortes;
    }

    public void setnMortes(String nMortes) {
        this.nMortes = nMortes;
    }

    public String getnRecuperados() {
        return nRecuperados;
    }

    public void setnRecuperados(String nRecuperados) {
        this.nRecuperados = nRecuperados;
    }
}
