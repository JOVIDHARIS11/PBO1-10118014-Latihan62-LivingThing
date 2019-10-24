/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118014.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA  : Jovi D Haris
 * KELAS : IF 
 * NIM   : 10118014
 * Deskripsi Program : Program ini untuk membuat tampilan override abstract.
 */
public class PBO110118014Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Human human = new Human();
        human.setNama("Jovi D Haris");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
        
    }
    
}
