package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
//		d1.dia = 01;
//		d1.mes = 01;
//		d1.ano = 1985;
		
		Data d2 = new Data(18, 07, 1981);
		
		String date1 = d1.dataFormatada();
		String date2 = d2.dataFormatada();
		
		System.out.println(date1);
		System.out.println(date2);
				
		
	}

}
