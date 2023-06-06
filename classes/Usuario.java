package classes;

public class Usuario {
    final private int ID;
    final private String nome;
    private int pontuacao;

    public Usuario (String nome, int ID, int pontuacao) {
        this.nome = nome;
        this.ID = ID;
        this.pontuacao = pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getID() {
        return ID;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
