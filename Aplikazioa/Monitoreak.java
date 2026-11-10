
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monitoreaa;

import java.util.Scanner;

/**
 *
 * @author Sotelo.Iker
 */
public class Monitoreak {
    private String MonitorKod;

    public void setMonitorKod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu monitorearen kodea:");
        String a;
        a = sc.nextLine();
        MonitorKod = a;
    }
    public void getMonitorKod() {
        System.out.println("Monitorearen kodea hau da: " + MonitorKod);
    }
    public String getMonitorKodBalioa() {
        return MonitorKod;
    }
    public void getAll() {
        getMonitorKod();
    }
}