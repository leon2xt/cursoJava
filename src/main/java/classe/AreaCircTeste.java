/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author pablo
 */
public class AreaCircTeste {

    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);
        a1.raio = 100;
        //a1.pi = 10;
        //AreaCirc.pi = 3.1415;
        System.out.println(AreaCirc.pi);
        AreaCirc a2 = new AreaCirc(5);
        a2.raio = 10;
        // a2.pi = 5;
      // AreaCirc.pi = 5;
        System.out.println(AreaCirc.pi);
        System.out.println(AreaCirc.area(100));
    }
}
