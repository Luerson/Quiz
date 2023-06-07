package classes.perguntas;

public class PerguntaMedia extends PerguntaGeral{
    final private int potuacaoAcerto;
    final private int pontuacaoErro;

    public PerguntaMedia (String texto, String[] alternativas, int alternativaCorreta, int ID) {
        super(texto, alternativas, alternativaCorreta, ID);
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
