package algoritmos;
public class buscaLinear {
    public static int busca_linear(int vetor[], int valorProcurado) {
        for (int i = 0; i < vetor.length - 1; i++) { 
            if (vetor[i] == valorProcurado) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(busca_linear(vetor, 6));
        
    }
    
}
