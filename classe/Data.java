package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String dataFormatada () {
		String diaS = Integer.toString(dia);
		String mesS = Integer.toString(mes);
		String anoS = Integer.toString(ano);
		
		return diaS.concat("/") + mesS.concat("/") + anoS;
	}
	
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;	
	}
	
	Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}


// String obterDataFormatada() {
//	return String.format("%d/%d/%d", dia, mes, ano);
//}