package classes;

import classes.perguntas.BaseDeDados;
import classes.perguntas.PerguntaDificil;
import classes.perguntas.PerguntaFacil;
import classes.perguntas.PerguntaMedia;
import java.util.Random;

public class Quiz {
    final private BaseDeDados bancoDeDados = new BaseDeDados();
    private PerguntaFacil[] perguntaFacil = new PerguntaFacil[2];
    private PerguntaMedia[] perguntaMedia = new PerguntaMedia[2];
    private PerguntaDificil perguntaDificil;
    final private Usuario[] usuarios = new Usuario[2];

    public Quiz() {
        bancoDeDados.gerarBancoDeDados();
    }

    public void setUsuarios(Usuario usuario1, Usuario usuario2) {
        this.usuarios[1] = usuario1;
        this.usuarios[2] = usuario2;
    }
}
