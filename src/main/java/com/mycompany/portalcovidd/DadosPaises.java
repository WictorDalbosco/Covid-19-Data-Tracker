/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portalcovidd;


public class DadosPaises extends Dados {
    String nomePais;
    String casosAtivos;
    DadosEstados[] estados;

    public DadosPaises( String nomePais,String nCasos, String nMortes, String nRecuperados, String casosAtivos) {
        super(nCasos, nMortes, nRecuperados);
        this.nomePais = nomePais;
        this.casosAtivos = casosAtivos;
        this.estados = null;
    }

    public String toString() {
        return "Pais [ "+nomePais+" nCasos: "+ nCasos+ " nmortes: "+nMortes+", nRec: "+ nRecuperados+ " Ativos: "+casosAtivos+"]";
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getCasosAtivos() {
        return casosAtivos;
    }

    public void setCasosAtivos(String casosAtivos) {
        this.casosAtivos = casosAtivos;
    }

    public void setEstados(DadosEstados[] estados){
        this.estados = new DadosEstados[27];

        for(int i = 0; i < 27; i++){
            this.estados[i] = estados[i];
        }
    }
}
