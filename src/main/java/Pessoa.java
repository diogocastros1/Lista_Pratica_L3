public class Pessoa {
    public String nome;
    public int cpf;
    public Endereco end[];
    public static int cont;

    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        end = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco end){
        this.end[cont] = end;
        cont++;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        for(int i = 0; i < cont; i++){
            System.out.println(end[i].getRua() + ", " + end[i].getNum() + " - " + end[i].getBairro());
        }
    }
}
