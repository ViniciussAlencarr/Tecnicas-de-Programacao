package algoritmos;

public class buscaBinariaRecursiva {

    public static int buscaBinaria_Recursiva(int vetor[], int inicio, int fim, int valor) {
        if (inicio > fim) {return -1;}
        int meio = (inicio + fim) / 2;
        if (vetor[meio] == valor) {
            return meio;
        }
        if (vetor[meio] > valor) {
            return buscaBinaria_Recursiva(vetor, inicio, meio - 1, valor);
        } else if (vetor[meio] < valor) {
            return buscaBinaria_Recursiva(vetor, meio + 1, fim, valor);
        }
        return -1;
    }
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(buscaBinaria_Recursiva(vetor, 0, vetor.length - 1, 8));
        
        
    }
    
}
