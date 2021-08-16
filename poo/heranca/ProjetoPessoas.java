package poo.heranca;

public class ProjetoPessoas {
	public static void main(String[] args) {
		//projeto principal
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p2.setSexo("Feminino");
		p2.setIdade(25);
		p3.setNome("Cláudio");
		p3.setSexo("Masculino");
		p3.setIdade(35);
		p3.setEspecialidade("Java");
		p4.setNome("Fabiana");
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75);
		p4.setSetor("Estoque");
		
		p2.fazerAniversario();
		
		System.out.println(p2.toString());
		
		p3.receberAumento(1);
		System.out.println(p3.getSalario());
		System.out.println(p3.getEspecialidade());
		
	}

}
