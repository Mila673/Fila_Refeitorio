import java.util.LinkedList;

public class FilaRef {
    private LinkedList<Pessoa> fila;

    public FilaRef() {
        fila = new LinkedList<>();
    }

    public void adicionar(Pessoa pessoa) {
        fila.addLast(pessoa);
    }

    public Pessoa atenderProximo() {
        if (fila.isEmpty()) {
            return null;
        }

        return fila.removeFirst();
    }

    public void mostrarFila() {
        System.out.println("Fila:");
        for (Pessoa pessoa : fila) {
            System.out.println("- " + pessoa);
        }
    }
}
