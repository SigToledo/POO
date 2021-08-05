package com.company;

import java.util.Scanner;

/**
 * Crie um programa onde o usuário entre com 3 números e ele imprime a média dos números
 */

public class Media {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.print("Digite a nota 1: ");
        nota1 = leitor.nextFloat();

        System.out.print("Digite a nota 2: ");
        nota2 = leitor.nextFloat();

        System.out.print("Digite a nota 3: ");
        nota3 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3)/3;
        System.out.print("A média dos 3 números é: " + media);
        leitor.close();
    }
}