package classes.perguntas;

import java.util.*;

public class BaseDeDados {
    public int faceisSize = 5;
    public int mediasSize = 5;
    public int dificeisSize = 5;
    private List<PerguntaFacil> perguntasFaceis;
    private List<PerguntaMedia> perguntasMedias;
    private List<PerguntaDificil> perguntasDificeis;

    public BaseDeDados() {
        this.perguntasFaceis = new ArrayList<>();
        this.perguntasMedias = new ArrayList<>();
        this.perguntasDificeis = new ArrayList<>();

        gerarBancoDeDados();
    }

    // Percebi que a gente precisa de um local para adicionar as perguntas, então pensei em criar esse
    // banco de dados que vai conter elas, no final a gente só seleciona quais a gente quer. Foi só uma ideia
    // de momento, a gente pode mudar sem problema
    public void gerarBancoDeDados() {
        perguntasFaceis.add(
                new PerguntaFacil
                        (
                        "PerguntaMedia",
                        new String[]{"A", "B"},
                        3
                        )
        );

        perguntasMedias.add(
                new PerguntaMedia
                        (
                        "PerguntaDificil",
                        new String[]{"A", "B", "C", "D", "E"},
                        2
                        )
        );

        perguntasDificeis.add(
                new PerguntaDificil
                        (
                        "PerguntaDificil",
                        new String[]{"A", "B", "C", "D", "E"},
                        4
                        )
        );
    }

    public void preencheQuestao(PerguntaFacil pergunta, int index) {
        PerguntaFacil perguntaSelecionada = perguntasFaceis.get(index);

        pergunta.setTexto(perguntaSelecionada.getTexto());
        pergunta.setAlternativas(perguntaSelecionada.getAlternativas());
        pergunta.setAlternativaCorreta(perguntaSelecionada.getAlternativaCorreta());
        pergunta.setPontuacaoAcerto(perguntaSelecionada.getPotuacaoAcerto());
        pergunta.setPontuacaoErro(perguntaSelecionada.getPontuacaoErro());

        perguntasDificeis.remove(index);
        faceisSize--;
    };

    public void preencheQuestao(PerguntaMedia pergunta, int index) {
        PerguntaMedia perguntaSelecionada = perguntasMedias.get(index);

        pergunta.setTexto(perguntaSelecionada.getTexto());
        pergunta.setAlternativas(perguntaSelecionada.getAlternativas());
        pergunta.setAlternativaCorreta(perguntaSelecionada.getAlternativaCorreta());
        pergunta.setPontuacaoAcerto(perguntaSelecionada.getPotuacaoAcerto());
        pergunta.setPontuacaoErro(perguntaSelecionada.getPontuacaoErro());

        perguntasDificeis.remove(index);
        mediasSize--;
    };

    public void preencheQuestao(PerguntaDificil pergunta, int index) {
        PerguntaDificil perguntaSelecionada = perguntasDificeis.get(index);

        pergunta.setTexto(perguntaSelecionada.getTexto());
        pergunta.setAlternativas(perguntaSelecionada.getAlternativas());
        pergunta.setAlternativaCorreta(perguntaSelecionada.getAlternativaCorreta());
        pergunta.setPontuacaoAcerto(perguntaSelecionada.getPotuacaoAcerto());
        pergunta.setPontuacaoErro(perguntaSelecionada.getPontuacaoErro());

        perguntasDificeis.remove(index);
        dificeisSize--;
    };

    public int getFaceisSize() {
        return faceisSize;
    }

    public int getMediasSize() {
        return mediasSize;
    }

    public int getDificeisSize() {
        return faceisSize;
    }
}
