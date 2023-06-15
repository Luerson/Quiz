package main;

import quiz.Quiz;

import java.util.*;
public class UsaQuiz {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Scanner sc = new Scanner(System.in);
        Character jogar_novamente = 'a';
        int i = 0;

        try {

            do {
                if(i == 0)
                    cadastraUsuario(sc, quiz);
                else
                    quiz.selecionaQuestoes();
                Jogo(sc, quiz);
                Resultados(quiz, sc);

                i++;

                quiz.usuarios[0].setPontuacao(0);
                quiz.usuarios[1].setPontuacao(0);

                if(i == 2)
                    System.out.println("Vocês já jogaram todas as rodadas possíveis!");
                else {
                    System.out.print("Vocês desejam jogar novamente?\nDigite 's' para sim e 'n' para não\n--> ");
                    jogar_novamente = sc.next().charAt(0);
                    sc.nextLine();
                    if(jogar_novamente!='n')
                        clearScreen();
                }

            } while(i != 2 && jogar_novamente!='n');

            System.out.println("\nSaindo do jogo...");

            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Entrada não condiz com requisitado " + e.getMessage());
        }
    }

    public static void cadastraUsuario(Scanner sc, Quiz quiz) {
        System.out.println("Seja bem-vindo ao Quiz! Antes de iniciar o jogo, precisamos do nome dos jogadores.");

        System.out.print("Digite o nome do(a) jogador(a) 1\n--> ");
        quiz.usuarios[0].setNome(sc.nextLine());
        System.out.print("Digite o nome do(a) jogador(a) 2\n--> ");
        quiz.usuarios[1].setNome(sc.nextLine());
        while(quiz.usuarios[0].getNome().equalsIgnoreCase(quiz.usuarios[1].getNome())) {
            System.out.print("\nOs jogadores não podem ter o mesmo nome.\n\nDigite novamente o nome do jogador 1\n--> ");
            quiz.usuarios[0].setNome(sc.nextLine());
            System.out.print("Digite novamente o nome do jogador 2\n--> ");
            quiz.usuarios[1].setNome(sc.nextLine());
        }

        clearScreen();

    }

    public static void Jogo(Scanner sc, Quiz quiz) {

        int jogador_vez, i;

        System.out.printf("O Quiz vai iniciar! Se preparem, %s e %s, vocês são competidores...\n\nPressionem Enter quando estiverem prontos para jogar.\n", quiz.usuarios[0].getNome(), quiz.usuarios[1].getNome());
        sc.nextLine();
        clearScreen();

        System.out.println("Vamos começar com as perguntas fáceis!\n");

        for(i = 0; i <= 3; i++) {

            if(i % 2 == 0)
                jogador_vez = 0;
            else
                jogador_vez = 1;

            System.out.printf("Vez do(a) jogador(a) %s\n\n",quiz.usuarios[jogador_vez].getNome());

            System.out.println(quiz.perguntasFaceis[i].getTexto());
            quiz.perguntasFaceis[i].escreveAlternativas();
            System.out.print("Resposta: ");
            String resposta = sc.nextLine();

            int resposta_int = ConverteAlternativa(resposta);

            quiz.usuarios[jogador_vez].pontuar(quiz.perguntasFaceis[i], resposta_int);

            if(resposta_int == 5) {
                System.out.printf("\nVocê digitou uma alternativa inválida, %s. Irá perder pontos!\n\nPressione Enter para continuar o jogo.\n", quiz.usuarios[jogador_vez].getNome());
                sc.nextLine();
                clearScreen();
            }
            else
                clearScreen();

        }

        System.out.println("Agora, vamos para as perguntas médias!\n");

        for(i =0; i <= 3; i++) {

            if(i % 2 == 0)
                jogador_vez = 0;
            else
                jogador_vez = 1;

            System.out.printf("Vez do(a) jogador(a) %s\n\n",quiz.usuarios[jogador_vez].getNome());

            System.out.println(quiz.perguntasMedias[i].getTexto());
            quiz.perguntasMedias[i].escreveAlternativas();
            System.out.print("Resposta: ");
            String resposta = sc.nextLine();

            int resposta_int = ConverteAlternativa(resposta);

            quiz.usuarios[jogador_vez].pontuar(quiz.perguntasMedias[i], resposta_int);

            if(resposta_int == 5) {
                System.out.printf("\nVocê digitou uma alternativa inválida, %s. Irá perder pontos!\n\nPressione Enter para continuar o jogo.\n", quiz.usuarios[jogador_vez].getNome());
                sc.nextLine();
                clearScreen();
            }
            else
                clearScreen();

        }

        System.out.println("Está quase acabando! Chegamos nas perguntas difíceis... Boa sorte!\n");

        for(i = 0; i <= 1; i++) {

            if(i % 2 == 0)
                jogador_vez = 0;
            else
                jogador_vez = 1;

            System.out.printf("Vez do(a) jogador(a) %s\n\n",quiz.usuarios[jogador_vez].getNome());

            System.out.println(quiz.perguntasDificeis[i].getTexto());
            quiz.perguntasDificeis[i].escreveAlternativas();
            System.out.print("Resposta: ");
            String resposta = sc.nextLine();

            int resposta_int = ConverteAlternativa(resposta);

            quiz.usuarios[jogador_vez].pontuar(quiz.perguntasDificeis[i], resposta_int);

            if(resposta_int == 5) {
                System.out.printf("\nVocê digitou uma alternativa inválida, %s. Irá perder pontos!\n\nPressione Enter para continuar o jogo.\n", quiz.usuarios[jogador_vez].getNome());
                sc.nextLine();
                clearScreen();
            }
            else
                clearScreen();

        }
    }

    public static int ConverteAlternativa (String resposta) {
        switch (resposta) {
            case "a": return 0;
            case "b": return 1;
            case "c": return 2;
            case "d": return 3;
            case "e": return 4;
            default: return 5;
        }
    }

    public static void Resultados(Quiz quiz, Scanner sc) {
        System.out.println("Parabéns, vocês finalizaram o Quiz!\n");
        System.out.println("Agora, vamos revelar os resultados.\n");

        String espaco = "";

        System.out.printf("%2sJogador%10sPontuação\n\n", espaco,espaco);
        for(int i = 0; i<=1; i++)
            System.out.printf("%8s%15d\n",quiz.usuarios[i].getNome(), quiz.usuarios[i].getPontuacao());

        System.out.println();

        if(quiz.vencedor() == -1)
            System.out.println("Foi um jogo muito acirrado e aconteceu um empate!\n");
        else
            System.out.printf("O(a) vencedor(a) foi... %s! Parabéns!!\n\n", quiz.usuarios[quiz.vencedor()].getNome());

        System.out.println("Pressione Enter para sair dessa página. ");
        sc.nextLine();
        clearScreen();

    }

    public static void clearScreen() {

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
