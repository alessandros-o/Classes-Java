package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		p1.dataValidade = new Data();
		p1.dataValidade.dia = 01;
		p1.dataValidade.mes = 12;
		p1.dataValidade.ano = 2021;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
//		p2.desconto = 0.29;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		System.out.println("\nData de validade: " + p1.dataValidade.dataFormatada());
	}

}
