package projetopessoas;

public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private float salario;

    //Métodos
    public void receberAum(float aumento){
        this.salario += aumento;
    }

    //Métodos Especiais get/set
    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }
}
