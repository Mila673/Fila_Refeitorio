public class Main {
    public static void main(String[] args) {
        FilaRef fila = new FilaRef();

        //Adiciona alunos a fila
        Aluno aluno1 = new Aluno("Gustavo", "12345", "BCC");
        Aluno aluno2 = new Aluno("Lauro", "67890", "Agronomia");
        Aluno aluno3 = new Aluno("Luana", "23456", "Quimica");

        fila.adicionar(aluno1);
        fila.adicionar(aluno2);
        fila.adicionar(aluno3);

        //Adiciona os professores a fila
        Professor professor1 = new Professor("Ricardo", "123456", "Professor Titular");
        Professor professor2 = new Professor("Stella", "134679", "Professora Associada");

        fila.adicionar(professor1);
        fila.adicionar(professor2);

        //Adiciona técnicos administrativos a fila
        TecAdmin tecnico1 = new TecAdmin("José", "134782");
        TecAdmin tecnico2 = new TecAdmin("Ana", "614872");

        fila.adicionar(tecnico1);
        fila.adicionar(tecnico2);

        while ((fila.atenderProximo()) != null) {

    }
}
}
