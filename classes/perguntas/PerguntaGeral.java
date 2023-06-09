package classes.perguntas;

public abstract class PerguntaGeral {
    private String texto;
    private String[] alternativas;
    private int alternativaCorreta;

    public PerguntaGeral() {
        this.texto = "";
        this.alternativas = new String[5];
        this.alternativaCorreta = 0;
    }

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

    public void setAlternativaCorreta(int alternativaCorreta) {
        this.alternativaCorreta = alternativaCorreta;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public abstract int getPotuacaoAcerto();

    public abstract int getPontuacaoErro();
}
