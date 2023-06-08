package classes.perguntas;

public class PerguntaDificil extends PerguntaGeral{
    private int pontuacaoAcerto;
    private int pontuacaoErro;

    public PerguntaDificil() {
        super();
        this.pontuacaoErro = 0;
        this.pontuacaoAcerto = 0;
    }
    public PerguntaDificil (String texto, String[] alternativas, int alternativaCorreta) {
        super(texto, alternativas, alternativaCorreta);
        this.pontuacaoErro = 30;
        this.pontuacaoAcerto = 100;
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
