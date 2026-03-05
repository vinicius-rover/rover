public class Professor {

    private String nomeProfessor;
    private String disciplina;
    private int cargaHoraria;

    public Professor(String nomeProfessor, String disciplina, int cargaHoraria) {
        this.nomeProfessor = nomeProfessor;
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
