// Atividade 4
public class Fibonacci {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        int contador = 0;

        while (contador < 10) {
            System.out.print(primeiro);

            if (contador < 9) {
                System.out.print(", "); 
                // vírgula depois dos primeiros 9 números
            }

            int proximo = primeiro + segundo; 
            primeiro = segundo; 
            segundo = proximo;  
            

            contador++; 
        }
    }
}
