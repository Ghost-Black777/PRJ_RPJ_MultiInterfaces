/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jogorpj_multiplasinterfaces;

import com.mycompany.jogorpj_multiplasinterfaces.abstrata.Personagem;
import com.mycompany.jogorpj_multiplasinterfaces.abstrata.menus.MenuPrincipal;
import com.mycompany.jogorpj_multiplasinterfaces.interfaces.Voar;
import com.mycompany.jogorpj_multiplasinterfaces.interfaces.concretas.Grifo;
import com.mycompany.jogorpj_multiplasinterfaces.interfaces.concretas.Guerreiro;
import com.mycompany.jogorpj_multiplasinterfaces.interfaces.concretas.Mago;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felip
 */
public class JogoRPJ_MultiplasInterfaces {

    public static void main(String[] args) 
    {       
        MenuPrincipal mp = new MenuPrincipal();
        mp.iniciar();
        
//
//        Guerreiro guerreiro = new Guerreiro("Aragorn");
//        Mago mago = new Mago("Behemoth");
//        Grifo grifo = new Grifo("Morfeu");
//        
//     List<Voar> patrulha = new ArrayList<>();
//        patrulha.add(grifo);
//
//        iniciarPatrulhaAeria(patrulha);
//
//        simulaBatalha(guerreiro, new Grifo("Morfeu"));
//        simulaBatalha(mago, new Grifo("Mystifer"));
//
//
//    }
//    
//        private static void iniciarPatrulhaAeria(List<Voar> patrulha) {
//        System.out.println("\n --- PATRULHA AERIA ---");
//
//        for (Voar voador : patrulha) {
//            voador.voar();
//        }
//    }
//
//    public static void simulaBatalha(Personagem p1, Personagem p2) {
//        System.out.println("\n--- BATALHA ---");
//        System.out.println(p1.getNome() + " VS " + p2.getNome());
//
//        int turno = 1;
//
//        while (p1.getPontoDeVida() > 0 && p2.getPontoDeVida() > 0) {
//
//            System.out.println("\n--- Round" + turno +" ---");
//
//            //p1
//            System.out.println(p1.getNome() + " ataca!");
//            int dano1 = p1.atacar();
//            p2.receberDano(dano1);
//
//            //verifica se p2 morreu
//            if (p2.getPontoDeVida() <= 0) {
//                System.out.println(p1.getNome() + " venceu!");
//                break;
//            }
//
//            //p2
//            System.out.println(p2.getNome() + " ataca!");
//            int dano2 = p2.atacar();
//            p1.receberDano(dano2);
//
//            //verifica se p1 morreu
//            if (p1.getPontoDeVida() <= 0) {
//                System.out.println(p2.getNome() + " venceu!");
//                break;
//            }
//            turno++;
//        }
//        System.out.println("\n --- FIM DA BATALHA ---");
    }  

}
