package projetopessoas;

public class Funcionario extends Pessoa {
    //atributos

    private String setor;
    private Boolean trabalhando;

    //Métodos

    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    //Métodos Especiais get/set

    public String getSetor(String setor) {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
