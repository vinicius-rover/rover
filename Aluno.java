public class Aluno {

    private String nomeAluno;
    private double[] notas;
    private String sala;

    public Aluno(String nomeAluno, double[] notas, String sala) {
        this.nomeAluno = nomeAluno;
        this.notas = notas;
        this.sala = sala;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
