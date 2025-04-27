// Atividade 3
public class SomaVetor {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 9, 1, 7, 4, 8, 3, 6, 10};

        int soma = 0; 

        
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i]; 
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
