package escolapessoas;

public class Bolsista extends Aluno {
    //Atributo

    private float bolsa;

    //Métodos

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de: " +this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
    }

    //Métodos Especiais

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
