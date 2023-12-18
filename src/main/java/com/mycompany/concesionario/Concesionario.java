/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concesionario;

/**
 *
 * @author alfre
 */
public class Concesionario {

    public static void main(String[] args) {
      
        Coches coche1= new Coches("Fiat","Punto","rojo",4,2020,25589);
        Coches coche2= new Coches("Mercedez benz","Vito","blanco",5,2012,8550);
        Coches coche3= new Coches("Peugeot","406","gris",5,2000,1500);
        Coches coche4= new Coches("Ford","Mondeo","azul",4,2015,20500);
        Coches coche5= new Coches("","","",0,0,0);
        
        
        Coches coche[]={coche1,coche2,coche3,coche4,coche5};
        Coches.unidadesDisp= coche.length;
        
        System.out.println("La cantidad de coches en stock: "+coche.length);
        System.out.printf("Marca: %s%nModelo: %s%nColor: %s%nPuertas: %d%nAño: %d%nPrecio: %.2f%n",coche1.getMarca(),coche1.getModelo(),coche1.getColor(),coche1.getPuertas(),coche1.getAño(),coche1.getPrecio());
        System.out.println(" ");
        System.out.printf("Marca: %s%nModelo: %s%nColor: %s%nPuertas: %d%nAño: %d%nPrecio: %.2f%n",coche5.getMarca(),coche5.getModelo(),coche5.getColor(),coche5.getPuertas(),coche5.getAño(),coche5.getPrecio());
        System.out.println(" ");
        
        coche5.setMarca("Seat");
        coche5.setModelo("Leon");
        coche5.setColor("Negro");
        coche5.setPuertas(2);
        coche5.setAño(2015);
        coche5.setPrecio(22500);
        System.out.printf("Marca: %s%nModelo: %s%nColor: %s%nPuertas: %d%nAño: %d%nPrecio: %.2f%n",coche5.getMarca(),coche5.getModelo(),coche5.getColor(),coche5.getPuertas(),coche5.getAño(),coche5.getPrecio());
        System.out.println("El coche es:"+coche5.estado(1) );
        System.out.println("La cantidad disponible es de : "+Coches.unidadesDisp+" vehiculos");
    }
}
