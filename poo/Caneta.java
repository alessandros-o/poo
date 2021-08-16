package poo;

public class Caneta {
	
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.print("Uma caneta " + this.cor);
		System.out.println(" está tampada?  " + this.tampada);
	}
	
	String rabiscar () {
		if(this.tampada == true) {
			return "Erro: Não estou rabiscando";
		} else {
			return "Estou rabiscando";
		}
		
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}

}
