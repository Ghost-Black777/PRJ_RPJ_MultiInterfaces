/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogorpj_multiplasinterfaces.abstrata;

/**
 *
 * @author felip
 */
public abstract class Personagem {

    protected String nome;
    protected int pontoDeVida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontoDeVida() {
        return pontoDeVida;
    }

    public void setPontoDeVida(int pontoDeVida) {
        this.pontoDeVida = pontoDeVida;
    }

    public void receberDano(int dano) {
       
        pontoDeVida = pontoDeVida - dano;
        
        if(this.pontoDeVida < 0){
            this.pontoDeVida = 0;
        }
        
        System.out.println(this.nome + " recebeu " + dano + " de dano! (HP restante: " + this.pontoDeVida + ")");
        
        if(this.pontoDeVida == 0){
            System.out.println(this.nome + "foi derrotado!");
        }
    }

    public abstract int atacar();
    

}