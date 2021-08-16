package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.1415;// static � a palavra usado para transformar em membro de classe
	// a palavra "final" transforma a vari�vel em uma constante de classe sem possibilidade de alterar na inst�ncia
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}

}
