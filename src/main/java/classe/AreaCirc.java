/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author pablo
 */
public class AreaCirc {

    double raio;
  final  static double pi =3.14;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return pi * Math.pow(raio, 2);
    }
    
    static double area (double raio){
    return pi * Math.pow(raio, 2);
    }
}
