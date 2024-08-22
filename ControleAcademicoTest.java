import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ControleAcademicoTest {

    private ControleAcademico controleAcademico;
    private Aluno aluno1;
    private Aluno aluno2;
    private Disciplina disciplina1;
    private Disciplina disciplina2;
    private Professor professor1;
    private Professor professor2;

    @BeforeEach
    public void setUp() {
        controleAcademico = new ControleAcademico();

        // Criando alunos
        aluno1 = new Aluno("Joao Silva", "202301");
        aluno2 = new Aluno("Maria Souza", "202302");

        // Criando disciplinas
        disciplina1 = new Disciplina("Matematica", "MAT101");
        disciplina2 = new Disciplina("Programacao", "PROG101");

        // Criando professores
        professor1 = new Professor("Dr. Pedro", "Matematica");
        professor2 = new Professor("Prof. Ana", "Computacao");
    }

    @Test
    public void testAdicionarAlunoDisciplina() {
        // Adicionando relações aluno-disciplina
        boolean adicionado1 = controleAcademico.adicionarAlunoDisciplina(aluno1, disciplina1);
        boolean adicionado2 = controleAcademico.adicionarAlunoDisciplina(aluno2, disciplina2);

        assertTrue(adicionado1, "Aluno 1 deveria ser adicionado com sucesso à disciplina 1");
        assertTrue(adicionado2, "Aluno 2 deveria ser adicionado com sucesso à disciplina 2");

        // Verificando se as relações foram corretamente adicionadas
        List<AlunoDisciplina> alunoDisciplinas = controleAcademico.getAlunoDisciplinas();
        assertEquals(2, alunoDisciplinas.size(), "Deveriam existir 2 relações aluno-disciplina");

        assertEquals(aluno1, alunoDisciplinas.get(0).getAluno());
        assertEquals(disciplina1, alunoDisciplinas.get(0).getDisciplina());
        assertEquals(aluno2, alunoDisciplinas.get(1).getAluno());
        assertEquals(disciplina2, alunoDisciplinas.get(1).getDisciplina());
    }

    @Test
    public void testAdicionarProfDisciplina() {
        // Adicionando relações professor-disciplina
        boolean adicionado1 = controleAcademico.adicionarProfDisciplina(professor1, disciplina1);
        boolean adicionado2 = controleAcademico.adicionarProfDisciplina(professor2, disciplina2);

        assertTrue(adicionado1, "Professor 1 deveria ser adicionado com sucesso à disciplina 1");
        assertTrue(adicionado2, "Professor 2 deveria ser adicionado com sucesso à disciplina 2");

        // Verificando se as relações foram corretamente adicionadas
        List<ProfDisciplina> profDisciplinas = controleAcademico.getProfDisciplinas();
        assertEquals(2, profDisciplinas.size(), "Deveriam existir 2 relações professor-disciplina");

        assertEquals(professor1, profDisciplinas.get(0).getProfessor());
        assertEquals(disciplina1, profDisciplinas.get(0).getDisciplina());
        assertEquals(professor2, profDisciplinas.get(1).getProfessor());
        assertEquals(disciplina2, profDisciplinas.get(1).getDisciplina());
    }

    @Test
    public void testAdicionarHorario() {
        // Adicionando horários
        boolean adicionado1 = controleAcademico.adicionarHorario("Segunda-feira", "08:00", "10:00");
        boolean adicionado2 = controleAcademico.adicionarHorario("Terca-feira", "10:00", "12:00");

        assertTrue(adicionado1, "Horário 1 deveria ser adicionado com sucesso");
        assertTrue(adicionado2, "Horário 2 deveria ser adicionado com sucesso");

        // Verificando se os horários foram corretamente adicionados
        List<Horario> horarios = controleAcademico.getHorarios();
        assertEquals(2, horarios.size(), "Deveriam existir 2 horários");

        assertEquals("Segunda-feira", horarios.get(0).getDia());
        assertEquals("08:00", horarios.get(0).getHoraInicio());
        assertEquals("10:00", horarios.get(0).getHoraFim());
        assertEquals("Terca-feira", horarios.get(1).getDia());
        assertEquals("10:00", horarios.get(1).getHoraInicio());
        assertEquals("12:00", horarios.get(1).getHoraFim());
    }
}