package com.company;

import java.util.Scanner;

/**
 * Crie um programa onde o usuário entre com dois números e ele diga qual é maior
 */

public class NumeroMaior {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite n1: ");
        int n1 = leitor.nextInt();

        System.out.print("Digite n2: ");
        int n2 = leitor.nextInt();
        /**
        int maior = Math.max(n1, n2);
        */
        int maior;

        if(n1>n2) {
            maior = n1;
        }else{
            maior = n2;
        }
        System.out.println("Maior:" + maior);

        leitor.close();
    }
}
