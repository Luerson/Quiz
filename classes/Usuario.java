package classes;
import classes.perguntas.*;

public class Usuario {
    private String nome;
    private int pontuacao;

    public Usuario (String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public void pontuar(PerguntaFacil pergunta, int resposta) {
        if (resposta == pergunta.getAlternativaCorreta()) {
            this.pontuacao += pergunta.getPotuacaoAcerto();
            return;
        }

        this.pontuacao -= pergunta.getPontuacaoErro();
    }

    public void pontuar(PerguntaMedia pergunta, int resposta) {
        if (resposta == pergunta.getAlternativaCorreta()) {
            this.pontuacao += pergunta.getPotuacaoAcerto();
            return;
        }

        this.pontuacao -= pergunta.getPontuacaoErro();
    }

    public void pontuar(PerguntaDificil pergunta, int resposta) {
        if (resposta == pergunta.getAlternativaCorreta()) {
            this.pontuacao += pergunta.getPotuacaoAcerto();
            return;
        }

        this.pontuacao -= pergunta.getPontuacaoErro();
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
