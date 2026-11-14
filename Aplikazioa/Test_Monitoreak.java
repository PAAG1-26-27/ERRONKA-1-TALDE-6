package com.mycompany.udalekuerronka;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Aukerak monitoreak kudeatzeko.
 * Administrarien menuaren egitura bera erabiltzen du.
 */
public class Test_Monitoreak {
    private static final Scanner scanner = AdmisnistrariakOpzioak.scanner;

    public static void erakutsiMenua() {
        System.out.println("\nMONITOREEN MENUA");
        System.out.println("1. Gehitu monitorea (ADD)");
        System.out.println("2. Ikusi guztiak (VIEW)");
        System.out.println("3. Eguneratu monitorea (UPDATE)");
        System.out.println("4. Ezabatu monitorea (DELETE)");
        System.out.println("5. Irten (EXIT)");
        System.out.print("Aukeratu aukera bat (1-5): ");
    }

    private static int eskatuPosizioa(String ekintza) {
        if (UdalekuMain.listaMonitoreak.isEmpty()) {
            System.out.println("Ez dago monitorerik " + ekintza + "ko.");
            return -1;
        }

        System.out.print("Sartu " + ekintza + " nahi duzun monitorearen posizioa (0-"
                + (UdalekuMain.listaMonitoreak.size() - 1) + "): ");

        try {
            int posizioa = Integer.parseInt(scanner.nextLine());
            if (posizioa >= 0 && posizioa < UdalekuMain.listaMonitoreak.size()) {
                return posizioa;
            }
            System.out.println("Posizio hori ez da existitzen.");
        } catch (NumberFormatException e) {
            System.out.println("Sartu baliozko zenbaki bat.");
        }
        return -1;
    }

    public static void addMonitorea() {
    System.out.println("--- MONITORE BERRIA GEHITU ---");

    Monitoreak berria = new Monitoreak();

    berria.setNAN();
    berria.setIzena();
    berria.setAbizena();
    berria.setMonitorKod();

    UdalekuMain.listaMonitoreak.add(berria);

    System.out.println("Monitorea ondo gehitu da");
}
    public static void viewMonitoreak() {
    if (UdalekuMain.listaMonitoreak.isEmpty()) {
        System.out.println("Ez dago monitorerik zerrendan.");
        return;
    }

    System.out.println("===================================");
    System.out.println("MONITORE GUZTIAK");
    System.out.println("===================================");

    for (int i = 0; i < UdalekuMain.listaMonitoreak.size(); i++) {
        System.out.println("Posizioa [" + i + "]:");
        UdalekuMain.listaMonitoreak.get(i).getAll();
    }
}

    public static void updateMonitorea() {
    int pos = eskatuPosizioa("eguneratu");

    if (pos != -1) {
        System.out.println("--- DATU BERRIAK SARTU ---");

        Monitoreak monitorea = UdalekuMain.listaMonitoreak.get(pos);

        monitorea.setNAN();
        monitorea.setIzena();
        monitorea.setAbizena();
        monitorea.setMonitorKod();

        System.out.println("Monitorea ondo eguneratu da!");
    }
}

    public static void deleteMonitorea() {
    int pos = eskatuPosizioa("ezabatu");

    if (pos != -1) {
        UdalekuMain.listaMonitoreak.remove(pos);

        System.out.println("Monitorea ezabatu da.");
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
                    addMonitorea();
                    break;
                case 2:
                    viewMonitoreak();
                    break;
                case 3:
                    updateMonitorea();
                    break;
                case 4:
                    deleteMonitorea();
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
