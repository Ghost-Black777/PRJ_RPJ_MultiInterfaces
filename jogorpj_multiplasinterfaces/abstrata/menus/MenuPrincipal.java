
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs:v//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogorpj_multiplasinterfaces.abstrata.menus;

import com.mycompany.jogorpj_multiplasinterfaces.abstrata.Personagem;
import com.mycompany.jogorpj_multiplasinterfaces.interfaces.concretas.Grifo;
import com.mycompany.jogorpj_multiplasinterfaces.interfaces.concretas.Guerreiro;
import com.mycompany.jogorpj_multiplasinterfaces.interfaces.concretas.Mago;
import java.util.Scanner;

/**
 *
 * @author felip
 */
public class MenuPrincipal {

    private Scanner scan = new Scanner(System.in);

    public void iniciar() {

        int opcao = 0;
        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Iniciar batalha");
            System.out.println("2. Encerrar");
            System.out.println("Escolha uma opcao: ");

            try {
                opcao = Integer.parseInt(scan.nextLine().trim());

            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida! Digite apenas números: ");
                continue;
            }

            switch (opcao) {
                case 1:
                    configurarBatalha();
                    break;
                case 2:
                    System.out.println("Encerrando o jogo. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha 1 ou 2.");
                    break;
            }

        } while (opcao != 2);

    }

    private void configurarBatalha() {

        System.out.println("\n--- MENU DE JOGO ---");
        System.out.println("1. Jogador VS Maquina");
        System.out.println("2. Jogador VS P2");
        System.out.println("Escolha o modo:");

        int modo = 0;
        try {
            modo = Integer.parseInt(scan.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Modo invalido. Retornando ao menu principal...");
            return;
        }
        System.out.println("\n--- JOGADOR 1 ---");
        System.out.println("Digite o nome do personagem: ");
        String nomeP1 = scan.nextLine();

        Personagem p1 = escolherEInstanciarClasse();
        p1.setNome(nomeP1);

        Personagem p2;

        if (modo == 2) {
            System.out.println("\n--- JOGADOR 2 ---");
            System.out.println("Digite o nome do personagem: ");
            String nomeP2 = scan.nextLine();

            p2 = escolherEInstanciarClasse();
            p2.setNome(nomeP2);

        } else if (modo == 1) {
            p2 = gerarInimigoAleatorio();
            p2.setNome("Maquina");

        } else {
            System.out.println("Opcao invalida! Retornando ao menu...");
            return;
        }
        System.out.println("\n--->> BATALHA CONFIGURADA: " + p1.getNome() + " VS " + p2.getNome() + "<<---");

        iniciarCombate(p1, p2);

    }

    private Personagem escolherEInstanciarClasse() {
        while (true) {
            System.out.println("\nEscolha a classe:");
            System.out.println("1. Guerreiro");
            System.out.println("2. Mago");
            System.out.println("3. Grifo");

            int opcao = 0;

            try {
                opcao = Integer.parseInt(scan.nextLine().trim());

                switch (opcao) {
                    case 1:
                        return new Guerreiro();
                    case 2:
                        return new Mago();
                    case 3:
                        return new Grifo();
                    default:
                        System.out.println("Opcao invalida!");
                        break;
                }

            } catch (Exception e) {
                System.out.print("Entrada inválida! Digite apenas números: ");
                continue;
            }
        }
    }
//escolha da maquina aleatoriamente.

    private Personagem gerarInimigoAleatorio() {
        int aleatorio = (int) (Math.random() * 3) + 1;

        switch (aleatorio) {
            case 1:
                return new Guerreiro();
            case 2:
                return new Mago();
            default:
                return new Grifo();
        }
    }

    private void iniciarCombate(Personagem p1, Personagem p2) {
        System.out.println("\n--- BATALHA ---");
        System.out.println(p1.getNome() + " (" + p1.getClass().getSimpleName()
        + ") VS " + p2.getNome() + " (" + p2.getClass().getSimpleName() + ")");
        int turno = 1;
        System.out.println("VIDA INICIAL:");
        System.out.println(p1.getNome() + ": " + p1.getPontoDeVida());
        System.out.println(p2.getNome() + ": " + p2.getPontoDeVida());

        while (p1.getPontoDeVida() > 0 && p2.getPontoDeVida() > 0) {

            System.out.println("\n--- Round " + turno + " ---");

            //p1
            System.out.println(p1.getNome() + " ataca!");
            int dano1 = p1.atacar();
            p2.receberDano(dano1);

            //verifica se p2 morreu
            if (p2.getPontoDeVida() <= 0) {
                System.out.println(p1.getNome() + " venceu!");
                break;
            }

            //p2
            System.out.println(p2.getNome() + " ataca!");
            int dano2 = p2.atacar();
            p1.receberDano(dano2);

            //verifica se p1 morreu
            if (p1.getPontoDeVida() <= 0) {
                System.out.println(p2.getNome() + " venceu!");
                break;
            }
            turno++;
        }
        System.out.println("\n --- FIM DA BATALHA ---");
    }
}
