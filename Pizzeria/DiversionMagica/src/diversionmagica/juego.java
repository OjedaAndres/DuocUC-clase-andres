/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diversionmagica;

/**
 *
 * @author Duoc
 */
public class juego {
    public String nombre, edadminima, duracion;
    
    
    
    //constructor
        public juego(String nombre, String edadminima, String duracion) {
        this.nombre = nombre;
        this.edadminima = edadminima;
        this.duracion = duracion;
    }
    public void mostrarInfo(){
        System.out.println("Juego: " +nombre);
        System.out.println("Juego: " +edadminima);
        System.out.println("Juego: " +duracion);
    }
    public void puedesubir(int edad){
        if(edad >= edadminima){
           System.out.println("El niño de: " +edad+ "anios puede subir al juego" );
        }else{
            System.out.println("El niño no puede subir al juego");
        }
    }
    
}
