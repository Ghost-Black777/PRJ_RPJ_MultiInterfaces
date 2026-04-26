/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogorpj_multiplasinterfaces.interfaces.concretas;

import com.mycompany.jogorpj_multiplasinterfaces.abstrata.Personagem;
import com.mycompany.jogorpj_multiplasinterfaces.interfaces.CombateCorpoACorpo;
import com.mycompany.jogorpj_multiplasinterfaces.interfaces.Voar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Grifo extends Personagem implements CombateCorpoACorpo, Voar {

    private Random geradorAtaque = new Random();

    public Grifo() {
//        this.nome = nome;
        this.pontoDeVida = 240;
    }

    public int investidaaeria() {

        int dano = geradorAtaque.nextInt(20) + 5;
        System.out.println(this.nome + " Causou com Investida Aerea: "
                + dano + " de dano!");
        return dano;
    }

    @Override
    public void voar() {
        System.out.println(this.nome + " Esta voando");
    }

    @Override
    public int usarArma() {
        int danoBase = geradorAtaque.nextInt(28) + 1;
        int danoTotal = danoBase;

        System.out.println(this.nome + " Causou com ataque de Garras: "
                + danoBase + " de dano!");

        boolean sangramento = geradorAtaque.nextInt(100) < 15;

        if (sangramento) {
            int danoSangramento = 25;
            danoTotal += danoSangramento;
            System.out.println("Corte das garras causou sangramernto!");
            System.out.println("O alvo sofreu +" + danoSangramento + " de dano por Sangramento!");
        }

        return danoTotal;
    }
    
    // SE CASO IMPLEMENTAR INTERACAO
//    @Override
//    public int atacar() {
//
//        Scanner opcao = new Scanner(System.in);
//
//        System.out.println("\n Escolha seu ataque:");
//        System.out.println("1 - Investida aeria:");
//        System.out.println("2 - Garras Afiadas:");
//
//        int escolha = opcao.nextInt();
//
//        if (escolha == 1) {
//            return investidaaeria();
//        } else if (escolha == 2) {
//            return usarArma();
//
//        } else {
//            System.out.println("Opcao invalida! digite novamente");
//            return atacar();
//        }
//    }
    
    @Override
public int atacar() {

    int escolha = geradorAtaque.nextInt(2) + 1; // 1 ou 2

    if (escolha == 1) {
        System.out.println(this.nome + " escolheu atacar com Investida Aeria");
        return investidaaeria();
    } else {
        System.out.println(this.nome + " escolheu atacar com Garras");
        return usarArma();
    }
}

}
