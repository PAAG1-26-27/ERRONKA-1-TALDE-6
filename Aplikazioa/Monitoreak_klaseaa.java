/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Monitoreak_klasea;
import java.util.Scanner;
/**
 *
 * @author Sotelo.Iker
 */
public class Monitoreak_klasea extends Pertsona{
    private String MonitorKod;
        
    public Monitoreak_klasea(){
        MonitorKod="OO";
    }
    public Monitoreak_klasea(String a){
        MonitorKod=a;
    }
    public void setMonitorKod(String a){
        MonitorKod=a;
    }
    public void setMonitorKod(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Sartu monitore kodea:");
        String a;
        a=sc.nextLine();
        MonitorKod=a;
    }
    public String getMonitorKod(){
        return MonitorKod;
    }
}