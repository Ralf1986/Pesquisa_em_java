import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int valor, posicao = -1;
        int[] vetor = {1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95};
        int inicio = 0; // Declare e defina a variável inicio
        int fim = vetor.length - 1; // Declare e defina a variável fim



        int escolha;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Qual número você quer procurar? \n");
            valor = scanner.nextInt();
            System.out.println("Qual forma de pesquisa:\n");
            System.out.println("\t1 - Sequencial");
            System.out.println("\t2 - Binaria");
            System.out.println("\t3 - Recursiva");
            System.out.println("\t4 - sair");

            escolha = scanner.nextInt();


            switch (escolha) {
                case 1:
                    posicao = PesquisaSequencial.sequencial(vetor, valor);
                    extracted(posicao);
                    break;
                case 2:
                    posicao = PesquisaBinaria.Binaria(vetor, valor);
                    extracted(posicao);
                    break;
                case 3:
                    posicao = PesquisaBinariaRecursiva.recursiva(vetor, valor, inicio, fim);
                    extracted(posicao);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 4);


        //extracted(posicao);
    }

    private static void extracted(int posicao) {
        if (posicao == -1)
            System.out.println("Elemento não encontrado.\n");
        else
            System.out.println("Elemento encontrado na posição: " + posicao + " do vetor\n");
    }


}
