package projetopessoas;

public class Aluno extends Pessoa {
    //Atributos além dos de pessoa
    private int matricula;
    private String curso;

    //Métodos
    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada!");
    }

    //Métodos Especiais get/set/

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
}
