public class PesquisaBinariaRecursiva {

    public static int recursiva(int vetor[], int valor, int inicio, int fim) {
        // Verifica se o início é maior do que o fim (caso base de término da recursão)
        if (inicio > fim) {
            return -1; // O elemento não foi encontrado, retorna -1
        } else { // Calcula o ponto médio entre o início e o fim
            int meio = (inicio + fim) / 2;
            // Compara o valor com o elemento no ponto médio
            if (valor == vetor[meio]) {
                return meio; // Se encontrou o valor, retorna a posição (índice) do elemento
            }else if (valor > vetor[meio]) {
                // Se o valor for maior que o elemento do meio, faz uma chamada recursiva
                // na metade direita do vetor, ajustando o início e o fim

                return recursiva(vetor, valor,meio + 1, fim);
            } else {
                // Se o valor for menor que o elemento do meio, faz uma chamada recursiva
                // na metade esquerda do vetor, ajustando o início e o fim
                return recursiva(vetor, valor, inicio, meio - 1);
            }
        }
    }
}
