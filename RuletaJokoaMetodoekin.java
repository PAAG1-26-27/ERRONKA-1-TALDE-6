/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lanerronka1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author sanz.fernando
 */
public class RuletaJokoaMetodoekin {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    /**
     * Menua pantailaratzen du.
     */
    public static void erakutsiMenua() {
        System.out.println("\n--- RULETA JOKOA ---");
        System.out.println("Nola jokatu nahi duzu?");
        System.out.println("1.- Kolorez");
        System.out.println("2.- Bakoiti/Bikoiti");
        System.out.println("3.- Zenbakiz");
        System.out.println("4.- Exit");
        System.out.print("Aukeratu zer egin: ");
    }

    /**
     * Erabiltzaileari apustu balioduna eskatzen dio (1 eta dauzkan puntuen artean).
     */
    public static int eskatuApustua(int puntos) {
        int apuesta;
        do {
            System.out.print("Zenbat puntu jokatu nahi dituzu? (1 - " + puntos + "): ");
            apuesta = scanner.nextInt();
        } while (apuesta <= 0 || apuesta > puntos);
        return apuesta;
    }

    /**
     * 1. Aukera: Kolorearen araberako apustua.
     */
    public static int jokatuKolorea(int puntos) {
        int apuesta = eskatuApustua(puntos);

        System.out.println("Ze kolore erabili nahi duzu??");
        System.out.println("1. Gorria");
        System.out.println("2. Beltza");
        System.out.println("3. Berdea");
        System.out.print("Aukeratu kolorea (1-3): ");
        int koloreAukera = scanner.nextInt();

        String aukeratutakoKolorea = "";
        if (koloreAukera == 1) aukeratutakoKolorea = "Gorria";
        else if (koloreAukera == 2) aukeratutakoKolorea = "Beltza";
        else if (koloreAukera == 3) aukeratutakoKolorea = "Berdea";
        else {
            System.out.println("Aukera okerra.");
            return puntos; // Ez da apusturik egiten
        }

        int zenbakiAtera = random.nextInt(37);
        String koloreAtera;
        if (zenbakiAtera == 0) {
            koloreAtera = "Berdea";
        } else if (zenbakiAtera % 2 == 0) {
            koloreAtera = "Beltza";
        } else {
            koloreAtera = "Gorria";
        }

        System.out.println("[RULETA BIRATZEN...]");
        System.out.println("Zenbakia: " + zenbakiAtera + " (" + koloreAtera + ")");

        if (aukeratutakoKolorea.equalsIgnoreCase(koloreAtera)) {
            if (koloreAtera.equals("Berdea")) {
                int irabazia = apuesta * 14;
                puntos += irabazia;
                System.out.println("Berdea atera da! " + irabazia + " puntu irabazi dituzu!");
            } else {
                puntos += apuesta;
                System.out.println("Asmatu duzu! " + apuesta + " puntu irabazi dituzu!");
            }
        } else {
            puntos -= apuesta;
            System.out.println("Galdu duzu... " + apuesta + " puntu galdu dituzu.");
        }

        return puntos;
    }

    /**
     * 2. Aukera: Bakoiti edo bikoitiaren araberako apustua.
     */
    public static int jokatuBakoitiBikoiti(int puntos) {
        int apuesta = eskatuApustua(puntos);

        System.out.println("Ze erabili nahi duzu??");
        System.out.println("1. Bakoiti");
        System.out.println("2. Bikoiti");
        System.out.print("Aukeratu jokaldia (1-2): ");
        int jokaldia = scanner.nextInt();

        String aukeratutakojokaldia = "";
        if (jokaldia == 1) aukeratutakojokaldia = "Bakoiti";
        else if (jokaldia == 2) aukeratutakojokaldia = "Bikoiti";
        else {
            System.out.println("Aukera okerra.");
            return puntos;
        }

        int zenbakiAtera = random.nextInt(37);
        String jokaldiAtera;
        if (zenbakiAtera == 0) {
            jokaldiAtera = "Ezer ez (0)";
        } else if (zenbakiAtera % 2 == 0) {
            jokaldiAtera = "Bikoiti";
        } else {
            jokaldiAtera = "Bakoiti";
        }

        System.out.println("[RULETA BIRATZEN...]");
        System.out.println("Zenbakia: " + zenbakiAtera + " (" + jokaldiAtera + ")");

        if (aukeratutakojokaldia.equals(jokaldiAtera)) {
            puntos += apuesta;
            System.out.println("Asmatu duzu! " + apuesta + " puntu irabazi dituzu.");
        } else {
            puntos -= apuesta;
            System.out.println("Galdu duzu... " + apuesta + " puntu galdu dituzu.");
        }

        return puntos;
    }

    /**
     * 3. Aukera: Zenbaki zehatz baten araberako apustua.
     */
    public static int jokatuZenbakia(int puntos) {
        int apuesta = eskatuApustua(puntos);
        int aukeratutakoZenbakia;

        do {
            System.out.print("Zein zenbakiri jokatu nahi diozu? (0 - 36): ");
            aukeratutakoZenbakia = scanner.nextInt();
            if (aukeratutakoZenbakia < 0 || aukeratutakoZenbakia > 36) {
                System.out.println("Zenbakia 0 eta 36 artekoa izan behar da!");
            }
        } while (aukeratutakoZenbakia < 0 || aukeratutakoZenbakia > 36);

        int zenbakiAtera = random.nextInt(37);

        System.out.println("[RULETA BIRATZEN...]");
        System.out.println("Zenbakia: " + zenbakiAtera);

        if (aukeratutakoZenbakia == zenbakiAtera) {
            int irabazia = apuesta * 35;
            puntos += irabazia;
            System.out.println("Zorionak! Zenbaki zehatza asmatu duzu! " + irabazia + " puntu irabazi dituzu!");
        } else {
            puntos -= apuesta;
            System.out.println("Ez duzu asmatu... " + apuesta + " puntu galdu dituzu.");
        }

        return puntos;
    }

    // MAIN METODOA AMAIERAN
    public static void main(String[] args) {
        int puntos = 100;
        int aukera;

        do {
            if (puntos <= 0) {
                System.out.println("\nEz daukazu punturik jokatzeko! Jokoa amaitu da.");
                break;
            }

            erakutsiMenua();
            aukera = scanner.nextInt();

            switch (aukera) {
                case 1:
                    puntos = jokatuKolorea(puntos);
                    break;
                case 2:
                    puntos = jokatuBakoitiBikoiti(puntos);
                    break;
                case 3:
                    puntos = jokatuZenbakia(puntos);
                    break;
                case 4:
                    System.out.println("Eskerrik asko jokatzeagatik! Azken puntuazioa: " + puntos);
                    break;
                default:
                    System.out.println("Aukera okerra, saiatu berriro.");
                    break;
            }
        } while (aukera != 4);
    }
}