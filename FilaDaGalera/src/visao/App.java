package visao;

import modelo.Povo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<Povo> prioridade = new LinkedList<>();
        prioridade.add(new Povo("Fábio", "111.111.111-11", "Professor", "ADS"));
        prioridade.add(new Povo("Paulo", "222.222.222-22", "Professor", "ADS"));
        prioridade.add(new Povo("Diogo", "333.333.333-33", "Professor", "ADS"));
        prioridade.add(new Povo("Diego", "444.444.444-44", "Professor", "ADS"));
        prioridade.add(new Povo("Ricardo", "555.555.555-55", "Professor", "ADS"));
        prioridade.add(new Povo("Andre", "666.666.666-01", "Professor", "ADS"));
        prioridade.add(new Povo("Daladier", "999.999.999-03", "Professor", "ADS"));

        Queue<Povo> convencional = new LinkedList<>();
        convencional.add(new Povo("Lucas", "777.777.777-77","Estudante", "ADS"));
        convencional.add(new Povo("Sérgio", "666.666.666-02","Estudante", "ADS"));
        convencional.add(new Povo("Iarlysson", "888.888.888-88","Estudante", "ADS"));

        int contador=0;
        while ((!prioridade.isEmpty()) && (!convencional.isEmpty())) {
            while ((contador < 3) && (!prioridade.isEmpty())) {
                System.out.println("Prioridade atendida " + prioridade.poll() + "\n");
                contador += 1;
            }
            if (contador == 3) {
                System.out.println("Convencional atendida " + convencional.poll() + "\n");
                contador = 0;
            }
            else if ((prioridade.isEmpty()) && (!convencional.isEmpty())){
                System.out.println("Convencional atendida " + convencional.poll() + "\n");
                contador = 0;
            }
        }
    }
}