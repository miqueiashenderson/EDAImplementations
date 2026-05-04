import java.util.*;

class searchBinaryRecursive{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String input = sc.nextLine();
        String[] partes = input.split(" ");
        int[] arr = new int[partes.length];
        
        for (int i = 0; i < partes.length; i++) {
            arr[i] = Integer.parseInt(partes[i]);
        }

		int element = sc.nextInt();
		System.out.println(buscaBinariaRecursiva(arr, 0, arr.length - 1, element));
	}

	public static int buscaBinariaRecursiva(int[] v, int ini, int fim, int n) {
		if (ini <= fim) {    
        int meio = (ini + fim) / 2;

        if (v[meio] == n) {
                if (meio == 0 || v[meio - 1] != n) {
                    return meio;
                } else {
                    return buscaBinariaRecursiva(v, ini, meio - 1, n);
                }
            }

        if (n < v[meio]){
            return buscaBinariaRecursiva(v, ini, meio - 1, n);
		} else {
            return buscaBinariaRecursiva(v, meio + 1, fim, n);
			}
		}
		return -1;
	}
	
	
}
