package classes.perguntas;

public class PerguntaMedia extends PerguntaGeral{
    final private int potuacaoAcerto;
    final private int pontuacaoErro;

    public PerguntaMedia (String texto, String[] alternativas, int alternativaCorreta) {
        super(texto, alternativas, alternativaCorreta);
        this.pontuacaoErro = 20;
        this.potuacaoAcerto = 60;
    }

    public int getPotuacaoAcerto() {
        return potuacaoAcerto;
    }

    public int getPontuacaoErro() {
        return pontuacaoErro;
    }
}
