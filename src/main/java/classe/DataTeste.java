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
        Data data2 = new Data(17,04,1967);

         
        System.out.printf("A data de Nascimento do Pablo é: %s \n",data1.obterDataFormatada());
        System.out.printf("A data de Nascimento da Beatriz é: %s ",data2.obterDataFormatada());

    }
}
