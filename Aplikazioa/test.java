package com.mycompany.udalekuerronka;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Aukerak ekintzak kudeatzeko.
 * Administrarien menuaren egitura bera erabiltzen du.
 */
public class test {
    private static final Scanner scanner = AdmisnistrariakOpzioak.scanner;

    public static void erakutsiMenua() {
        System.out.println("EKINTZEN MENUA");
        System.out.println("1. Gehitu ekintza (ADD)");
        System.out.println("2. Ikusi guztiak (VIEW)");
        System.out.println("3. Eguneratu ekintza (UPDATE)");
        System.out.println("4. Ezabatu ekintza (DELETE)");
        System.out.println("5. Irten (EXIT)");
        System.out.print("Aukeratu aukera bat (1-5): ");
    }

    private static int eskatuPosizioa(String ekintza) {
        if (UdalekuMain.listaEkintzak.isEmpty()) {
            System.out.println("Ez dago ekintzarik " + ekintza + "ko.");
            return -1;
        }

        System.out.print("Sartu " + ekintza + " nahi duzun ekintzaren posizioa (0-"
                + (UdalekuMain.listaEkintzak.size() - 1) + "): ");

        try {
            int posizioa = Integer.parseInt(scanner.nextLine());
            if (posizioa >= 0 && posizioa < UdalekuMain.listaEkintzak.size()) {
                return posizioa;
            }
            System.out.println("Posizio hori ez da existitzen.");
        } catch (NumberFormatException e) {
            System.out.println("Sartu baliozko zenbaki bat.");
        }
        return -1;
    }

    public static void addEkintza() {
        System.out.println("--- EKINTZA BERRIA GEHITU ---");
        Ekintza ekintza = new Ekintza();
        ekintza.setid_ekintza();
        ekintza.setIzena();
        ekintza.setHasieraData();
        UdalekuMain.listaEkintzak.add(ekintza);
        System.out.println("Ekintza ondo gehitu da.");
    }

    public static void viewEkintzak() {
        if (UdalekuMain.listaEkintzak.isEmpty()) {
            System.out.println("Ez dago ekintzarik zerrendan.");
            return;
        }

        System.out.println("===================================");
        System.out.println("EKINTZA GUZTIAK");
        System.out.println("===================================");
        for (int i = 0; i < UdalekuMain.listaEkintzak.size(); i++) {
            System.out.println("Posizioa [" + i + "]:");
            UdalekuMain.listaEkintzak.get(i).getAll();
        }
    }

    public static void updateEkintza() {
        int posizioa = eskatuPosizioa("eguneratu");
        if (posizioa != -1) {
            System.out.println("--- DATU BERRIAK SARTU ---");
            Ekintza ekintza = UdalekuMain.listaEkintzak.get(posizioa);
            ekintza.setid_ekintza();
            ekintza.setIzena();
            ekintza.setHasieraData();
            System.out.println("Ekintza ondo eguneratu da.");
        }
    }

    public static void deleteEkintza() {
        int posizioa = eskatuPosizioa("ezabatu");
        if (posizioa != -1) {
            UdalekuMain.listaEkintzak.remove(posizioa);
            System.out.println("Ekintza ezabatu da.");
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
                    addEkintza();
                    break;
                case 2:
                    viewEkintzak();
                    break;
                case 3:
                    updateEkintza();
                    break;
                case 4:
                    deleteEkintza();
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
