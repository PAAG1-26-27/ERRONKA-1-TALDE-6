/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.erronkajokua;

/**
 *
 * @author Munoz.Maikel
 */
import java.util.Scanner;
import java.util.ArrayList;
public class bidado 
{
    public static void jolastu(ArrayList<Integer>P1, ArrayList<Integer>CPU)
    {
        Scanner sc = new Scanner(System.in);
        int aukera = 0;
        P1.clear();
        CPU.clear();
        int zenb1 = 0;//dadoen puntuazioa hemen gordeko dut
        int zenb2 = 0;//dadoen puntuazioa hemen gordeko dut
        int P1guztia = 0;
        int CPUguztia = 0;
        int max = 6;
        int min = 1;
    //jokalariak 1. dadoa1c bota + datuak batu eta arraylistean gorde
    do
    {
        System.out.println("Sakatu 1 dadoa botatzeko:");
        aukera = sc.nextInt();
        if (aukera != 1)
        {
            System.out.println("Aukera okerra. Sakatu 1 dadoa botatzeko!");
        }
    } 
    while (aukera != 1);
            zenb1 = (int) (Math.random()*max + min);
            System.out.println("Zure dadoa = " + zenb1);
        P1guztia += zenb1;//lehenengo dadoa bota da
        P1.add(zenb1);//puntuak gorde arraylistan
        do
    {
        System.out.println("Sakatu 1 bigarren dadoa botatzeko:");
        aukera = sc.nextInt();
        if (aukera != 1)
        {
            System.out.println("Aukera okerrra. Sakatu 1 dadoa botatzeko!");
        }
    } 
    while (aukera != 1);
            zenb2 = (int) (Math.random()*max + min);
            System.out.println("Zure dadoa = " + zenb2);
        P1guztia += zenb2;//bigarren dadoa bota da
        P1.add(zenb2);//puntuak gorde arraylistan
        // CPUk 2 dado bota + datuak batu eta arraylistean gorde
        //1. tirada
        zenb1 = (int) (Math.random()*max + min);
        CPUguztia += zenb1;
        CPU.add(zenb1);//cpuren arraylistan gorde
        System.out.println("CPUren dadoa =" + zenb1);
        //2. tirada
        zenb2 = (int) (Math.random()*max + min);
        System.out.println("CPUren dadoa =" + zenb2);
        CPUguztia += zenb2;
        CPU.add(zenb2);//cpuren arraylistan gorde
                // puntuen konparaketa
        if (P1guztia > CPUguztia)
        {
            System.out.println("Irabazi duzu! Zorionak!");
        }//if
        else if (P1guztia < CPUguztia)
        {
            System.out.println("Galdu duzu! Sorte hobeagoa hurrengoan!");
        }//else if
        else
        {
            while(P1guztia == CPUguztia)
            {
            do
            {
            System.out.println("Berdinketa!!!");
            System.out.println("Sakatu 1 beste dado bat botatzeko:");
            aukera = sc.nextInt();
            if (aukera != 1)
            {
                System.out.println("Aukera okerra. Sakatu 1 dadoa botatzeko!");
            }
            }
            while (aukera != 1);
            zenb1 = (int) (Math.random()*max + min);
            P1guztia += zenb1;
            System.out.println("Zure dadoa = " + zenb1);
            P1.add(zenb1);
            //CPUren txanda
            zenb1 = (int) (Math.random()*max + min);
            System.out.println("CPUren dadoa = " + zenb1);
            CPUguztia += zenb1;
            CPU.add(zenb1);
            }//while berdinketa hautsi arte
            if(P1guztia > CPUguztia)
            {
                System.out.println("Berdinketa ostean... IRABAZI DUZU!! ZORIONAK!");
            }
            else
            {
                System.out.println("Berdinketa ostean... GALDU DUZU =( Sorte hobeagoa hurrengoan!");
            }
        }//else berdinketa
        System.out.println("\n--- PARTIDAREN LABURPENA ---");
        System.out.println("Zure tiradak (P1): " + P1);
        System.out.println("CPUren tiradak: " + CPU);
        System.out.println("Zure puntu totala: " + P1guztia);
        System.out.println("CPUren puntu totala: " + CPUguztia);
    }//jolastu
    
    public static void main(String[] args) 
    {
        ArrayList<Integer> listaJokalariPuntuazioa = new ArrayList<>();
        ArrayList<Integer> listaCPUpuntuazioa = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int aukera;
        do
        {
            System.out.println("Jolasteko sakatu: 1");
            System.out.println("Jokua itxi, sakatu : 2");
            aukera = sc.nextInt();
        switch(aukera)
        {
            case 1:
                jolastu(listaJokalariPuntuazioa,listaCPUpuntuazioa);
                break;
            case 2:
                System.out.println("Agur!");
                break;
            default:
            System.out.println("Sartu zerrendako zenbaki bat");
        
        }//switch
        }//do
            while(aukera!=2);
    }//main
}//class
