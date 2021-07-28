/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionecampagna;

/**
 *
 * @author caggi
 */
public class Macchina {
    private String nome;
    private Integer cv;
    private Double cc;
    private Double serbatoio;

    public Macchina(){
        this.nome="";
        this.cv=0;
        this.cc=0.0;
        this.serbatoio=0.0;
    }
    
    public Macchina(String nome, Integer cv, Double cc, Double serbatoio) {
        this.nome = nome;
        this.cv = cv;
        this.cc = cc;
        this.serbatoio = serbatoio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    public Double getCc() {
        return cc;
    }

    public void setCc(Double cc) {
        this.cc = cc;
    }

    public Double getSerbatoio() {
        return serbatoio;
    }

    public void setSerbatoio(Double serbatoio) {
        this.serbatoio = serbatoio;
    }
    
    
    
}
