package poo.polimorfismo2;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Lobo l = new Lobo();
		l.emitirSom();
		
		Cachorro c = new Cachorro();
		c.reagir(true);
		c.reagir(13, 30);
		c.reagir("Ei cachorrinho");
	}

}
