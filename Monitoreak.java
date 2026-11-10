/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polikiroldegia;

import java.util.Scanner;

/**
 *
 * @author Munoz.Maikel
 */
public class Monitorea extends Pertsona{
    private String MonitoreId;
    
    public Monitorea()
    {
    MonitoreId = "00";
    }//monitorea eraikitz
    public Monitorea(String a,String nan, String izena, String abizena)
    {
    super(nan, izena, abizena);
    MonitoreId = a;
    }//monitorea eraikitz param
    public void setMonitoreId()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("LangileId sartu:");
    String a = sc.nextLine();
    MonitoreId = a;
}//setmonitoreid
public void setMonitoreId(String b)
{
    MonitoreId = b;
}//setmonitoreparam
public void getMonitoreId()
{
    System.out.println("Monitorearen ID zenbakia hau da: " + MonitoreId);
}//getNAN
public void getAll()
{
     getMonitoreId();
}//getall
}
