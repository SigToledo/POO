package com.company;

import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

/**
 * Crie um programa onde o usuário entre com um número e ele diga se ele é par ou impar
 */

public class ParOuImpar {

    public static void main(String[] args) {

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));

        if(num % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número " + num + " é par!");
        }else{
            JOptionPane.showMessageDialog(null, "O número " + num + " é impar!");
        }
    }
}
