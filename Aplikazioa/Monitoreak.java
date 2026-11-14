/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udalekuerronka;

import java.util.Scanner;

/**
 *
 * @author Sotelo.Iker
 */
public class Monitoreak extends Pertsona {

    private String MonitorKod;

    public Monitoreak() {
        super();
        MonitorKod = "0000";
    }

    public Monitoreak(String a, String b, String c, String d) {
        super(a, b, c);
        MonitorKod = d;
    }

    public void setMonitorKod(String d) {
        MonitorKod = d;
    }

    public void setMonitorKod() {
        Scanner myobj = new Scanner(System.in);

        System.out.println("Sartu monitorearen kodea:");
        String d = myobj.nextLine();

        MonitorKod = d;
    }

    public void getMonitorKod() {
        System.out.println("Hau da monitorearen kodea: " + MonitorKod);
    }

    @Override
    public void getAll() {
        super.getAll();
        getMonitorKod();
    }
}