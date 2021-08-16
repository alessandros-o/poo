package poo;

public class CanetaTeste {
	
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5;
		c1.tampada = false;
		c1.status();
		
		c1.tampar();
		System.out.println(c1.tampada);
		System.out.println(c1.rabiscar());
		
		c1.destampar();
		System.out.println(c1.rabiscar());
	}
	
	

}
