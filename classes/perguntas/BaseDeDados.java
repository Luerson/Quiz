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
                new PerguntaFacil(
                        "O que é um objeto em programação orientada a objetos?\n",
                        new String[]{"a) Um valor primitivo.\n", "b) Uma função.\n", "c) Uma variável.\n", "d) Uma instância de uma classe.\n", "e) Um tipo de dado.\n"},
                        3
                )
        );

        perguntasFaceis.add(
                new PerguntaFacil(
                        "Qual dos seguintes conceitos está relacionado à herança em programação orientada a objetos?\n",
                        new String[]{"a) Polimorfismo.\n", "b) Encapsulamento.\n", "c) Abstração.\n", "d) Hereditariedade.\n", "e) Composição.\n"},
                        3
                )
        );

        perguntasFaceis.add(
                new PerguntaFacil(
                        "O que é um construtor em Java?\n",
                        new String[]{"a) Uma classe que estende outra classe.\n", "b) Uma variável de instância.\n", "c) Um método estático.\n", "d) Um bloco de inicialização.\n", "e) Um método especial para criar e inicializar objetos.\n"},
                        4
                )
        );

        perguntasFaceis.add(
                new PerguntaFacil(
                        "Qual dos seguintes não é um dos princípios do encapsulamento?\n",
                        new String[]{"a) Abstração.\n", "b) Herança.\n", "c) Ocultação de informações.\n", "d) Proteção de dados.\n", "e) Interface clara e consistente.\n"},
                        3
                )
        );

        perguntasFaceis.add(
                new PerguntaFacil(
                        "O que é polimorfismo em programação orientada a objetos?\n",
                        new String[]{"a) Capacidade de uma classe herdar de múltiplas classes.\n", "b) Capacidade de uma classe ser usada como um tipo genérico.\n", "c) Capacidade de uma classe ter vários construtores.\n", "d) Capacidade de uma classe ter vários métodos com o mesmo nome, mas comportamentos diferentes.\n"},
                        3
                )
        );

        perguntasFaceis.add(
                new PerguntaFacil(
                        "Qual é o objetivo do encapsulamento em programação orientada a objetos?\n",
                        new String[]{"a) Facilitar a reutilização de código.\n", "b) Melhorar o desempenho do programa.\n", "c) Reduzir o uso de memória.\n", "d) Proteger os dados de uma classe e fornecer uma interface controlada para interagir com eles.\n", "e) Tornar o código mais legível e compreensível.\n"},
                        3
                )
        );

        perguntasFaceis.add(
                new PerguntaFacil(
                        "O que é uma interface em Java?\n",
                        new String[]{"a) Uma classe que não pode ser instanciada.\n", "b) Uma forma de implementar herança múltipla.\n", "c) Um tipo de dado primitivo.\n", "d) Um contrato que define métodos que uma classe deve implementar.\n", "e) Uma forma de ocultar informações de outras classes.\n"},
                        3
                )
        );

        perguntasFaceis.add(
                new PerguntaFacil(
                        "O que é polimorfismo de sobrecarga?\n",
                        new String[]{"a) Capacidade de uma classe herdar de múltiplas classes.\n", "b) Capacidade de uma classe ser usada como um tipo genérico.\n", "c) Capacidade de uma classe ter vários construtores.\n", "d) Capacidade de uma classe ter vários métodos com o mesmo nome, mas parâmetros diferentes.\n", "e) Capacidade de uma classe ter vários métodos com o mesmo nome, mas comportamentos diferentes.\n"},
                        3
                )
        );

        perguntasFaceis.add(
                new PerguntaFacil(
                        "O que é herança em programação orientada a objetos?\n",
                        new String[]{"a) Capacidade de uma classe ter vários construtores.\n", "b) Capacidade de uma classe herdar de múltiplas classes.\n", "c) Capacidade de uma classe ser usada como um tipo genérico.\n", "d) Capacidade de uma classe adquirir atributos e comportamentos de uma classe pai.\n", "e) Capacidade de uma classe ter vários métodos com o mesmo nome, mas comportamentos diferentes.\n"},
                        3
                )
        );

        perguntasFaceis.add(
                new PerguntaFacil(
                        "O que é um método abstrato em Java?\n",
                        new String[]{"a) Um método que não possui implementação e precisa ser sobrescrito por uma classe filha.\n", "b) Um método que não pode ser chamado diretamente.\n", "c) Um método que retorna um valor primitivo.\n", "d) Um método que não possui parâmetros.\n", "e) Um método que pode ser estático ou de instância.\n"},
                        1
                )
        );

        perguntasMedias.add(
                new PerguntaMedia(
                        "O que é uma classe abstrata em Java?\n",
                        new String[]{"a) Uma classe que não pode ser instanciada.\n", "b) Uma classe que possui apenas métodos estáticos.\n", "c) Uma classe que não pode ser estendida por outras classes.\n", "d) Uma classe que só pode ser estendida por classes dentro do mesmo pacote.\n", "e) Uma classe que só pode ser estendida por classes em pacotes diferentes.\n"},
                        0
                )
        );

        perguntasMedias.add(
                new PerguntaMedia(
                        "Qual é a diferença entre uma classe abstrata e uma interface em Java?\n",
                        new String[]{"a) Uma classe abstrata pode ter variáveis de instância, enquanto uma interface não pode.\n", "b) Uma interface pode ter implementações de métodos, enquanto uma classe abstrata não pode.\n", "c) Uma classe abstrata pode implementar múltiplas interfaces, enquanto uma interface não pode implementar outras interfaces.\n", "d) Uma classe abstrata pode ser instanciada, enquanto uma interface não pode.\n", "e) Não há diferença entre uma classe abstrata e uma interface em Java.\n"},
                        0
                )
        );

        perguntasMedias.add(
                new PerguntaMedia(
                        "O que é uma exceção em Java?\n",
                        new String[]{"a) Um erro que ocorre durante a compilação do programa.\n", "b) Um aviso emitido pelo compilador.\n", "c) Uma situação inesperada que ocorre durante a execução do programa.\n", "d) Um tipo especial de variável.\n", "e) Uma instrução condicional.\n"},
                        2
                )
        );

        perguntasMedias.add(
                new PerguntaMedia(
                        "Qual é a diferença entre uma exceção verificada e uma exceção não verificada em Java?\n",
                        new String[]{"a) Exceções verificadas são aquelas que ocorrem durante a compilação, enquanto exceções não verificadas ocorrem durante a execução do programa.\n", "b) Exceções verificadas são aquelas que herdam da classe RuntimeException, enquanto exceções não verificadas herdam da classe Exception.\n", "c) Exceções verificadas são aquelas que precisam ser explicitamente capturadas ou declaradas no código, enquanto exceções não verificadas não precisam.\n", "d) Exceções verificadas são aquelas que ocorrem em situações excepcionais, enquanto exceções não verificadas ocorrem em situações comuns.\n", "e) Não há diferença entre uma exceção verificada e uma exceção não verificada em Java.\n"},
                        1
                )
        );

        perguntasMedias.add(
                new PerguntaMedia(
                        "O que é polimorfismo de sobrescrita?\n",
                        new String[]{"a) Capacidade de uma classe ter vários métodos com o mesmo nome, mas comportamentos diferentes.\n", "b) Capacidade de uma classe herdar de múltiplas classes.\n", "c) Capacidade de uma classe ter vários métodos com o mesmo nome, mas parâmetros diferentes.\n", "d) Capacidade de uma classe substituir um método da classe pai com a mesma assinatura.\n", "e) Capacidade de uma classe ser usada como um tipo genérico.\n"},
                        3
                )
        );

        perguntasMedias.add(
                new PerguntaMedia(
                        "O que é um pacote em Java?\n",
                        new String[]{"a) Um diretório que contém arquivos de configuração do programa.\n", "b) Um arquivo executável do programa.\n", "c) Um conjunto de classes relacionadas que estão agrupadas juntas.\n", "d) Um tipo especial de variável.\n", "e) Um tipo de dado primitivo.\n"},
                        2
                )
        );

        perguntasMedias.add(
                new PerguntaMedia(
                        "O que é um construtor em Java?\n",
                        new String[]{"a) Um método estático que retorna um valor.\n", "b) Um método especial que possui o mesmo nome da classe e é usado para criar objetos dessa classe.\n", "c) Um método que define o comportamento de uma classe.\n", "d) Um tipo especial de variável.\n", "e) Uma estrutura de controle utilizada para repetir um bloco de código.\n"},
                        1
                )
        );

        perguntasMedias.add(
                new PerguntaMedia(
                        "O que é encapsulamento em Java?\n",
                        new String[]{"a) O processo de ocultar a implementação interna de uma classe e expor apenas sua interface pública.\n", "b) A capacidade de uma classe herdar de múltiplas classes.\n", "c) A capacidade de uma classe ter vários métodos com o mesmo nome, mas parâmetros diferentes.\n", "d) A capacidade de uma classe substituir um método da classe pai com a mesma assinatura.\n", "e) A capacidade de uma classe ter vários métodos com o mesmo nome, mas comportamentos diferentes.\n"},
                        0
                )
        );

        perguntasMedias.add(
                new PerguntaMedia(
                        "Qual é a diferença entre uma classe abstrata e uma interface em Java?\n",
                        new String[]{"a) Uma classe abstrata pode ter implementações de métodos, enquanto uma interface não pode.\n", "b) Uma classe abstrata pode ser instanciada, enquanto uma interface não pode.\n", "c) Uma classe abstrata pode ter construtores, enquanto uma interface não pode.\n", "d) Uma classe abstrata pode herdar de múltiplas classes, enquanto uma interface não pode.\n", "e) Uma classe abstrata pode ter variáveis de instância, enquanto uma interface não pode.\n"},
                        0
                )
        );

        perguntasMedias.add(
                new PerguntaMedia(
                        "O que é polimorfismo em programação orientada a objetos?\n",
                        new String[]{"a) A capacidade de uma classe herdar de múltiplas classes.\n", "b) A capacidade de uma classe ter vários métodos com o mesmo nome, mas parâmetros diferentes.\n", "c) A capacidade de uma classe substituir um método da classe pai com a mesma assinatura.\n", "d) A capacidade de uma classe ter vários métodos com o mesmo nome, mas comportamentos diferentes.\n", "e) A capacidade de uma variável de referência ser associada a objetos de classes diferentes e, assim, executar diferentes comportamentos no mesmo código.\n"},
                        4
                )
        );

        perguntasDificeis.add(
                new PerguntaDificil(
                        "Explique o conceito de herança múltipla e por que não é suportado em Java.\n",
                        new String[]{"a) Herança múltipla permite que uma classe herde características de várias classes.\n", "b) Em Java, herança múltipla não é suportada para evitar conflitos de ambiguidade e complexidade.\n", "c) Herança múltipla é uma técnica avançada usada apenas em linguagens de programação específicas.\n", "d) Java suporta herança múltipla através do uso de interfaces.\n", "e) Herança múltipla é uma prática desencorajada em programação orientada a objetos.\n"},
                        1
                )
        );

        perguntasDificeis.add(
                new PerguntaDificil(
                        "O que é o princípio da substituição de Liskov?\n",
                        new String[]{"a) É um princípio que afirma que uma classe derivada pode ser usada no lugar da classe base.\n", "b) É um princípio que afirma que uma classe derivada deve ter o mesmo número de métodos que a classe base.\n", "c) É um princípio que afirma que uma classe derivada deve ter a mesma implementação dos métodos da classe base.\n", "d) É um princípio que afirma que uma classe derivada não pode substituir um método da classe base.\n", "e) É um princípio que afirma que uma classe derivada deve herdar todos os atributos da classe base.\n"},
                        0
                )
        );

        perguntasDificeis.add(
                new PerguntaDificil(
                        "O que são classes aninhadas em Java?\n",
                        new String[]{"a) São classes que podem ser usadas apenas dentro de um método.\n", "b) São classes que não podem ser instanciadas diretamente.\n", "c) São classes que são definidas dentro de outras classes.\n", "d) São classes que podem herdar de várias classes.\n", "e) São classes que não podem ter métodos.\n"},
                        2
                )
        );

        perguntasDificeis.add(
                new PerguntaDificil(
                        "Quais são as diferenças entre uma classe abstrata e uma interface em Java?\n",
                        new String[]{"a) Uma classe abstrata pode ter métodos com implementação, enquanto uma interface não pode.\n", "b) Uma classe abstrata pode ser instanciada, enquanto uma interface não pode.\n", "c) Uma interface pode ter variáveis de instância, enquanto uma classe abstrata não pode.\n", "d) Uma classe abstrata pode herdar de múltiplas classes, enquanto uma interface não pode.\n", "e) Uma interface pode ter construtores, enquanto uma classe abstrata não pode.\n"},
                        0
                )
        );

        perguntasDificeis.add(
                new PerguntaDificil(
                        "O que é o princípio da inversão de dependência?\n",
                        new String[]{"a) É um princípio que afirma que as classes de baixo nível devem depender das classes de alto nível.\n", "b) É um princípio que afirma que as classes de alto nível devem depender das classes de baixo nível.\n", "c) É um princípio que afirma que as classes devem depender de interfaces em vez de implementações concretas.\n", "d) É um princípio que afirma que as classes devem depender de implementações concretas em vez de interfaces.\n", "e) É um princípio que afirma que as classes não devem depender umas das outras.\n"},
                        2
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
