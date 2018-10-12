/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;

/**
 *
 * @author Usuario
 */
public class Equipo {
    private String nombre,ciudad;
    private int num_jugadores;

    public Equipo() {
        
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre, int num_jugadores) {
        this.nombre = nombre;
        this.num_jugadores = num_jugadores;
    }
    
    

    public Equipo(String nombre, String ciudad, int num_jugadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.num_jugadores = num_jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNum_jugadores() {
        return num_jugadores;
    }

    public void setNum_jugadores(int num_jugadores) {
        this.num_jugadores = num_jugadores;
    }
    
    
    
}
