package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Ipad",4365.2);
        //p1.nome = "Notebook";
        //p1.desconto = 0.25;

        var p2 = new Produto();
       p2.nome = "Caneta Azul";
        p2.preco = 12.56;
        Produto.desconto = 0.29;
        p2.desconto = 0.50;

        double precoFinal1 = p1.precoDesconto();
        double precoFinal2 = p2.precoDesconto(0.2);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println(p1.nome+" "+p1.precoDesconto());
        System.out.println(p2.nome+" "+p2.precoDesconto());
        System.out.printf("Média do carrinho = R$ %.2f.", mediaCarrinho);
    }
}
