/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portalcovidd;

/**
/**
 * Essa � a classe sobre os dados do COVID-19 por todas as cidades brasileiras
 *
 * @author Wictor Dalbosco Silva        N�USP 11871027
 * @author Lu�sa Balleroni Shimabucoro  N�USP 11832385
 *
 * @Params:
 *         dataInfo: Informa��es da data de coleta dos dados
 *         nomeCidade: Nome da cidade buscada;
 *         nomeEstado: Nome do estado;
 *         confirmados: Casos confirmados por estado;
 *         confirmadosPor100kHab: Casos confirmado por 100km quadrados;
 *         obitos: N�mero de �bitos;
 *         letalidade: Taxa de letalidade do v�rus;
 *         obitosPor100kHab: Obitos por 100km quadrados;
 */


public class DadosMunicipais {

    String dataInfo;
    String nomeCidade;
    String nomeEstado;
    String confirmados;
    String confirmadosPor100kHab;
    String obitos;
    String letalidade;
    String obitosPor100kHab;

    public DadosMunicipais(String dataInfo, String nomeCidade, String nomeEstado, String confirmados, String confirmadosPor100kHab, String obitos, String letalidade, String obitosPor100kHab) {
        this.dataInfo = dataInfo;
        this.nomeCidade = nomeCidade;
        this.nomeEstado = nomeEstado;
        this.confirmados = confirmados;
        this.confirmadosPor100kHab = confirmadosPor100kHab;
        this.obitos = obitos;
        this.letalidade = letalidade;
        this.obitosPor100kHab = obitosPor100kHab;
    }

    public String toString() {
        return " Nome cidade [ "+nomeCidade+" nomeEstado: "+ nomeEstado+ " data Dado: "+dataInfo+", confirmados: "+ confirmados+ " confirmados 100k hab: "+confirmadosPor100kHab+", obitos: "+ obitos+ " letalidade: "+letalidade+", obitos por 100k hab: "+ obitosPor100kHab+ " ]";
    }

    public String getDataInfo() {
        return dataInfo;
    }

    public void setDataInfo(String dataInfo) {
        this.dataInfo = dataInfo;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getConfirmados() {
        return confirmados;
    }

    public void setConfirmados(String confirmados) {
        this.confirmados = confirmados;
    }

    public String getConfirmadosPor100kHab() {
        return confirmadosPor100kHab;
    }

    public void setConfirmadosPor100kHab(String confirmadosPor100kHab) {
        this.confirmadosPor100kHab = confirmadosPor100kHab;
    }

    public String getObitos() {
        return obitos;
    }

    public void setObitos(String obitos) {
        this.obitos = obitos;
    }

    public String getLetalidade() {
        return letalidade;
    }

    public void setLetalidade(String letalidade) {
        this.letalidade = letalidade;
    }

    public String getObitosPor100kHab() {
        return obitosPor100kHab;
    }

    public void setObitosPor100kHab(String obitosPor100kHab) {
        this.obitosPor100kHab = obitosPor100kHab;
    }
}
