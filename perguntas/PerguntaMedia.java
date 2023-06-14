package perguntas;

public class PerguntaMedia extends PerguntaGeral{

    public PerguntaMedia() {
        super();
    }

    public PerguntaMedia (String texto, String[] alternativas, int alternativaCorreta) {
        super(texto, alternativas, alternativaCorreta);
    }

    public int getPotuacaoAcerto() {
        return 60;
    }

    public int getPontuacaoErro() {
        return 20;
    }
}
