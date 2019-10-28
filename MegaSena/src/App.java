
import java.util.Scanner;
import java.util.Arrays;

public class App {

    public static int getIntInput(Scanner input){
        return input.nextInt();
    }

    public static double valorDaAposta(int quantidadeNumeros){
        if(quantidadeNumeros == 6){
            return 3.50;
        }else if(quantidadeNumeros == 7){
            return 27.50;
        }else if(quantidadeNumeros == 8){
            return 98.00;
        }else if(quantidadeNumeros == 9){
            return 294.00;
        }else if(quantidadeNumeros == 10){
            return 735.00;
        }else if(quantidadeNumeros == 11){
            return 1617.00;
        }else if(quantidadeNumeros == 12){
            return 3234.00;
        }else if(quantidadeNumeros == 13){
            return 6006.00;
        }else if(quantidadeNumeros == 14){
            return 10510.50;
        }else if(quantidadeNumeros == 15){
            return 17517.50;
        }
        return 0.0;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero total de jogadas: ");

        int totalJogos = getIntInput(input);
        int matrizDeJogos[][] = new int[totalJogos][];

        int jogoAtual;

        // Loop responsável por preencher a matriz de jogadas

        for(jogoAtual = 0; jogoAtual < totalJogos; jogoAtual ++){

            int quantidadeNumeros,iteratorNumeroAtual;

            System.out.println("Quantos numeros terão sua jogada " +(jogoAtual + 1) + "? Máximo: 15 | Mínimo: 6, lembre-se que os números não podem ser repetidos.");
            quantidadeNumeros = getIntInput(input);

            while(quantidadeNumeros < 6 || quantidadeNumeros > 15){
                System.out.println("Essa quantia de numeros não é aceito em uma jogada, tente novamente:");
                quantidadeNumeros = getIntInput(input);
            }

            matrizDeJogos[jogoAtual] = new int[quantidadeNumeros];
            int numerosEscolhidos[] = new int[quantidadeNumeros];

            for(iteratorNumeroAtual = 0; iteratorNumeroAtual < quantidadeNumeros; iteratorNumeroAtual ++){
                System.out.println("Digite o numero "+(iteratorNumeroAtual + 1)+" de sua jogada: ");
                int numeroEscolhido = getIntInput(input);

                while(numeroEscolhido < 1 || numeroEscolhido > 60){
                    System.out.println("Os numeros devem estar no intervalo [1-60], informe outro numero:");
                    numeroEscolhido = getIntInput(input);
                }

                if(iteratorNumeroAtual > 0){
                    boolean numeroExistente = false;
                    for(int num : numerosEscolhidos) {
                        if(numeroEscolhido == num){
                            numeroExistente = true;
                        }
                    }
                    while(numeroExistente == true){
                        System.out.println("Numero já existente, digite outro numero:");
                        numeroEscolhido = getIntInput(input);
                        numeroExistente = false;
                        for(int num : numerosEscolhidos) {
                            if(numeroEscolhido == num){
                                numeroExistente = true;
                            }
                        }
                    }
                }

                matrizDeJogos[jogoAtual][iteratorNumeroAtual] = numeroEscolhido;
                numerosEscolhidos[iteratorNumeroAtual] = numeroEscolhido;

            }
        }

        // loop responsável por imprimir as jogadas
        int linha;
        double somaValorTotalAposta = 0.0;

        for(linha = 0; linha < totalJogos; linha ++){
            int arrayJogada[] = matrizDeJogos[linha];
            int tamanhoJogada = arrayJogada.length;
            somaValorTotalAposta += valorDaAposta(tamanhoJogada);
            System.out.println("Jogada " + (linha + 1) + ": " + Arrays.toString(arrayJogada));
        }

        System.out.println("O valor total da aposta foi de: R$" + somaValorTotalAposta);


    }
}
