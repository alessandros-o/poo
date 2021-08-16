package poo.modificadores;


public class CanetaMTeste {
	
	public static void main(String[] args) {
		
		CanetaM c1 = new CanetaM("Bic", "Azul", 1.5, true);
		c1.status();
		c1.setModelo("Nic");
		c1.status();
	}

}
