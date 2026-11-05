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
public class RuletaJokoa {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int puntos=100;
            int apuesta;
            int aukera;
            int zenbakiAtera;

            do{
                if (puntos <= 0) {
                    System.out.println("\nEz daukazu punturik jokatzeko! Jokoa amaitu da.");
                    break; // Ziklotik kanpora doa zuzenean
                }

                System.out.println("Nola jokatu nahi duzu??");
                System.out.println("1.-Kolorez");
                System.out.println("2.-Bakoiti/bikoiti");
                System.out.println("3.-Zenbakiz");
                System.out.println("4.-Exit");
                System.out.println("Aukeratu zer egin:");
                aukera = scanner.nextInt();

                switch(aukera){
                    case 1:
                        do {
                            System.out.print("Zenbat puntu jokatu nahi dituzu? (1 - " + puntos + "): ");
                            apuesta = scanner.nextInt();
                        } while (apuesta <= 0 || apuesta > puntos);

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
                            break;
                        }

                        zenbakiAtera = random.nextInt(37);
                        String koloreAtera = "";
                        //Kondizioak
                        if (zenbakiAtera == 0) {
                            koloreAtera = "Berdea";
                        } else if (zenbakiAtera % 2 == 0) {
                            koloreAtera = "Beltza";
                        } else {
                            koloreAtera = "Gorria";
                        }

                        System.out.println("[RULETA BIRATZEN...]");
                        System.out.println("Zenbakia: " + zenbakiAtera + " (" + koloreAtera + ")");
                        
                        //Zer gertatu apostuarekim
                        //equalsIgnoreCase problemarik ez izateko letra txikias edo handias idatzi baldin baduzu
                        if (aukeratutakoKolorea.equalsIgnoreCase(koloreAtera)) {
                            if (koloreAtera.equals("Berdea")) {
                                int irabazia = apuesta * 14;
                                puntos += irabazia;
                                System.out.println("Berdea atera da " + irabazia + " puntu irabazi dituzu!");
                            } else {
                                puntos += apuesta;
                                System.out.println("Asmatu duzu " + apuesta + " puntu irabazi dituzu!");
                            }
                        } else {
                            puntos -= apuesta;
                            System.out.println("Galdubakarra... " + apuesta + " puntu galdu dituzu.");
                        }
                        break;

                    case 2:
                        // Apustua egin
                        do {
                            System.out.print("Zenbat puntu jokatu nahi dituzu? (1 - " + puntos + "): ");
                            apuesta = scanner.nextInt();
                        } while (apuesta <= 0 || apuesta > puntos);

                        System.out.println("Ze erabili nahi duzu??");
                        System.out.println("1. Bakoiti");
                        System.out.println("2. Bikoiti");
                        System.out.print("Aukeratu jokaldia (1-2): ");
                        int jokaldia = scanner.nextInt();
                        
                        //Zuk erabaki duzun aukera
                        String aukeratutakojokaldia = "";
                        if (jokaldia == 1) aukeratutakojokaldia = "Bakoiti";
                        else if (jokaldia == 2) aukeratutakojokaldia = "Bikoiti";
                        else {
                            System.out.println("Aukera okerra.");
                            break;
                        }
                        zenbakiAtera = random.nextInt(37);
                        String jokaldiAtera = "";
                        
                        // Apustuaren kondizioak
                        if (zenbakiAtera == 0) {
                            jokaldiAtera = "Ezer ez (0)";
                        } else if (zenbakiAtera % 2 == 0) {
                            jokaldiAtera = "Bikoiti";
                        } else {
                            jokaldiAtera = "Bakoiti";
                        }

                        System.out.println("[RULETA BIRATZEN...]");
                        System.out.println("Zenbakia: " + zenbakiAtera + " (" + jokaldiAtera + ")");
                        
                        //Zer gertatu apustuarekin
                        if (aukeratutakojokaldia.equals(jokaldiAtera)) {
                            puntos += apuesta;
                            System.out.println("Asmatu duzu " + apuesta + " puntu irabazi dituzu.");
                        } else {
                            puntos -= apuesta;
                            System.out.println("Galdu duzu " + apuesta + " puntu galdu dituzu.");
                        }
                        break;

                    case 3:
                        //Zenbat puntu jokatzeko galdera
                        do {
                            System.out.print("Zenbat puntu jokatu nahi dituzu? (1 - " + puntos + "): ");
                            apuesta = scanner.nextInt();
                        } while (apuesta <= 0 || apuesta > puntos);

                        int aukeratutakoZenbakia;
                        //Jokoaren aukera egin
                        do {
                            System.out.print("Zein zenbakiri jokatu nahi diozu? (0 - 36): ");
                            aukeratutakoZenbakia = scanner.nextInt();
                            if (aukeratutakoZenbakia < 0 || aukeratutakoZenbakia > 36) {
                                System.out.println("Zenbakia 0 eta 36 artekoa izan behar da!");
                            }
                        } while (aukeratutakoZenbakia < 0 || aukeratutakoZenbakia > 36);

                        zenbakiAtera = random.nextInt(37);

                        System.out.println("[RULETA BIRATZEN...]");
                        System.out.println("Zenbakia: " + zenbakiAtera);
                        
                        //Zer gertatu apostuarekin
                        if (aukeratutakoZenbakia == zenbakiAtera) {
                            int irabazia = apuesta * 35;
                            puntos += irabazia;
                            System.out.println(" Zorionak! Zenbaki zehatza asmatu duzu! " + irabazia + " puntu irabazi dituzu!");
                        } else {
                            puntos -= apuesta;
                            System.out.println("Ez duzu asmatu... " + apuesta + " puntu galdu dituzu.");
                        }
                        break;
                        
                    //Programatik ateratzen    
                    case 4:
                        System.out.println("Eskerrik asko jokatzeagatik");
                        break;
                    
                    //Beste zenbaki bat jartzen baldin baduzu aterako den mezua    
                    default:
                        System.out.println("Aukera okerra, saiatu berriro.");
                        break;
            }//Switch bukaera
        }while(aukera !=4);
    }//Public static void... itxi
}//Programa itxi