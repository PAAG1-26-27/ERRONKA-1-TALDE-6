/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udalekuerronka;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner; 

/**
 *
 * @author Munoz.Maikel
 */
public class Ekintza {
private int id_ekintza;
private String izena;
private LocalDate HasieraData;

public Ekintza() {
        this.id_ekintza = 0;
        this.izena = "Herri kirolak";
        this.HasieraData = LocalDate.now();
}
public void setid_ekintza()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Sartu Id:");
    int a = sc.nextInt();
    id_ekintza = a;
}//setidekintza
public void setIzena()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Sartu Izena:");
    String a = sc.nextLine();
    izena = a;
}//setIzena
public void setHasieraData()
{
    Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Sartu data (dd/mm/aaaa): ");
        String entrada = scanner.nextLine();

        try 
        {
            LocalDate fecha = LocalDate.parse(entrada, formato);//parse=casting=bilakatzea
            System.out.println("Fecha leída con éxito: " + fecha);
            HasieraData = fecha;
        } 
        catch (DateTimeParseException e)
        {
            System.out.println("Formatoarekin arazoa.");
        }

}//sethasieradata
public void getid_ekintza()
{
    System.out.println("Ekintzaren ID zenbakia hau da: " + id_ekintza);
}//getidekintza
public void getIzena()
{
    System.out.println("Ekintzaren Izena hau da: " + izena);
}//getizena
public void getHasieraData()
{
    System.out.println("Hasiera data hau da: " + HasieraData);
}//gethasieradata
public void getAll()
{
getid_ekintza();
getIzena();
getHasieraData();
}//getall
}
