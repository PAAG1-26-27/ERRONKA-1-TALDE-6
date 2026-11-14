package com.mycompany.udalekuerronka;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Aukerak gazteak kudeatzeko.
 * Administrarien menuaren egitura bera erabiltzen du.
 */
public class Test_Gaztea {
    private static final Scanner scanner = AdmisnistrariakOpzioak.scanner;

    public static void erakutsiMenua() {
        System.out.println("\nGAZTEEN MENUA");
        System.out.println("1. Gehitu gaztea (ADD)");
        System.out.println("2. Ikusi guztiak (VIEW)");
        System.out.println("3. Eguneratu gaztea (UPDATE)");
        System.out.println("4. Ezabatu gaztea (DELETE)");
        System.out.println("5. Irten (EXIT)");
        System.out.print("Aukeratu aukera bat (1-5): ");
    }

    private static int eskatuPosizioa(String ekintza) {
        if (UdalekuMain.listaGazteak.isEmpty()) {
            System.out.println("Ez dago gazterik " + ekintza + "ko.");
            return -1;
        }

        System.out.print("Sartu " + ekintza + " nahi duzun gaztearen posizioa (0-"
                + (UdalekuMain.listaGazteak.size() - 1) + "): ");

        try {
            int posizioa = Integer.parseInt(scanner.nextLine());
            if (posizioa >= 0 && posizioa < UdalekuMain.listaGazteak.size()) {
                return posizioa;
            }
            System.out.println("Posizio hori ez da existitzen.");
        } catch (NumberFormatException e) {
            System.out.println("Sartu baliozko zenbaki bat.");
        }
        return -1;
    }

    public static void addGaztea() {
        System.out.println("--- GAZTE BERRIA GEHITU ---");
        Gaztea gazteBerria = new Gaztea();
        gazteBerria.setNAN();
        gazteBerria.setIzena();
        gazteBerria.setAbizena();
        gazteBerria.setGazteaKod();
        gazteBerria.setGurazoZenabakia();
        UdalekuMain.listaGazteak.add(gazteBerria);
        System.out.println("Gaztea ondo gehitu da.");
    }

    public static void viewGazteak() {
        if (UdalekuMain.listaGazteak.isEmpty()) {
            System.out.println("Ez dago gazterik zerrendan.");
            return;
        }

        System.out.println("GAZTE GUZTIAK");
        for (int i = 0; i < UdalekuMain.listaGazteak.size(); i++) {
            System.out.println("Posizioa [" + i + "]:");
            UdalekuMain.listaGazteak.get(i).getAll();
        }
    }

    public static void updateGaztea() {
        int posizioa = eskatuPosizioa("eguneratu");
        if (posizioa != -1) {
            System.out.println("--- DATU BERRIAK SARTU ---");
            Gaztea gaztea = UdalekuMain.listaGazteak.get(posizioa);
            gaztea.setNAN();
            gaztea.setIzena();
            gaztea.setAbizena();
            gaztea.setGazteaKod();
            gaztea.setGurazoZenabakia();
            System.out.println("Gaztea ondo eguneratu da.");
        }
    }

    public static void deleteGaztea() {
        int posizioa = eskatuPosizioa("ezabatu");
        if (posizioa != -1) {
            UdalekuMain.listaGazteak.remove(posizioa);
            System.out.println("Gaztea ezabatu da.");
        }
    }

    public static void main(String[] args) {
        int aukera = 0;

        do {
            erakutsiMenua();
            try {
                aukera = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                aukera = 0;
            }

            switch (aukera) {
                case 1:
                    addGaztea();
                    break;
                case 2:
                    viewGazteak();
                    break;
                case 3:
                    updateGaztea();
                    break;
                case 4:
                    deleteGaztea();
                    break;
                case 5:
                    System.out.println("Agur!");
                    break;
                default:
                    System.out.println("Aukera okerra, saiatu berriro.");
            }
        } while (aukera != 5);
    }
}
