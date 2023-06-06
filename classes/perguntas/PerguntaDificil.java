package classes.perguntas;

public class PerguntaDificil extends PerguntaGeral{
    final private int potuacaoAcerto;
    final private int pontuacaoErro;

    public PerguntaDificil (String texto, String[] alternativas, int alternativaCorreta) {
        super(texto, alternativas, alternativaCorreta);
        this.pontuacaoErro = 30;
        this.potuacaoAcerto = 100;
    }

    public int getPotuacaoAcerto() {
        return potuacaoAcerto;
    }

    public int getPontuacaoErro() {
        return pontuacaoErro;
    }
}
