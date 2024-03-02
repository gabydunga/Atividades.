public class Aluno {
    private String nome;
    private double matricula;
    private String curso;

    public Aluno(){
    }
    public Aluno (String nome){
        this.nome = nome;
    }
    public Aluno (String nome,double matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public String getNome(){
        return nome;
    }
    public double getMatricula(){
        return matricula;
    }
    public String getCurso(){
        return curso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMatricula(double matricula){
        this.matricula = matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
 
    
    
}


