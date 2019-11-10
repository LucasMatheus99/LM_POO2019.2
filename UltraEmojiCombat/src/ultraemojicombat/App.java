package ultraemojicombat;

public class App {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Lucas Matheus", "Brasil", 19, 1.74f,
                                    60f, 7, 0, 1 );
        l[1] = new Lutador("dead code", "França", 25, 1.79f,
                71f, 5, 2, 0 );
        l[2] = new Lutador("Putscript", "Alemanha", 30, 1.55f,
                76f, 1, 7, 3 );
        l[3] = new Lutador("Pretty Boy", "congo", 23, 1.68f,
                79f, 6, 2, 3 );
        l[4] = new Lutador("Jacaré", "Brasil", 30, 1.82f,
                95f, 16, 4, 1 );
        l[5] = new Lutador("Intelli Beans", "EUA", 26, 1.91f,
                100f, 4, 0, 1 );

        for (int i = 0; i <= l.length; i++){
            l[i].apresentar();
        }
    }
}
