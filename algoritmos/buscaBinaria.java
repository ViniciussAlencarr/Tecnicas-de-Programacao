package algoritmos;

public class buscaBinaria {
    public static int busca_binaria(int vetor[], int inicio, int fim, int valorProcurado) {
        while (inicio < fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == valorProcurado) {
                return meio;
            } else if (vetor[meio] > valorProcurado) {
                fim = meio - 1;
            } else if (vetor[meio] < valorProcurado) {
                inicio = meio + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(busca_binaria(vetor, 0, vetor.length - 1, 8));
    }
    
}
