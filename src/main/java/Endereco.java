public class Endereco {
    public String rua;
    public String bairro;
    public int num;

    public void Endereco(String rua, String bairro, int num){
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
    }

    public String getRua(){
        return rua;
    }

    public int getNum() {
        return num;
    }

    public String getBairro() {
        return bairro;
    }

}
