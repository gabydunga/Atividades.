public class Pessoa {
    private String nome;
    private int idade;
    private String endereço;

    public Pessoa(){
    }
    public Pessoa (String nome){
        this.nome = nome;
    }
    public Pessoa (String nome,int idade, String endereço){
        this.nome = nome;
        this.idade = idade;
        this.endereço = endereço;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getEndereço(){
        return endereço;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setEndereço(String endereço){
        this.endereço = endereço;
    }
}
