/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portalcovidd;

/**
 *
 * @author mathe
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Noticias {
    String fonte;
    String titulo;
    String tempoPublicacao;
    String link;

    public Noticias(){}

    public Noticias(String fonte, String titulo, String tempoPublicacao, String link){
        this.fonte = fonte;
        this.titulo = titulo;
        this.tempoPublicacao = tempoPublicacao;
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTempoPublicacao() {
        return tempoPublicacao;
    }

    public void setTempoPublicacao(String tempoPublicacao) {
        this.tempoPublicacao = tempoPublicacao;
    }
}