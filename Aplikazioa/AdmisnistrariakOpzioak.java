/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udalekuerronka;

import java.util.ArrayList;
import java.util.Scanner;

public class AdmisnistrariakOpzioak {
    public static final Scanner scanner = new Scanner(System.in);

    public static void erakutsiMenua() {
        System.out.println("\nADMINISTRARI MENUA");
        System.out.println("1. Gehitu Administraria (ADD)");
        System.out.println("2. Ikusi guztiak (VIEW)");
        System.out.println("3. Eguneratu Administraria (UPDATE)");
        System.out.println("4. Ezabatu Administraria (DELETE)");
        System.out.println("5. Irten (EXIT)");
        System.out.print("Aukeratu aukera bat (1-5): ");
    }

    private static int eskatuPosizioa(String akzioa) {
        if (UdalekuMain.listaAdministrarias.isEmpty()) {
            System.out.println("Ez dago administraririk " + akzioa + "ko.");
            return -1;
        }

        System.out.print("Sartu " + akzioa + " nahi duzun administrariaren posizioa (0-" 
                         + (UdalekuMain.listaAdministrarias.size() - 1) + "): ");
        try {
            int pos = Integer.parseInt(scanner.nextLine());
            if (pos >= 0 && pos < UdalekuMain.listaAdministrarias.size()) {
                return pos;
            } else {
                System.out.println("Posizio hori ez da existitzen.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Sartu baliozko zenbaki bat.");
        }
        return -1;
    }

    // 1. ADD
    public static void addAdministraria() {
        System.out.println("--- ADMINISTRARIA BERRIA GEHITU ---");
        Administraria berria = new Administraria();
        berria.setNAN();
        berria.setIzena();
        berria.setAbizena();
        berria.setAdministrariaKod();

        UdalekuMain.listaAdministrarias.add(berria);
        System.out.println("Administraria ondo gehitu da");
    }

    // 2. VIEW (Ikusi guztiak)
    public static void viewAdministrariak() {
        if (UdalekuMain.listaAdministrarias.isEmpty()) {
            System.out.println("Ez dago administraririk zerrendan.");
            return;
        }

        System.out.println("===================================");
        System.out.println("ADMINISTRARI GUZTIAK");
        System.out.println("===================================");
        for (int i = 0; i < UdalekuMain.listaAdministrarias.size(); i++) {
            System.out.println("Posizioa [" + i + "]:");
            UdalekuMain.listaAdministrarias.get(i).getAll();
        }
    }

    // 3. UPDATE
    public static void updateAdministraria() {
        int pos = eskatuPosizioa("eguneratu");
        if (pos != -1) {
            System.out.println("--- DATU BERRIAK SARTU ---");
            Administraria admin = UdalekuMain.listaAdministrarias.get(pos);
            admin.setNAN();
            admin.setIzena();
            admin.setAbizena();
            admin.setAdministrariaKod();
            System.out.println("Administraria ondo eguneratu da!");
        }
    }

    // 4. DELETE
    public static void deleteAdministraria() {
        int pos = eskatuPosizioa("ezabatu");
        if (pos != -1) {
            UdalekuMain.listaAdministrarias.remove(pos);
            System.out.println("Administraria ezabatu da.");
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
                    addAdministraria();
                    break;
                case 2:
                    viewAdministrariak();
                    break;
                case 3:
                    updateAdministraria();
                    break;
                case 4:
                    deleteAdministraria();
                    break;
                case 5:
                    System.out.println("Agur!");
                    break;
                default:
                    System.out.println("Aukera okerra, saiatu berriro.");
                    break;
            }
        } while (aukera != 5);
    }
}