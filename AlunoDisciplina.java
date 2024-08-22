public class AlunoDisciplina {
    
    private Aluno aluno;

    private Disciplina disciplina;

    public AlunoDisciplina(Aluno aluno, Disciplina disciplina){
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    @Override
    public String toString() {
        return "Aluno: " + aluno + " Disciplina: " + disciplina;
    }
}
