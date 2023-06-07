package classes.perguntas;

public class PerguntaDificil extends PerguntaGeral{
    final private int potuacaoAcerto;
    final private int pontuacaoErro;

    public PerguntaDificil (String texto, String[] alternativas, int alternativaCorreta, int ID) {
        super(texto, alternativas, alternativaCorreta, ID);
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
