public class PesquisaSequencial {


    public static int sequencial(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
