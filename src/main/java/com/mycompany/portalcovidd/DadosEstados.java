/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portalcovidd;


public class DadosEstados extends Dados{

    String uid;
    String uf;
    String state;
    String cases;
    String deaths;
    String suspects;
    String refuses;
    String datetime;
    DadosVacina infoVacinas;

    public DadosEstados(){}

    public DadosEstados( String uid, String uf, String state, String cases, String deaths, String suspects, String refuses, String datetime) {
        super(cases, deaths, "0");
        this.uid = uid;
        this.uf = uf;
        this.state = state;
        this.suspects = suspects;
        this.refuses = refuses;
        this.datetime = datetime;
        infoVacinas = null;
    }

    public String toString() {
        return "Estado [ UID: "+uid+" UF: "+ uf+ " Estado: "+state+", Casos: "+ cases+ " Mortes: "+deaths+", Suspeitos: "+ suspects+ " Refuses: "+refuses+", Datetime: "+ datetime+ " ]";
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getSuspects() {
        return suspects;
    }

    public void setSuspects(String suspects) {
        this.suspects = suspects;
    }

    public String getRefuses() {
        return refuses;
    }

    public void setRefuses(String refuses) {
        this.refuses = refuses;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public void setInfoVacinas(DadosVacina info){
        this.infoVacinas = info;
    }
}
