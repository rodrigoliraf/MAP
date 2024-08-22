public class ProfDisciplina {

    private Professor professor;

    private Disciplina disciplina;

    public ProfDisciplina(Professor professor, Disciplina disciplina){
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
}

@Override
public String toString() {
        return "Professor: " + professor + " Disciplina: " + disciplina;
}
}