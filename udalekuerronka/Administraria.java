/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udalekuerronka;

import java.util.Scanner;

/**
 *
 * @author sanz.fernando
 */
public class Administraria extends Pertsona {

    private String AdministrariaKod;

    public Administraria() {
        super();
        AdministrariaKod = "0000";
    }

    public Administraria(String a, String b, String c, String d) {
        super(a, b, c);
        AdministrariaKod = d;
    }

    public void setAdministrariaKod(String d) {
        AdministrariaKod = d;
    }

    public void setAdministrariaKod() {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Sartu Administrari kodea:");
        String d = myobj.nextLine();
        AdministrariaKod = d;
    }

    public void getAdministrariaKod() {
        System.out.println("Hau da Administrari kodea: " + AdministrariaKod);
    }
    @Override
    public void getAll() {
        super.getAll();
        getAdministrariaKod();
    }
}