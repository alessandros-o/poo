package poo.heranca2;

public class ProjetoPrincipal {
	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		Professor p1 = new Professor();
		p1.setNome("Prof. Astrogildo");
		p1.setIdade(56);
		p1.setSexo("M");
		p1.setSalario(1500.00);
		System.out.println(p1.toString());
		System.out.println(p1.getSalario());
		
		p1.receberAumento(500.00);
		System.out.println(p1.getSalario());
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Sheila");
		t1.praticar();
	}

}
