package com.company;

/**
 * Crie um programa onde o usuário entre com um número e ele calcula o fatorial dele
 */

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero, fatorial=1;

        System.out.print("Digite um número para saber o seu fatorial: ");
        numero = leitor.nextInt();

        if(numero >= 0) {
            for(int i = 1; i <= numero; i++){
                fatorial = fatorial * i;
            }
            System.out.print("Fatorial do número " + numero + " é: " + fatorial);
        }else{
            System.out.print("Informe um número inteiro a partir de zero!");
        }
    }
}
