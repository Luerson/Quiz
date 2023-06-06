package classes.perguntas;

public class PerguntaGeral {
    final private String texto;
    final private String[] alternativas;

    final private int alternativaCorreta;

    public PerguntaGeral(String texto, String[] alternativas, int alternativaCorreta) {
        this.texto = texto;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    public String getTexto() {
        return texto;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public int getAlternativaCorreta() {
        return alternativaCorreta;
    }
}
