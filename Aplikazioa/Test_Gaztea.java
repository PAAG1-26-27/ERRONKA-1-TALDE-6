/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gazteleku;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Moises
 */
public class Test_Gaztea {

    public static void gehitu_gazteak(ArrayList<Gaztea> gaztea) {
        int aukera;
        Scanner myobj = new Scanner(System.in);
        do {

            Gaztea f1 = new Gaztea();
            f1.setNAN();
            f1.setIzena();
            f1.setAbizena();
            f1.setGazteaKod();
            f1.setGurazoZenabakia();
            gaztea.add(f1);
            System.out.println("Beste bazkidea bat sartzeko 1 sartu");
            aukera = myobj.nextInt();

        } while (aukera == 1);
    }

    public static void delete_gazteak(ArrayList<Gaztea> gaztea, int posizioa) {

        gaztea.remove(posizioa);
        System.out.println("Gaztea ezabatuta ");

    }

    public static void update_gazteak(ArrayList<Gaztea> gaztea, int posizioa) {
        Gaztea f1 = gaztea.get(posizioa);
        System.out.println("Sartu datu berriak:");

        f1.setNAN();
        f1.setIzena();
        f1.setAbizena();
        f1.setGazteaKod();
        f1.setGurazoZenabakia();

        System.out.println("Gazte datuak eguneratu da.");

    }

    public static void get_gazteak(ArrayList<Gaztea> gaztea) {
        for (int i = 0; i < gaztea.size(); i++) {
            gaztea.get(i).getAll();

        }
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        ArrayList<Pertsona> ListaPertsona = new ArrayList<>();
        ArrayList<Gaztea> ListaGaztea = new ArrayList<>();
        int aukera;
        int posizioa;
        do {
            System.out.println("1.Gazteak gehitu");
            System.out.println("2.Gazteak ezabatu ");
            System.out.println("3.Gazteak eguneratu");
            System.out.println("4.Gazteak bistaratu");
             System.out.println("4.Irten programtik");
            aukera = myobj.nextInt();
            switch (aukera) {
                case 1:
                    gehitu_gazteak(ListaGaztea);
                    break;
                case 2:
                    System.out.println("Sartu ezabatu nahi duzun posizioa:");
                    posizioa = myobj.nextInt();
                    delete_gazteak(ListaGaztea, posizioa);
                    break;

                case 3:
                     System.out.println("Sartu eguneratu nahi duzun posizioa:");
                    posizioa = myobj.nextInt();
                    update_gazteak(ListaGaztea, posizioa);
                    break;

                case 4:
                    get_gazteak(ListaGaztea);
                    break;
                case 5: 
                     System.out.println("Programa itxi da.");
                     break;
                     
            }

        } while (aukera != 5);

    }
}
