import java.util.*;

class threeNPlusOne{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            
            if (sc.hasNextInt()) {
                int j = sc.nextInt();       
                int inicio = Math.min(i, j);
                int fim = Math.max(i, j);
                int maiorCiclo = 0;

                for (int n = inicio; n <= fim; n++) {
                    int tamanhoAtual = calcularTamanhoSequencia(n);
                    if (tamanhoAtual > maiorCiclo) {
                        maiorCiclo = tamanhoAtual;
                    }
                }
                System.out.println(maiorCiclo);
            }
        }
        sc.close();
    }
    public static int calcularTamanhoSequencia(long n) {
        int contador = 1;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }
            contador++;
        }
        return contador;
    }
}
