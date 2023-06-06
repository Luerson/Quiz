package classes.perguntas;

public class PerguntaFacil extends PerguntaGeral{
    final private int potuacaoAcerto;
    final private int pontuacaoErro;

    public PerguntaFacil (String texto, String[] alternativas, int alternativaCorreta) {
        super(texto, alternativas, alternativaCorreta);
        this.pontuacaoErro = 10;
        this.potuacaoAcerto = 40;
    }

    public int getPotuacaoAcerto() {
        return potuacaoAcerto;
    }

    public int getPontuacaoErro() {
        return pontuacaoErro;
    }
}
