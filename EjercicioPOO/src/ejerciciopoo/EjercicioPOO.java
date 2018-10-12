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
public class EjercicioPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo obj_equipo = new Equipo();
        obj_equipo.setNombre("Liga de Loja");
        obj_equipo.setCiudad("Loja");
        obj_equipo.setNum_jugadores(35);
        
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s \n", obj_equipo.getNombre(),obj_equipo.getNum_jugadores(),obj_equipo.getCiudad());
        
        Equipo obj_equipo2 = new Equipo("Barcelona sc");
        obj_equipo2.setCiudad("Guayaquil");
        obj_equipo2.setNum_jugadores(22);
        
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n", obj_equipo2.getNombre(),obj_equipo2.getNum_jugadores(),obj_equipo2.getCiudad());
        
        Equipo obj_equipo3 = new Equipo("Real Madrid",30);
        obj_equipo3.setCiudad("Madrid");
        
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n", obj_equipo3.getNombre(),obj_equipo3.getNum_jugadores(),obj_equipo3.getCiudad());
        
        
        Equipo obj_equipo4 = new Equipo("Inter de Milán","Milán",29);
        
        
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s", obj_equipo4.getNombre(),obj_equipo4.getNum_jugadores(),obj_equipo4.getCiudad());
      
        
    }
    
}
