package classes.perguntas;

public class PerguntaDificil implements PerguntaGeral{
    private String texto;
    private String[] alternativas;
    private int alternativaCorreta;

    public PerguntaDificil() {
        this.texto = "";
        this.alternativas = new String[5];
        this.alternativaCorreta = 0;
    }
    public PerguntaDificil (String texto, String[] alternativas, int alternativaCorreta) {
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

    public int getPotuacaoAcerto() {
        return 100;
    }

    public int getPontuacaoErro() {
        return 30;
    }
}
