/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portalcovidd;

public class DadosVacina {

    String nomeEstado;
    String nVacAplicadas;
    String nVac1Dose;
    String percentPopulcao1dose;
    String nVac2doseOuUnica;
    String percentPopImunizada;
    String vacAplicadasUltimas24hrs;
    String percentDosesUsadas;

    public DadosVacina(String nomeEstado, String nVacAplicadas, String nVac1Dose, String percentPopulcao1dose, String nVac2doseOuUnica, String percentPopImunizada, String vacAplicadasUltimas24hrs, String percentDosesUsadas) {
        this.nomeEstado = nomeEstado;
        this.nVacAplicadas = nVacAplicadas;
        this.nVac1Dose = nVac1Dose;
        this.percentPopulcao1dose = percentPopulcao1dose;
        this.nVac2doseOuUnica = nVac2doseOuUnica;
        this.percentPopImunizada = percentPopImunizada;
        this.vacAplicadasUltimas24hrs = vacAplicadasUltimas24hrs;
        this.percentDosesUsadas = percentDosesUsadas;
    }

    public String toString() {
        return "Estado [ "+nomeEstado+" nVacAplicadas: "+ nVacAplicadas+ " nvac1dose: "+nVac1Dose+", percentPopulcao1dose: "+ percentPopulcao1dose+ " nVac2doseOuUnica: "+nVac2doseOuUnica+", percentPopImunizada: "+ percentPopImunizada+ " vacAplicadasUltimas24hrs: "+vacAplicadasUltimas24hrs+", percentDosesUsadas: "+ percentDosesUsadas+ " ]";
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getnVacAplicadas() {
        return nVacAplicadas;
    }

    public void setnVacAplicadas(String nVacAplicadas) {
        this.nVacAplicadas = nVacAplicadas;
    }

    public String getnVac1Dose() {
        return nVac1Dose;
    }

    public void setnVac1Dose(String nVac1Dose) {
        this.nVac1Dose = nVac1Dose;
    }

    public String getPercentPopulcao1dose() {
        return percentPopulcao1dose;
    }

    public void setPercentPopulcao1dose(String percentPopulcao1dose) {
        this.percentPopulcao1dose = percentPopulcao1dose;
    }

    public String getnVac2doseOuUnica() {
        return nVac2doseOuUnica;
    }

    public void setnVac2doseOuUnica(String nVac2doseOuUnica) {
        this.nVac2doseOuUnica = nVac2doseOuUnica;
    }

    public String getPercentPopImunizada() {
        return percentPopImunizada;
    }

    public void setPercentPopImunizada(String percentPopImunizada) {
        this.percentPopImunizada = percentPopImunizada;
    }

    public String getVacAplicadasUltimas24hrs() {
        return vacAplicadasUltimas24hrs;
    }

    public void setVacAplicadasUltimas24hrs(String vacAplicadasUltimas24hrs) {
        this.vacAplicadasUltimas24hrs = vacAplicadasUltimas24hrs;
    }

    public String getPercentDosesUsadas() {
        return percentDosesUsadas;
    }

    public void setPercentDosesUsadas(String percentDosesUsadas) {
        this.percentDosesUsadas = percentDosesUsadas;
    }
}
