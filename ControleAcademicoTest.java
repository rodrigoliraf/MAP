import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class ControleAcademicoTest {

    @Test
    void testProfessorMinistrandoDisciplinas() {
        Professor professor = new Professor("Dr. João", "P001", "Segundas e Quartas 10:00 - 12:00");
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", professor, "Segundas 10:00 - 12:00");
        professor.adicionarDisciplina(disciplina);
        
        List<Disciplina> disciplinas = professor.getDisciplinas();
        
        assertEquals(1, disciplinas.size());
        assertEquals("Estrutura de Dados", disciplinas.get(0).getNome());
    }
    
    @Test
    void testHorarioDoProfessor() {
        Professor professor = new Professor("Dra. Maria", "P002", "Terças e Quintas 14:00 - 16:00");
        
        String horario = professor.getHorario();
        
        assertEquals("Terças e Quintas 14:00 - 16:00", horario);
    }
    
    @Test
    void testAlunosDeUmaDisciplina() {
        Professor professor = new Professor("Dr. João", "P001", "Segundas e Quartas 10:00 - 12:00");
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", professor, "Segundas 10:00 - 12:00");
        
        Aluno aluno1 = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00");
        Aluno aluno2 = new Aluno("Ana", "A002", "Segundas 10:00 - 12:00");
        
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
        
        List<Aluno> alunos = disciplina.getAlunos();
        
        assertEquals(2, alunos.size());
        assertTrue(alunos.contains(aluno1));
        assertTrue(alunos.contains(aluno2));
    }
    
    @Test
    void testDisciplinasDeUmAluno() {
        Professor professor = new Professor("Dra. Maria", "P002", "Terças e Quintas 14:00 - 16:00");
        Disciplina disciplina = new Disciplina("Algoritmos", "CS102", professor, "Terças 14:00 - 16:00");
        
        Aluno aluno = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");
        aluno.adicionarDisciplina(disciplina);
        
        List<Disciplina> disciplinas = aluno.getDisciplinas();
        
        assertEquals(1, disciplinas.size());
        assertEquals("Algoritmos", disciplinas.get(0).getNome());
    }
    
    @Test
    void testHorarioDeUmAluno() {
        Aluno aluno = new Aluno("Ana", "A002", "Segundas 10:00 - 12:00");
        
        String horario = aluno.getHorario();
        
        assertEquals("Segundas 10:00 - 12:00", horario);
    }
    
    @Test
    void testNumeroDeAlunosEmUmaDisciplina() {
        Professor professor = new Professor("Dr. João", "P001", "Segundas e Quartas 10:00 - 12:00");
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", professor, "Segundas 10:00 - 12:00");
        
        Aluno aluno1 = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00");
        Aluno aluno2 = new Aluno("Ana", "A002", "Segundas 10:00 - 12:00");
        
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
        
        int numeroDeAlunos = disciplina.getNumeroAlunos();
        
        assertEquals(2, numeroDeAlunos);
    }
    
    @Test
    void testAssociacaoEntreAlunoProfessorDisciplina() {
        Professor professor = new Professor("Dra. Maria", "P002", "Terças e Quintas 14:00 - 16:00");
        Disciplina disciplina = new Disciplina("Algoritmos", "CS102", professor, "Terças 14:00 - 16:00");
        Aluno aluno = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");
        
        professor.adicionarDisciplina(disciplina);
        disciplina.adicionarAluno(aluno);
        aluno.adicionarDisciplina(disciplina);
        
        assertTrue(professor.getDisciplinas().contains(disciplina));
        assertEquals("Dra. Maria", disciplina.getProfessor().getNome());

        assertTrue(disciplina.getAlunos().contains(aluno));
        assertTrue(aluno.getDisciplinas().contains(disciplina));
    }
}