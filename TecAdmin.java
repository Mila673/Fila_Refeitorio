public class TecAdmin extends Pessoa {
    private String siape;

    public TecAdmin(String nome, String numeroSiape) {
        super(nome);
        this.siape = numeroSiape;
    }

    public String getNumeroSiape() {
        return siape;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Siape: " + siape;
    }
}
