package classes.perguntas;

import java.util.*;

public class BaseDeDados {
    private List<PerguntaGeral> bancoDeDados = new ArrayList<>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<PerguntaGeral> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(PerguntaGeral perguntaGeral) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends PerguntaGeral> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends PerguntaGeral> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public PerguntaGeral get(int index) {
            return null;
        }

        @Override
        public PerguntaGeral set(int index, PerguntaGeral element) {
            return null;
        }

        @Override
        public void add(int index, PerguntaGeral element) {

        }

        @Override
        public PerguntaGeral remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<PerguntaGeral> listIterator() {
            return null;
        }

        @Override
        public ListIterator<PerguntaGeral> listIterator(int index) {
            return null;
        }

        @Override
        public List<PerguntaGeral> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    // Percebi que a gente precisa de um local para adicionar as perguntas, então pensei em criar esse
    // banco de dados que vai conter elas, no final a gente só seleciona quais a gente quer. Foi só uma ideia
    // de momento, a gente pode mudar sem problema
    public void gerarBancoDeDados() {
        bancoDeDados.add(new PerguntaFacil(
                "Texto",
                new String[]{"A", "B"},
                3
        ));
    }
}
