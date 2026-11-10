/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jolasa;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Moises
 */
public class HarriOrriAr {

    public static void Jolastu(int[] jokalari_irabaziak, int[] makina_irabaziak) {
        Random random = new Random();
        Scanner myobj = new Scanner(System.in);
        int orria = 1;
        int artazia = 2;
        int harria = 3;
        int aukera;
        int aukeraMakina;
        int partidaKopurua;
        int i;
        System.out.println("Zenbat partida jokatu nahi duzu");
        partidaKopurua = myobj.nextInt();
        for (i = 1; i <= partidaKopurua; i++) {
            System.out.println("Partida hauek jokatuko dira:" + partidaKopurua);
            do {

                System.out.println("Aukeratu bat");
                System.out.println("1.orria");
                System.out.println("2.artazia");
                System.out.println("3.harria");
                aukera = myobj.nextInt();
                aukeraMakina = random.nextInt(3) + 1;
                if (aukera == aukeraMakina) {
                    System.out.println("Berdinketa bat egon da, berriz jolastu!");
                }
            } while (aukera == aukeraMakina);

            if (aukera == 1 && aukeraMakina == 2) {

                System.out.println("Makina irabazten du, artazia orriari irabazten dio");

            } else if (aukera == 1 && aukeraMakina == 3) {
                System.out.println("Jokalariak irabazten du, orria harriari irabazten dio");

            } else if (aukera == 2 && aukeraMakina == 3) {
                System.out.println("Makina irabazten du, harria artaziari irabazten dio");

            } else if (aukera == 3 && aukeraMakina == 1) {
                System.out.println("Makina irabazten du,orria harriari irabazten dio ");
            } else if (aukera == 3 && aukeraMakina == 2) {
                System.out.println("Jokalaria irabazten du, harria artaziari irabazten dio");

            } else if (aukera == 2 && aukeraMakina == 1) {
                System.out.println("Jokalaria irabazten du, artazia orriari irabazten dio");

            }

            boolean jirabaziak
                    = (aukera == 1 && aukeraMakina == 3)
                    || (aukera == 2 && aukeraMakina == 1)
                    || (aukera == 3 && aukeraMakina == 2);

            if (jirabaziak) {
                jokalari_irabaziak[0]++;

            } else {
                makina_irabaziak[0]++;
            }
        }

    }

    public static void getIrabaziak(int[] jokalari_irabaziak, int[] makina_irabaziak) {
        System.out.println("Jokalari irabaziak:" + jokalari_irabaziak[0]);
        System.out.println("Makina irabaziak:" + makina_irabaziak[0]);
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int[] jokalari_irabaziak = new int[1];
        int[] makina_irabaziak = new int[1];
        int aukera;

        do {
            System.out.println("Aukeratu bat:");
            System.out.println("1.Jolastu HarriOrriAr:");
            System.out.println("2.Bistaratu irabaziak:");
            System.out.println("3.Programatik atera:");
            aukera = myobj.nextInt();
            switch (aukera) {
                case 1:
                    Jolastu(jokalari_irabaziak, makina_irabaziak);
                    break;
                case 2:
                    getIrabaziak(jokalari_irabaziak, makina_irabaziak);
                    break;
                case 3:
                    System.out.println("Jolasa itxi da!!");
                    break;

            }
        } while (aukera != 3);
    }
}
