package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
//		a1.pi = 10; *n�o pode mais ser acessado a partir da inst�ncia pq virou constante da classe*
		
		
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(100));
		
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}
}
