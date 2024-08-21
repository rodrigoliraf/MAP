public class ControleAcademico {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Joao", "P001", "Segundas e Quartas 10:00 - 12:00");
        Professor professor2 = new Professor("Maria", "P002", "Terças e Quintas 14:00 - 16:00");

        Disciplina disciplina1 = new Disciplina("Estrutura de Dados", "CS101", professor1, "Segundas 10:00 - 12:00");
        Disciplina disciplina2 = new Disciplina("Algoritmos", "CS102", professor2, "Tercas 14:00 - 16:00");

        professor1.adicionarDisciplina(disciplina1);
        professor2.adicionarDisciplina(disciplina2);

        Aluno aluno1 = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00 e Tercas 14:00 - 16:00");
        Aluno aluno2 = new Aluno("Ana", "A002", "Segundas 10:00 - 12:00");

        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno2);
        disciplina2.adicionarAluno(aluno1);

        aluno1.adicionarDisciplina(disciplina1);
        aluno1.adicionarDisciplina(disciplina2);
        aluno2.adicionarDisciplina(disciplina1);

        System.out.println("Disciplinas ministradas por " + professor1.getNome() + ":");
        for (Disciplina d : professor1.getDisciplinas()) {
            System.out.println("-" + d.getNome());
        }

        System.out.println("\nHorario do " + professor1.getNome() + ": " + professor1.getHorario());

        System.out.println("\nAlunos matriculados em " + disciplina1.getNome() + ":");
        for (Aluno a : disciplina1.getAlunos()) {
            System.out.println("-" + a.getNome());
        }

        System.out.println("\nDisciplinas de " + aluno1.getNome() + ":");
        for (Disciplina d : aluno1.getDisciplinas()) {
            System.out.println("-" + d.getNome());
        }

        System.out.println("\nHorario do " + aluno1.getNome() + ": " + aluno1.getHorario());

        System.out.println("\nNumero de alunos em " + disciplina1.getNome() + ": " + disciplina1.getNumeroAlunos());
    }
}