package poo.polimorfismo2;

public class Cachorro extends Lobo {
	public void emitirSom() {
		System.out.println("Au au au");
	}
	
	public void reagir(String frase) {
		if(frase.equals("Toma comida")) {
			System.out.println("Abanar e latir");
		} else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("Abanar");
		} else if(hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
		}
		
	}
}