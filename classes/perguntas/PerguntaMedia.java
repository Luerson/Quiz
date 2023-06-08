package classes.perguntas;

public class PerguntaMedia extends PerguntaGeral{
    private int pontuacaoAcerto;
    private int pontuacaoErro;

    public PerguntaMedia() {
        super();
        this.pontuacaoErro = 0;
        this.pontuacaoAcerto = 0;
    }

    public PerguntaMedia (String texto, String[] alternativas, int alternativaCorreta) {
        super(texto, alternativas, alternativaCorreta);
        this.pontuacaoErro = 20;
        this.pontuacaoAcerto = 60;
    }

    public void setPontuacaoAcerto(int pontuacaoAcerto) {
        this.pontuacaoAcerto = pontuacaoAcerto;
    }

    public void setPontuacaoErro(int pontuacaoErro) {
        this.pontuacaoErro = pontuacaoErro;
    }

    public int getPotuacaoAcerto() {
        return pontuacaoAcerto;
    }

    public int getPontuacaoErro() {
        return pontuacaoErro;
    }
}
