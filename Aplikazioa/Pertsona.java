/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanerronka1;
import java.util.Scanner;
/**
 *
 * @author sanz.fernando
 */
public class Pertsona {

    private String NAN;
    private String Izena;
    private String Abizena;

    public Pertsona() {
        NAN = "OO";
        Izena = "GG";
        Abizena = "JJ";

    }

    public Pertsona(String a, String b, String c) {
        NAN = a;
        Izena = b;
        Abizena = c;

    }

    public void setNAN() {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Sartu NAN:");
        String a;
        a = myobj.nextLine();
        NAN = a;
    }
      public void setIzena() {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Sartu izena:");
        String b;
        b = myobj.nextLine();
        Izena = b;
    }
    
        public void setAbizena() {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Sartu abizena:");
        String c;
        c = myobj.nextLine();
        Abizena = c;
    }
        
      public void getNAN() {
        System.out.println("Hau da  NAN: " + NAN);
    }
      public void getIzena() {
        System.out.println("Hau da izena: " + Izena);
    }
      public void getAbizena() {
        System.out.println("Hau da  NAN: " + Abizena);
    }
      
     public void getAll() {
        getNAN();
        getIzena();
        getAbizena();
    }

}
