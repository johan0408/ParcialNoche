/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1_g5_johanbolaños_williamcastro;

/**
 *
 * @author 1061794941
 */
public class Automovil extends Parcial1_G5_JohanBolaños_WilliamCastro {
    private String placa;
    private int modelo;
    private double precio;

    public Automovil(String placa, int modelo, double precio) {
        this.placa = placa;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
}
