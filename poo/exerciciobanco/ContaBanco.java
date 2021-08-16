package poo.exerciciobanco;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco () {
		this.saldo = 0;
		this.status = false;		
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo (String t) {
		this.tipo = t;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String d) {
		this.dono = d;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	//public double setSaldo() {
		//return this.saldo;
	//}
	
	public boolean getStatus() {
		return this.status;
	}
	
	//public boolean setStatus() {
		//return this.status;
	//}
	
	public void abrirConta(String t) {
		setTipo(t); 
		if (t.equalsIgnoreCase("cc")) {
			this.saldo = 50.00;
			this.status = true;
		} else if (t.equalsIgnoreCase("cp")) {
			this.saldo = 150.00;
			this.status = true;
		} else {
			System.out.println("Defina o tipo de conta: 'CC' ou 'CP'");
		}
	}
	
	public void fecharConta() {
		if (this.saldo < 0) {
			System.out.println("Saldo negativo. Não é possível fechar a conta. Pague seu débito");
		} else if (this.saldo > 0) {
			System.out.println("Você possui saldo na conta. Retire seu dinheiro para fechar a conta.");
		} else {
			this.status = false;
			System.out.println("Sua conta foi fechada com sucesso");
		}
	}
	
	public void depositar (double deposito) {
		if (this.status = true) {
			this.saldo += deposito;
		} else {
			System.out.println("Não é possível fazer depósito em uma conta fechada.");
		}
	}
	
	public void sacar (double saque) {
		if (this.status == true && this.saldo > 0 && this.saldo >= saque) {
			this.saldo -= saque;
		} else {
			System.out.println("Você não tem saldo suficiente");
		}
	}
	
	public void pagarMensalidade () {
		double pagarCC = 12.00;
		double pagarCP = 20.00;
		if (this.getStatus()) {
			if (this.tipo.equalsIgnoreCase("cc") && this.saldo >= pagarCC) {
				this.saldo -= pagarCC;
			} else if (this.tipo.equalsIgnoreCase("cp") && this.saldo >= pagarCP) {
			this.saldo -= 20.00;
			}
		} else {
			System.out.println("Impossível pagar uma conta fechada.");
		}
	}
}
