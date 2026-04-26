/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogorpj_multiplasinterfaces.interfaces.concretas;

import com.mycompany.jogorpj_multiplasinterfaces.abstrata.Personagem;
import com.mycompany.jogorpj_multiplasinterfaces.interfaces.Magia;
import java.util.Random;

/**
 *
 * @author felip
 */
public class Mago extends Personagem implements Magia {

    private Random geradorAtaque = new Random();

    public Mago() {
//        this.nome = nome;
        this.pontoDeVida = 180;
    }

    @Override
    public int lancarFeitico() {
        int dano = geradorAtaque.nextInt(45) + 10;
         System.out.println(this.nome + " lancou um feitico causando " + dano + " de dano!");
        return dano;
    }

    @Override
    public int atacar() {
        return lancarFeitico();
    }

}
