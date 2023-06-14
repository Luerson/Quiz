package perguntas;

public interface Pergunta {

    public String getTexto();

    public String[] getAlternativas();

    public int getAlternativaCorreta();

    public void setAlternativaCorreta(int alternativaCorreta);

    public void setAlternativas(String[] alternativas);

    public void setTexto(String texto);

    public abstract int getPotuacaoAcerto();

    public abstract int getPontuacaoErro();

    public void escreveAlternativas();
}
