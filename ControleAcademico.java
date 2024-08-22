import java.util.List;
import java.util.ArrayList;

public class ControleAcademico 
{

    private List<AlunoDisciplina> alunoDisciplinas = new ArrayList<>();
    private List<ProfDisciplina> profDisciplinas = new ArrayList<>();
    private List<Horario> horarios = new ArrayList<>();

    // Método para adicionar uma relação aluno-disciplina
    public boolean adicionarAlunoDisciplina(Aluno aluno, Disciplina disciplina) {
        AlunoDisciplina alunoDisciplina = new AlunoDisciplina(aluno, disciplina);
        return alunoDisciplinas.add(alunoDisciplina);
    }

    // Método para adicionar uma relação professor-disciplina
    public boolean adicionarProfDisciplina(Professor professor, Disciplina disciplina) {
        ProfDisciplina profDisciplina = new ProfDisciplina(professor, disciplina);
        return profDisciplinas.add(profDisciplina);
    }

    // Método para adicionar um horário
    public boolean adicionarHorario(String dia, String horaInicio, String horaFim) {
        Horario horario = new Horario(dia, horaInicio, horaFim);
        return horarios.add(horario);
    }

    // Método para obter todas as relações aluno-disciplina
    public List<AlunoDisciplina> getAlunoDisciplinas() {
        return new ArrayList<>(alunoDisciplinas);
    }

    // Método para obter todas as relações professor-disciplina
    public List<ProfDisciplina> getProfDisciplinas() {
        return new ArrayList<>(profDisciplinas);
    }

    // Método para obter todos os horários
    public List<Horario> getHorarios() {
        return new ArrayList<>(horarios);
    }

    public static void main(String[] args) 
    {
            // Instanciando o sistema de controle acadêmico
            ControleAcademico ControleAcademico = new ControleAcademico();
    
            // Criando alunos
            Aluno aluno1 = new Aluno("Joao Silva", "202301");
            Aluno aluno2 = new Aluno("Maria Souza", "202302");
    
            // Criando disciplinas
            Disciplina disciplina1 = new Disciplina("Matematica", "MAT101");
            Disciplina disciplina2 = new Disciplina("Programacao", "PROG101");
    
            // Criando professores
            Professor professor1 = new Professor("Dr. Pedro", "Matematica");
            Professor professor2 = new Professor("Prof. Ana", "Computacao");
    
            // Adicionando relações aluno-disciplina
            ControleAcademico.adicionarAlunoDisciplina(aluno1, disciplina1);
            ControleAcademico.adicionarAlunoDisciplina(aluno2, disciplina2);
    
            // Adicionando relações professor-disciplina
            ControleAcademico.adicionarProfDisciplina(professor1, disciplina1);
            ControleAcademico.adicionarProfDisciplina(professor2, disciplina2);
    
            // Adicionando horários
            ControleAcademico.adicionarHorario("Segunda-feira", "08:00", "10:00");
            ControleAcademico.adicionarHorario("Terca-feira", "10:00", "12:00");
    
            // Exibindo as relações aluno-disciplina
            System.out.println("Relacoes Aluno-Disciplina:");
            for (AlunoDisciplina alunoDisciplina : ControleAcademico.getAlunoDisciplinas()) {
                System.out.println(alunoDisciplina);
            }
    
            // Exibindo as relações professor-disciplina
            System.out.println("\nRelacoes Professor-Disciplina:");
            for (ProfDisciplina profDisciplina : ControleAcademico.getProfDisciplinas()) {
                System.out.println(profDisciplina);
            }
    
            // Exibindo os horários
            System.out.println("\nHorarios:");
            for (Horario horario : ControleAcademico.getHorarios()) {
                System.out.println(horario);
            }
    }
}