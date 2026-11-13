package com.mycompany.udalekuerronka;

import java.util.Scanner;

public class UdalekuMain {

    private static final Scanner scanner = AdmisnistrariakOpzioak.scanner;

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
                    // Administratzaileak.
                    AdmisnistrariakOpzioak.main(new String[0]);
                    break;
                case 2:
                    // Gazteak.
                    Test_Gaztea.main(new String[0]);
                    break;
                case 3:
                    // Monitoreak.
                    Test_Monitoreak.main(new String[0]);
                    break;
                case 4:
                    // Ekintzak.
                    test.main(new String[0]);
                    break;
                case 5:
                    System.out.println("Agur!");
                    break;
                default:
                    System.out.println("Aukera okerra, saiatu berriro.");
            }
        } while (aukera != 5);
    }


    private static void erakutsiMenua() {
        System.out.println("\nUDALEKU MENUA");
        System.out.println("1. Administrariak kudeatu");
        System.out.println("2. Gazteak kudeatu");
        System.out.println("3. Monitoreak kudeatu");
        System.out.println("4. Ekintzak kudeatu");
        System.out.println("5. Irten (EXIT)");
        System.out.print("Aukeratu aukera bat (1-5): ");
    }
}
