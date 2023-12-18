/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concesionario;

/**
 *
 * @author alfre
 */
public class Coches {
    private String marca,modelo, color;
    private int puertas, año;
    private float precio;
    protected String estado;
    static int unidadesDisp;

    public Coches(String marca, String modelo,String color, int puertas, int año, float precio) {
        this.marca = marca;
        this.modelo= modelo;
        this.color = color;
        this.puertas = puertas;
        this.año = año;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String estado (int nuevo){
        estado= nuevo==0? "nuevo=0 El coche es nuevo":" el coche es de segunda mano ";
        return estado;
        
    }
    
}
