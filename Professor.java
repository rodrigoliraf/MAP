import java.util.ArrayList;
import java.util.List;


class Professor {
    private String nome;
    private String id;

    public Professor(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setId(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Id: " + id;
    }
}