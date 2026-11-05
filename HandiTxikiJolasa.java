/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanerronka1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author sanz.fernando
 */
public class HandiTxikiJolasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean jokatzen = true;
        int puntuacion = 0;

        int Jzenbakia = random.nextInt(10) + 1;

        while (jokatzen) {
            System.out.println("Dagoen zenbakia: " + Jzenbakia);
            System.out.print("Nolakoa izango da hurrengo zenbakia? (handiago(h)/txikiago(t)/berdina(b)): ");
            String erantzuna = scanner.nextLine().trim().toLowerCase();

            int HurrengoZen = random.nextInt(10) + 1;

            String ErantzunErreala;
            if (HurrengoZen > Jzenbakia) {
                ErantzunErreala = "h"; // handiago
            } else if (HurrengoZen < Jzenbakia) {
                ErantzunErreala = "t"; // txikiago
            } else {
                ErantzunErreala = "b"; // berdina
            }

            System.out.println("Hurrengo zenbakia izan da: " + HurrengoZen);

            if (erantzuna.equals(ErantzunErreala)) {
                puntuacion++;
                System.out.println("Asmatu duzu, zoaz: " + puntuacion + " asmatuta.");
                Jzenbakia = HurrengoZen;
            } else {
                System.out.println("Galdu duzu, jokoaitxiko da.");
                System.out.println("Bukaerako puntuazioa: " + puntuacion + " asmatuta.");
                jokatzen = false;
            }
        }
    }
}
