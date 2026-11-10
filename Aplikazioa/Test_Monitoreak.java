
package com.mycompany.monitoreaa;

import java.util.Scanner;
import java.util.ArrayList;

public class Test_Monitoreak {
    // Gehitu
    public static void gehitu(ArrayList<Monitoreak>l){

        int aukera;
        Scanner myObj=new Scanner(System.in);
        
        do{
            Monitoreak m1=new Monitoreak();
            m1.setMonitorKod();
            l.add(m1);
            System.out.println("Beste monitore bat gehitu nahi duzu?(1=BAI,0=EZ):");
            aukera=myObj.nextInt();
            myObj.nextLine();
        }while(aukera!=0);
    }
    //Bistaratu
    public static void bistaratu(ArrayList<Monitoreak>l){
        System.out.println("\nMonitoreak:\n");
        
        for(int i=0;i<l.size();i++){
            l.get(i).getAll();
        }
    }
    //Aldatu
    public static void aldatu(ArrayList<Monitoreak>l){
        Scanner myObj=new Scanner(System.in);
        System.out.println("Sartu aldatu nahi duzun monitorearen kodea:");
        String kodea=myObj.nextLine();
        boolean aurkituta=false;
        
        for(int i=0;i<l.size();i++){
            if(l.get(i).getMonitorKodBalioa().equals(kodea)){
                System.out.println("Sartu kode berria:");
                l.get(i).setMonitorKod();
                System.out.println("Monitorea aldatu da.");
                aurkituta=true;
                break;
            }
        }
        if(aurkituta==false){
            System.out.println("Monitorea ez da aurkitu.");
        }
    }
    // Ezabatu
    public static void ezabatu(ArrayList<Monitoreak>l) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Sartu ezabatu nahi duzun monitorearen kodea:");
        String kodea=myObj.nextLine();
        boolean aurkituta=false;

        for(int i=0;i<l.size();i++){
            if(l.get(i).getMonitorKodBalioa().equals(kodea)){
                l.remove(i);
                System.out.println("Monitorea ezabatu da.");
                aurkituta=true;
                break;
            }
        }
        if (aurkituta==false) {
            System.out.println("Monitorea ez da aurkitu.");
        }
    }
    // Main
    public static void main(String[]args){
        int aukera;
        Scanner myObj=new Scanner(System.in);
        ArrayList<Monitoreak>listaMonitoreak=new ArrayList<>();

        do{
            System.out.println("\nMenua");
            System.out.println("1. Gehitu monitorea");
            System.out.println("2. Bistaratu monitoreak");
            System.out.println("3. Aldatu monitorea");
            System.out.println("4. Ezabatu monitorea");
            System.out.println("0. Atera");

            System.out.println("Aukeratu bat:");
            aukera=myObj.nextInt();
            myObj.nextLine();

            if(aukera<0 || aukera>4){
                System.out.println("\nAukera okerra. Aukeratu berriro.\n");
            }
            switch(aukera){

                case 1:
                    gehitu(listaMonitoreak);
                    break;

                case 2:
                    bistaratu(listaMonitoreak);
                    break;

                case 3:
                    aldatu(listaMonitoreak);
                    break;

                case 4:
                    ezabatu(listaMonitoreak);
                    break;

                case 0:
                    System.out.println("Agur");
                    break;
            }

        }while(aukera!=0);
    }
}