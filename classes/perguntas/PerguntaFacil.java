package classes.perguntas;

public class PerguntaFacil extends PerguntaGeral{
    private int pontuacaoAcerto;
    private int pontuacaoErro;

    public PerguntaFacil() {
        super();
        this.pontuacaoErro = 0;
        this.pontuacaoAcerto = 0;
    }

    public PerguntaFacil (String texto, String[] alternativas, int alternativaCorreta) {
        super(texto, alternativas, alternativaCorreta);
        this.pontuacaoErro = 10;
        this.pontuacaoAcerto = 40;
    }

    public int getPotuacaoAcerto() {
        return pontuacaoAcerto;
    }

    public void setPontuacaoAcerto(int pontuacaoAcerto) {
        this.pontuacaoAcerto = pontuacaoAcerto;
    }

    public void setPontuacaoErro(int pontuacaoErro) {
        this.pontuacaoErro = pontuacaoErro;
    }

    public int getPontuacaoErro() {
        return pontuacaoErro;
    }
}
