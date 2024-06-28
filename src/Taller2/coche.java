/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2;

/**
 *
 * @author jhoan
 */
public class coche {
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    private int año;

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void automovil ( String _modelo, String _marca, int_año, int_precio){
        modelo= _modelo;
        marca= _marca;
        año= _año;
        precio= -precio;
        
    }
}

