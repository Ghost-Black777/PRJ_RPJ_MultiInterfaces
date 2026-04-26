/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogorpj_multiplasinterfaces.interfaces.concretas;

import com.mycompany.jogorpj_multiplasinterfaces.abstrata.Personagem;
import com.mycompany.jogorpj_multiplasinterfaces.interfaces.CombateCorpoACorpo;
import java.util.Random;

/**
 *
 * @author felip
 */
public class Guerreiro extends Personagem implements CombateCorpoACorpo {

    private Random geradorAtaque = new Random();

    public Guerreiro() {
        
//        this.nome = nome;
        this.pontoDeVida = 220;
    }

    @Override
    public int usarArma() {
        int danoBase = geradorAtaque.nextInt(35) + 1; //gera um ataque de 1 a 35
        int danoTotal = danoBase;
        
        System.out.println(this.nome + " Causou com ataque de espada: "
        + danoBase + " de dano fisico!");
        
        boolean sangramento = geradorAtaque.nextInt(100) < 10;
        
        if(sangramento){
            int danoSangramento = 10;
            danoTotal += danoSangramento;
            System.out.println("Corte da espada causou sangramernto!");
            System.out.println("O alvo sofreu +" + danoSangramento + " de dano por Sangramento!");
        }
        return danoTotal;
    }

    @Override
    public int atacar() {
        return usarArma();
    }

}
