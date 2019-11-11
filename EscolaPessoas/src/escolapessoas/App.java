package escolapessoas;

public class App {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Lucas");
        v1.setSexo("M");
        v1.setIdade(20);

        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Fernando");
        a1.setMatricula(1111);
        a1.setCurso("ADS");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Sérgio");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

    }
}
