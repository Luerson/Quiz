package perguntas;

public class PerguntaDificil extends PerguntaGeral{

    public PerguntaDificil() {
        super();
    }

    public PerguntaDificil (String texto, String[] alternativas, int alternativaCorreta) {
        super(texto, alternativas, alternativaCorreta);
    }

    public int getPotuacaoAcerto() {
        return 100;
    }

    public int getPontuacaoErro() {
        return 30;
    }
}
