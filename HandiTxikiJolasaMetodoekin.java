/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanerronka1;

import java.util.Random;
import java.util.Scanner;

/**
 * HandiTxikiJolasa metodoak erabiliz berreginda (metodoak main gainetik).
 * @author sanz.fernando
 */
public class HandiTxikiJolasaMetodoekin {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

     //Erabiltzailearen erantzuna eskatzen du (h, t edo b).
    public static String eskatuErantzuna() {
        System.out.print("Nolakoa izango da hurrengo zenbakia? (handiago(h)/txikiago(t)/berdina(b)): ");
        return scanner.nextLine().trim().toLowerCase();
    }

     // 1 eta 10 arteko ausazko zenbaki bat sortzen du.
    public static int sortuZenbakia() {
        return random.nextInt(10) + 1;
    }

     // Hurrengo zenbakia unekoarekin konparatzen du eta dagokion letra bueltatzen du ("h", "t" edo "b").
    public static String kalkulatuErantzunErreala(int unekoZenbakia, int hurrengoZenbakia) {
        if (hurrengoZenbakia > unekoZenbakia) {
            return "h"; // handiago
        } else if (hurrengoZenbakia < unekoZenbakia) {
            return "t"; // txikiago
        } else {
            return "b"; // berdina
        }
    }

    // MAIN METODOA AMAIERAN
    public static void main(String[] args) {
        boolean jokatzen = true;
        int puntuacion = 0;

        int jZenbakia = sortuZenbakia();

        while (jokatzen) {
            System.out.println("Dagoen zenbakia: " + jZenbakia);
            String erantzuna = eskatuErantzuna();

            int hurrengoZen = sortuZenbakia();
            String erantzunErreala = kalkulatuErantzunErreala(jZenbakia, hurrengoZen);

            System.out.println("Hurrengo zenbakia izan da: " + hurrengoZen);

            if (erantzuna.equals(erantzunErreala)) {
                puntuacion++;
                System.out.println("Asmatu duzu, zoaz: " + puntuacion + " asmatuta.\n");
                jZenbakia = hurrengoZen;
            } else {
                System.out.println("Galdu duzu, jokoa itxiko da.");
                System.out.println("Bukaerako puntuazioa: " + puntuacion + " asmatuta.");
                jokatzen = false;
            }
        }
    }
}
