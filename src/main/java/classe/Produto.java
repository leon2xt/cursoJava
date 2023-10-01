/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author pablo
 */
public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(String nomeInicial) {
        nome = nomeInicial;
    }
      Produto(String nomeInicial,double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }
    Produto(){}

    double precoDesconto(double descontoGerente) {
        return preco * (1 - desconto + descontoGerente);
    }

    double precoDesconto() {
        return preco * (1 - desconto);
    }

}
