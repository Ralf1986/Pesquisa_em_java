public class PesquisaBinaria {
                                            // para busca binaria os valores da lista precisam estar ordenados
    public static int Binaria(int[] vetor, int valor){
        int inicio = 0;
        int fim = vetor.length;
        int meio;
        while(inicio <= fim){               // vai repetir até o valor for igual a meio
            meio = (inicio + fim)/2;        // encontra o meio do vetor

            if (valor == vetor[meio]){      // se for o valor igual, retorna o valor
                return meio;

            }else if(valor > vetor[meio]){  // se o valor for maior que o meio, o inicio passa a ser o meio mais um
                inicio = meio + 1;
            }else
                fim = meio -1;              // inicio continua, deloca espaço de busca
        }
        return  -1;
    }

}
