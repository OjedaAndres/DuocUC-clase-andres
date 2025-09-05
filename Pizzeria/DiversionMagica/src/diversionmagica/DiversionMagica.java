/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diversionmagica;

/**
 *
 * @author Duoc
 */
public class DiversionMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       juego juego1= new juego("Montana rusa", 10,2);
       juego juego2= new juego("Spider man", 10,2);
       juego juego3= new juego("Kamikaze", 10,4);
       System.out.println(" ===Bienvenidos al parque de diversiones del DuocUC===\n ");
       
       juego1.mosstrarInfo();
       juego1.puedesubir(10);
       System.out.println(2);
       
       
       juego2.mosstrarInfo();
       juego2.puedesubir(10);
       System.out.println(2);
       
       juego3.mosstrarInfo();
       juego3.puedesubir(10);
       System.out.println(4);
       
    }
}
