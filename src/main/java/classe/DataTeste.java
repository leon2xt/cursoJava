/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author pablo
 */
public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data();
        data1.dia = 05;
        data2.dia = 17;
        data1.mes = 06;
        data2.mes = 04;
        data1.ano = 1998;
         data2.ano = 1967;
         
        System.out.println("A data de Nascimento do Pablo é: " +data1.dia+"/"+data1.mes+"/"+data1.ano);
        System.out.println("A data de Nascimento da Beatriz é: " +data2.dia+"/"+data2.mes+"/"+data2.ano);
    }
}
