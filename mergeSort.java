public class mergeSort {
    public static void merge(int vetor[], int inicio, int meio, int fim, int vetorAux[]) {
        int left = inicio;
        int right = meio;
        for (int i = inicio; i < fim; ++i) {
            if ((left < meio) && ((right >= fim) || (vetor[left] < vetor[right]))) {
                vetorAux[i] = vetor[left];
                ++left;
            } else {
                vetorAux[i] = vetor[right];
                ++right;
            }
        }
        for (int i = inicio; i < fim; ++i) {
            vetor[i] = vetorAux[i];
        }
    }

    static void mergeSort(int vetor[], int left, int right, int vetorAux[]) {
        if ((right - left) < 2) {
            return;
        }
        int middle = ((left + right) / 2);
        mergeSort(vetor, left, middle, vetorAux);
        mergeSort(vetor, middle, right, vetorAux);
        merge(vetor, left, middle, right, vetorAux);
    }
    public static void main(String[] args) {
        int vetor[] = {2,5,1,3,4};
        int vetorAux[] = new int[5];
        for (int i : vetor) {
            System.out.println(i);
        }
        mergeSort(vetor, 0, 5, vetorAux);
        for (int i : vetor) {
            System.out.println(i);
        }
    }
}
