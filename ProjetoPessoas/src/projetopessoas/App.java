package projetopessoas;

public class App {
    public static void main(String[] args) {
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Sérgio");
        p2.setNome("Fernando");
        p3.setNome("Lucas");
        p4.setNome("Menino Do Cabelão");

        p1.setIdade(19);
        p1.setSexo("Masculino");
        p2.setIdade(21);
        p2.setSexo("Masculino");
        p3.setIdade(20);
        p3.setSexo("Masculino");
        p4.setIdade(22);
        p4.setSexo("Masculino");


        p2.setCurso("ADS");
        p3.setSalario(2500);
        p4.setSetor("Faz Tudo!");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
