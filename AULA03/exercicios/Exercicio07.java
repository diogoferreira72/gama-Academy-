package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int media;
        int turma;
        int alunos;
        double mediaTurma = 0;
        double mediaGeral = 0;

        turma = 2;
        alunos = 2;

        for (int i = 1; i <= turma; i++) {
            mediaTurma = 0;
            for (int j = 1; j <= alunos; j++) {
                System.out.println("Digite a nota do aluno " + j + " da sala " + i);
                media = teclado.nextInt();
                mediaTurma = mediaTurma + media;
            }
            System.out.println("Media da turma " + i + " é igual: " + mediaTurma / alunos);
            mediaGeral = mediaGeral + mediaTurma;
        }
        mediaGeral = mediaGeral / turma;
        System.out.println("A média geral das turmas é: " + mediaGeral);

        teclado.close();
    }

}
