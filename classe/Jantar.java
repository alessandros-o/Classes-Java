package classe;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida();
		c1.nomeComida = "Feijão";
		c1.pesoComida = 0.150;
		
		Comida c2 = new Comida();
		c2.nomeComida = "Arroz";
		c2.pesoComida = 0.150;
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Alessandro";
		p1.peso = 72.100;
		
		System.out.println(p1.apresentar());
		
		p1.comer(c1);
		System.out.println(p1.apresentar());
		
		p1.comer(c2);
		System.out.println(p1.apresentar());
		
							
	}

}
