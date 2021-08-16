package poo.modificadores;

public class CanetaM {
	
	private String modelo;
	private String cor;
	private double ponta;
	private boolean tampada;
	
	public CanetaM (String m, String c, double p, boolean t) {
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampada = t;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	void status() {
		System.out.println("O modelo da Caneta �: " + this.modelo);
		System.out.println("A cor da Caneta �: " + this.cor);
		System.out.println("A ponta da Caneta �: " + this.ponta);
		System.out.println("A Caneta est� tampada? " + this.tampada);
	}

}
