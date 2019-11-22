/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        final int CUENTA_INI = 1;   // Para numero de dias
        final int CUENTA_FIN = 7;   // Para numero de dias
        int dia1 = 0;
        int dia2 = 0;
        int dia3 = 0;
        int dia4 = 0;
        int dia5 = 0;
        int dia6 = 0;
        int dia7 = 0;
        int lluvia;
        int dia;
        int lluviaTotal = 0;
        int lluviaMedia = 0;
        int mayorLluvia = 0;
        int menorLluvia = 501;
        int diaMayor = 0;
        int diaMenor = 0;

        // CABECERA 
        System.out.println("INFORMACION SEMANAL DE LLUVIA");
        System.out.println("=============================");

        // BUCLE cuenta los dias
        for (dia = CUENTA_INI; dia < CUENTA_FIN + 1; dia++) {
            lluvia = RND.nextInt(500 - 0 + 1) + 0; // [MIN .. MAX]

            System.out.printf("Lluvia durante dia %d...: %03d l/m2%n", dia, lluvia);

            // GUARDAR VALORES DE LA SEMANA
            if (dia == 1) {
                dia1 = lluvia;
            }
            if (dia == 2) {
                dia2 = lluvia;
            }
            if (dia == 3) {
                dia3 = lluvia;
            }
            if (dia == 4) {
                dia4 = lluvia;
            }
            if (dia == 5) {
                dia5 = lluvia;
            }
            if (dia == 6) {
                dia6 = lluvia;
            }
            if (dia == 7) {
                dia7 = lluvia;
            }
        }

        // LLUVIA TOTAL
        lluviaTotal = dia1 + dia2 + dia3 + dia4 + dia5 + dia6 + dia7;

        //LLUVIA MEDIA
        lluviaMedia = lluviaTotal / 7;

        System.out.println("---");
        System.out.printf("Lluvia total semanal...: %03d l/m2%n", lluviaTotal);
        System.out.println("---");
        System.out.printf("Media diaria de lluvia.: %03d l/m2%n", lluviaMedia);

        // MAYOR ACUMULACION
        if (dia1 > mayorLluvia) {
            mayorLluvia = dia1;
        }
        if (dia2 > mayorLluvia) {
            mayorLluvia = dia2;
        }
        if (dia3 > mayorLluvia) {
            mayorLluvia = dia3;
        }
        if (dia4 > mayorLluvia) {
            mayorLluvia = dia4;
        }
        if (dia5 > mayorLluvia) {
            mayorLluvia = dia5;
        }
        if (dia6 > mayorLluvia) {
            mayorLluvia = dia6;
        }
        if (dia7 > mayorLluvia) {
            mayorLluvia = dia7;
        }

        // SABER EL DIA DE MAS LLUVIA
        if (mayorLluvia == dia1) {
            diaMayor = 1;
        }
        if (mayorLluvia == dia2) {
            diaMayor = 2;
        }
        if (mayorLluvia == dia3) {
            diaMayor = 3;
        }
        if (mayorLluvia == dia4) {
            diaMayor = 4;
        }
        if (mayorLluvia == dia5) {
            diaMayor = 5;
        }
        if (mayorLluvia == dia6) {
            diaMayor = 6;
        }
        if (mayorLluvia == dia7) {
            diaMayor = 7;
        }

        // MENOS ACUMULACION
        if (dia1 < menorLluvia) {
            menorLluvia = dia1;
        }
        if (dia2 < menorLluvia) {
            menorLluvia = dia2;
        }
        if (dia3 < menorLluvia) {
            menorLluvia = dia3;
        }
        if (dia4 < menorLluvia) {
            menorLluvia = dia4;
        }
        if (dia5 < menorLluvia) {
            menorLluvia = dia5;
        }
        if (dia6 < menorLluvia) {
            menorLluvia = dia6;
        }
        if (dia7 < menorLluvia) {
            menorLluvia = dia7;
        }

        // SABER DIA DE MENOS LLUVIA
        if (menorLluvia == dia1) {
            diaMenor = 1;
        }
        if (menorLluvia == dia2) {
            diaMenor = 2;
        }
        if (menorLluvia == dia3) {
            diaMenor = 3;
        }
        if (menorLluvia == dia4) {
            diaMenor = 4;
        }
        if (menorLluvia == dia5) {
            diaMenor = 5;
        }
        if (menorLluvia == dia6) {
            diaMenor = 6;
        }
        if (menorLluvia == dia7) {
            diaMenor = 7;
        }

        System.out.println("---");
        System.out.printf("El dia %d fue el de mas precipitacion: %03d l/m2%n", diaMayor, mayorLluvia);
        System.out.println("---");
        System.out.printf("El dia %d fue el de menor precipitacion: %03d l/m2%n", diaMenor, menorLluvia);

    }

}
