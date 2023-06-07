package classes.perguntas;

public class PerguntaGeral {
    final private String texto;
    final private String[] alternativas;
    final private int alternativaCorreta;
    final private int ID;

    public PerguntaGeral(String texto, String[] alternativas, int alternativaCorreta, int ID) {
        this.texto = texto;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
        this.ID = ID;
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
