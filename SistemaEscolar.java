/**
 * 3)
 * 
 * A classe concentra múltiplas responsabilidades:
 * 
 * Dados do aluno.
 * 
 * Dados do professor.
 * 
 * Cálculo de média.
 * 
 * Impressão de boletim.
 * 
 * Viola o Princípio da Responsabilidade Única (SRP).
 * 
 * Dificulta manutenção, testes e reutilização do código.
 */
public class SistemaEscolar {

	public Aluno aluno;
	public Professor professor;

	public SistemaEscolar(Aluno aluno, Professor professor) {
		this.aluno = aluno;
		this.professor = professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public double calcularMedia() {
		double soma = 0;
		for (double n : aluno.getNotas()) {
			soma += n;
		}
		return soma / aluno.getNotas().length;
	}

	public boolean alunoAprovado() {
		return calcularMedia() >= 7;
	}

	public void imprimirBoletim() {

		String nomeAluno = aluno.getNomeAluno();
		String nomeProfessor = professor.getNomeProfessor();
		String nomeDisciplina = professor.getDisciplina();
		String nomeSala = aluno.getSala();
		double media = calcularMedia();

		System.out.println("Aluno: " + nomeAluno);
		System.out.println("Professor: " + nomeProfessor);
		System.out.println("Disciplina: " + nomeDisciplina);
		System.out.println("Sala: " + nomeSala);
		System.out.println("Média: " + media);
	}
}