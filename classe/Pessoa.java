package classe;

public class Pessoa {
	
	String nome;
	double peso;

	
	
	void comer(Comida comida) {
		peso += comida.pesoComida;
	}
	
	String apresentar() {
		return "Meu nome é " + nome + " e peso " + peso;
	}
}
