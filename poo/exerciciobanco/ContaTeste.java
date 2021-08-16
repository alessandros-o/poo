package poo.exerciciobanco;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		ContaBanco c1 = new ContaBanco();
		System.out.println(c1.getStatus());
		
		c1.abrirConta("cc");
		System.out.println(c1.getStatus());
		System.out.println(c1.getSaldo());
		
		c1.fecharConta();
		System.out.println(c1.getStatus());
		
		c1.depositar(25.00);
		System.out.println(c1.getSaldo());
		
		c1.sacar(5);
		System.out.println(c1.getSaldo());
		
		c1.pagarMensalidade();
		System.out.println(c1.getSaldo());
		
		c1.sacar(58);
		c1.fecharConta();
		c1.pagarMensalidade();
	}

}
