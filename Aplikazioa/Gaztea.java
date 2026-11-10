/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gazteleku;

import java.util.Scanner;

/**
 *
 * @author Moises
 */
public class Gaztea extends Pertsona {

    private String GazteaKod;
    private int GurazoZenbakia;

    public Gaztea() {
        super();
        GazteaKod = "aa";
        GurazoZenbakia = 664176643;

    }

    public Gaztea(String a, int b, String nan, String izena, String abizena) {
        GazteaKod = a;
        GurazoZenbakia = b;
        super(nan, izena, abizena);

    }

    public void setGazteaKod() {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Sartu gazteakod:");
        String a;
        a = myobj.nextLine();
        GazteaKod = a;
    }

    public void setGurazoZenabakia() {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Sartu gurazoen zenbakia:");
        int b;
        b = myobj.nextInt();
        GurazoZenbakia = b;
    }

    public void getGazteaKod() {
        System.out.println("Hau da gazteaKod:" + GazteaKod);
    }

    public void getGurazoZenbakia() {
        System.out.println("Hau da gurazoen zenbakia:" + GurazoZenbakia);
    }

    public void getAll() {
        super.getAll();
        getGazteaKod();
        getGurazoZenbakia();
    }

}
