package classes.perguntas;

public class PerguntaFacil extends PerguntaGeral{

    public PerguntaFacil() {
        super();
    }

    public PerguntaFacil (String texto, String[] alternativas, int alternativaCorreta) {
        super(texto, alternativas, alternativaCorreta);
    }

    public int getPotuacaoAcerto() {
        return 40;
    }

    public int getPontuacaoErro() {
        return 10;
    }
}
