/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author pablo
 */
public class Data {
        int dia;
        int mes;
        int ano;
        
        String obterDataFormatada(){
        String data = String.format("%d/%d/%d",dia,mes,ano );
            return data;
        }
        
}
