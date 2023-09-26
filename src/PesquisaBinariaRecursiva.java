public class PesquisaBinariaRecursiva {

    public static int recursiva(int vetor[], int valor, int inicio, int fim) {

        if (inicio > fim) {
            return -1;
        } else {
            int meio = (inicio + fim) / 2;
            if (valor == vetor[meio]) {
                return meio;
            }else if (valor > vetor[meio]) {
                return recursiva(vetor, valor,meio + 1, fim);
            } else {
                return recursiva(vetor, valor, inicio, meio - 1);
            }
        }
    }
}
