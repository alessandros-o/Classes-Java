package classe;

public class Pessoa {
	
	String nome;
	double peso;

	
	
	void comer(Comida comida) {
		peso += comida.pesoComida;
	}
	
	String apresentar() {
		return "Meu nome � " + nome + " e peso " + peso;
	}
}
