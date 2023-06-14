package perguntas;

public class PerguntaFacil extends PerguntaGeral implements Pergunta{

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
