package com.mycompany.blackjackjolasa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 * @author Sotelo.Iker
 */
public class Blackjackjolasa {

    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        Random ausazkoa = new Random();

        //ArrayList-ak sortu
        ArrayList<Integer>jokalaria=new ArrayList<>();
        ArrayList<Integer> programa=new ArrayList<>();

        int jokalariaKopurua=0;
        int programaKopurua=0;
        int zenb;
        String aukera;

        System.out.println("BLACK JACK");

        //Jokalariari 2 ausazko zenbaki eman(1 eta 11 artean)
        for(int i=0;i<2;i++){
            zenb=ausazkoa.nextInt(11)+1;
            jokalaria.add(zenb);
            jokalariaKopurua=jokalariaKopurua+zenb;
        }

        //Programari 2 ausazko zenbaki eman(1 eta 11 artean)
        for(int i=0;i<2;i++){
            zenb=ausazkoa.nextInt(11)+1;
            programa.add(zenb);
            programaKopurua=programaKopurua+zenb;
        }

        //Hasierako emaitzak
        System.out.println("\nZURE TXANDA:");
        System.out.println("Zure zenbakiak:"+jokalaria);
        System.out.println("Zure kopurua:"+jokalariaKopurua);
        System.out.println("---------");

        //Jokalariaren txanda
        while(jokalariaKopurua<21){
            System.out.println("Beste zenbaki bat nahi duzu?(bai/ez)");   
            aukera=sc.nextLine();

            if(aukera.equalsIgnoreCase("bai")) {
                zenb=ausazkoa.nextInt(11)+1;
                jokalaria.add(zenb);
                jokalariaKopurua=jokalariaKopurua+zenb;

                System.out.println("Zenbaki berria:"+zenb);
                System.out.println("Zure zenbaki guztiak:"+jokalaria);
                System.out.println("Zure kopurua:"+jokalariaKopurua);
                System.out.println("---------");

            }else if(aukera.equalsIgnoreCase("ez")){
                break;
            }else{
                System.out.println("Aukera okerra. Saiatu berriro");
            }
        }

        //Jokalaria 21 pasatzen bada
        if(jokalariaKopurua>21){
            System.out.println("21 baino gehiago! GALDU DUZU");
        }else{
            //Programaren txanda
            System.out.println("\nPROGRAMAREN TXANDA:");
            System.out.println("Programaren hasierako zenbakiak:"+ programa);
            System.out.println("Programaren hasierako kopurua:"+programaKopurua);
            System.out.println("---------");

            //<=16 beste bat eskatu, >=17 gelditu
            while(programaKopurua<=16){
                zenb=ausazkoa.nextInt(11)+1;
                programa.add(zenb);
                programaKopurua=programaKopurua+zenb;

                System.out.println("Zenbaki berria:"+zenb);
                System.out.println("Zenbaki guztiak:"+programa);
                System.out.println("Programaren kopurua:"+programaKopurua);
                System.out.println("---------");
            }

            if(programaKopurua>=17){
                System.out.println("Programak 17 edo gehiago duenez, ezin du zenbaki gehiago eskatu.");
            }

            //Azken emaitzak
            System.out.println("\nAZKEN EMAITZAK");
            System.out.println("Zure kopurua:"+jokalariaKopurua);
            System.out.println("Programaren kopurua:"+programaKopurua);
            System.out.println("---------");

            //Irabazlea erabaki
            if(programaKopurua>21){
                System.out.println("Programak 21 baino gehiago ditu. IRABAZI DUZU!!!");
            }else if(jokalariaKopurua>programaKopurua){
                System.out.println("IRABAZI DUZU!!!");
            }else if(jokalariaKopurua<programaKopurua) {
                System.out.println("PROGRAMAK IRABAZI DU");
            }else{
                System.out.println("ENPATEA!");
            }
        }
        sc.close();
    }
}