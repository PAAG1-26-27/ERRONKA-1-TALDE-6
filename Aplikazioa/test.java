/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polikiroldegia;

/**
 *
 * @author Munoz.Maikel
 */
import java.util.Scanner;
import java.util.ArrayList;
public class test {
    Scanner sc = new Scanner(System.in);
    
    
    
    public static void gehituEkintza(ArrayList<Ekintza>l)
    {
        int aukera;
        Scanner sc = new Scanner(System.in);
        do
        {
                    System.out.println("\n--- EKINTZA BERRIA GEHITU ---");
                    Ekintza e1=new Ekintza();
                    e1.setid_ekintza();
                    e1.setIzena();
                    e1.setHasieraData();
                    l.add(e1);//copiao de arriba
                    System.out.println("¡Ekintza ondo gehitu da!\n");
                    
                    System.out.print("Beste ekintza bat gehitu nahi duzu? (Sakatu 1 jarraitzeko, 0 irten eta menura bueltatzeko): ");
                    aukera = sc.nextInt();
        }//do
        while(aukera!=0);
    }//gehituEkintza
    public static void bistaratuEkintza(ArrayList<Ekintza>l)
    {
        System.out.println("\n--- EKINTZEN ZERRENDA ---");
        if (l.isEmpty()) 
        {
            System.out.println("Ez dago ekintzarik erregistratuta.\n");
        } 
        else 
        {
            for (Ekintza e : l) //"ele" barruan "e" guztiak prozesatu, hauxe da: for (int i = 0; i < l.size(); i++)
            {
                e.getAll();
            }
        }
        System.out.println();
    }
    public static void ezabatuEkintza(ArrayList<Ekintza>l)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- EKINTZA EZABATU: ---");
        if (l.isEmpty())
        {
            System.out.println("Ez dago ekintzarik ezabatzeko. \n");
        }//if
        else
        {
            bistaratuEkintza(l);//erabiltzailea ikus dezan
            System.out.println("Sartu ezabatu nahi duzun posizioa: (0tik aurrera): ");
            int posizioa = sc.nextInt();
            
            if (posizioa >= 0 && posizioa < l.size())
            {
                l.remove(posizioa);
                System.out.println("Ekintza ezabatu da. \n");
            }
            else
            {
                System.out.println("Errorea: Posizioa ez da existitzen!\n");
            }    
                
        }//else
        
    }//ezabatuekintza
    public static void aldatuEkintza(ArrayList<Ekintza>l)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- EKINTZA ALDATU: ---");
        if (l.isEmpty())
        {
            System.out.println("Ez dago ekintzarik aldatzeko. \n");
            
        }//if
        else
        {
        bistaratuEkintza(l);//erabiltzailea ikus dezan
        System.out.println("Sartu aldatu nahi duzun posizioa: (0tik aurrera): ");
        int posizioa = sc.nextInt();
            if (posizioa >= 0 && posizioa < l.size())
            {
            Ekintza e = l.get(posizioa);
            
                System.out.println("Sartu datu berriak:");
                e.setid_ekintza();
                e.setIzena();
                e.setHasieraData();
                System.out.println("Ekintza aldatu da.\n");
            }
            else
            {
                System.out.println("Errorera: Ez dago ekintzarik posizio horretan\n");
            }
        }//else
    }//aldatu ekintza
    
    public static void main(String[] args) {
         
         ArrayList<Ekintza> listaEkintzak = new ArrayList<>();
         Scanner sc = new Scanner(System.in);
        
         //listaBazkideak.add(new Bazkidea());
         //listaEkintzak.add(new Ekintza());
         
        int aukera;
       do {
            System.out.println("-> MENU EKINTZAK <-");
            System.out.println("Ekintzak bistaratu: Sakatu 1");
            System.out.println("Ekintzak gehitu: Sakatu 2");
            System.out.println("Ekintzak ezabatu: Sakatu 3");
            System.out.println("Ekintzak aldatu: Sakatu 4");
            System.out.println("Programatik irten: Sakatu 5");
            System.out.print("Aukeratu zenbakia: ");
            aukera = sc.nextInt();
            switch (aukera)
            {
                
                case 1:
                    bistaratuEkintza(listaEkintzak);
                     break;
                case 2:
                    gehituEkintza(listaEkintzak);
                    break;
                case 3:
                    ezabatuEkintza(listaEkintzak);
                    break;
                case 4:
                    aldatuEkintza(listaEkintzak);
                    break;
                case 5:
                    System.out.println("Agur!");
                    break;
                default:
                    System.out.println("Sartu zerrendako zenbaki bat! ");
            }//switch
        }//do
       while(aukera!=5);
    }//main
}//class
