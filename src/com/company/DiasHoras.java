package com.company;

import java.util.Scanner;

/**
 * Crie um programa onde o usuário entre com o número de dias e ele converta para segundos
 */

public class DiasHoras {

    public static void main(String[] args) {

        int dias, diasEmSegundos;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de dia(s): ");
        dias = leitor.nextInt();

        diasEmSegundos = dias * 86400;
        System.out.print("Dia(s) em segundos: " + diasEmSegundos);

        leitor.close();
    }
}
