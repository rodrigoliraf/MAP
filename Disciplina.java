class Disciplina {
    private String nome;
    private String id;

    public Disciplina(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getid() {
        return id;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Id: " + id;
    }

}