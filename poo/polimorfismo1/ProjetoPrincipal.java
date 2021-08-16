package poo.polimorfismo1;

public class ProjetoPrincipal {
	public static void main(String[] args) {
		
		Mamifero m1 = new Mamifero();
		m1.setCorPelo("Malhado");
		m1.locomover();
		m1.alimentar();
		m1.emitirSom();
		System.out.println(m1.getCorPelo());
		
		Canguru c1 = new Canguru();
		c1.locomover();
		c1.usarBolsa();
	}

}
