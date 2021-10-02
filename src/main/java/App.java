public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Diogo",123, 5);

        Endereco end1 = new Endereco();
        Endereco end2 = new Endereco();

        end1.Endereco("Rua 1", "Bairro 1", 1);
        end2.Endereco("Rua 2", "Bairro 2", 2);

        p1.addEndereco(end1);
        p1.addEndereco(end2);

        p1.mostrarInfo();
    }
}
