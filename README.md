# PRJ_RPJ_MultiInterfaces
📌 Descrição

Este projeto consiste na implementação de um sistema simples de RPG em Java, com foco em Programação Orientada a Objetos (POO), utilizando:

Herança
Classes abstratas
Interfaces múltiplas
Polimorfismo

O objetivo é modelar personagens com diferentes habilidades, permitindo simular batalhas e comportamentos específicos como combate, magia e voo.

🗡️ Guerreiro
Herda de Personagem
Implementa CombateCorpoACorpo

Características:

Ataque físico com espada
Chance de causar sangramento

🔮 Mago
Herda de Personagem
Implementa Magia

Características:

Ataques mágicos com alto dano
🦅 Grifo
Herda de Personagem
Implementa CombateCorpoACorpo e Voar

Características:

Ataque com garras
Investida aérea
Pode voar
Possui múltiplas habilidades (classe híbrida)
⚔️ Sistema de Batalha

O sistema permite:

Combate entre dois personagens
Execução em turnos
Cálculo de dano aleatório
Verificação de vitória.
