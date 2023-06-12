package classes;

import classes.perguntas.BaseDeDados;
import classes.perguntas.PerguntaDificil;
import classes.perguntas.PerguntaFacil;
import classes.perguntas.PerguntaMedia;
import java.util.Random;

public class Quiz {
    private BaseDeDados bancoDeDados = new BaseDeDados();
    public PerguntaFacil[] perguntasFaceis;
    public PerguntaMedia[] perguntasMedias;
    public PerguntaDificil[] perguntasDificeis;
    private Usuario[] usuarios;

    public Quiz() {
        this.bancoDeDados = new BaseDeDados();
        this.perguntasFaceis = new PerguntaFacil[4];
        this.perguntasMedias = new PerguntaMedia[4];
        this.perguntasDificeis = new PerguntaDificil[2];
        this.usuarios = new Usuario[2];

        for (int i = 0; i < perguntasFaceis.length; i++) {
            this.perguntasFaceis[i] = new PerguntaFacil();
            Random random = new Random();
            int index = random.nextInt(bancoDeDados.getFaceisSize());
            bancoDeDados.preencheQuestao(this.perguntasFaceis[i], index);
        }

        for (int i = 0; i < perguntasMedias.length; i++) {
            this.perguntasMedias[i] = new PerguntaMedia();
            Random random = new Random();
            int index = random.nextInt(bancoDeDados.getMediasSize());
            bancoDeDados.preencheQuestao(this.perguntasMedias[i], index);
        }

        for (int i = 0; i < perguntasDificeis.length; i++) {
            this.perguntasDificeis[i] = new PerguntaDificil();
            Random random = new Random();
            int index = random.nextInt(bancoDeDados.getDificeisSize());

            bancoDeDados.preencheQuestao(this.perguntasDificeis[i], index);
        }
    }

    public void setUsuarios(Usuario usuario1, Usuario usuario2) {
        this.usuarios[1] = usuario1;
        this.usuarios[2] = usuario2;
    }

    //retorna o índice do usuário vencedor
    //retorna -1 caso haja empate
    public int vencedor() {
        if (usuarios[0].getPontuacao() > usuarios[1].getPontuacao())
            return 0;

        if (usuarios[1].getPontuacao() > usuarios[0].getPontuacao())
            return 1;

        return -1;
    }
}
