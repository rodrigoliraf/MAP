import java.util.ArrayList;
import java.util.List;

class Disciplina {
    private String nome;
    private String codigo;
    private Professor professor;
    private List<Aluno> alunos;
    private String horario;

    public Disciplina(String nome, String codigo, Professor professor, String horario) {
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
        this.horario = horario;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getHorario() {
        return horario;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public int getNumeroAlunos() {
        return alunos.size();
    }
}