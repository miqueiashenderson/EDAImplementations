public class InsertionSort implements SortingStrategy {

    /**
    * O array  está ordenado exceto pelo último elemento. Esse método
    * deve colocar o último elemento em sua posição.
    * Importante: seu algoritmo deve ser O(n).
    */
    public void insereUltimoOrdenado(int[] v) {
		int i = v.length - 1;

		while(i > 0 && v[i] < v[i - 1]){
			int aux = v[i];
			v[i] = v[i - 1];
			v[i - 1] = aux;
			i -= 1;
		}
	}
   
    /**
    * O array  está ordenado exceto pelo primeiro elemento. Esse método
    * deve colocar o primeiro elemento em sua posição. Ao final da execução,
    * v deve estar ordenado.
    * Importante: seu algoritmo deve ser O(n);
    */
    public void inserePrimeiroOrdenado(int[] v) {
        int i = 0;
		while(i < v.length - 1 && v[i] > v[i + 1]){
			int aux = v[i];
			v[i] = v[i + 1];
			v[i + 1] = aux;
			i += 1;
		}
    }

    /**
    * Ordena um array de inteiros utilizando o insertion sort.
    */
    public void sort(int[] v) {
        for(int i = 1; i < v.length; i++){
			int chave = v[i];
			int j = i - 1;

			while(j >= 0 && v[j] > chave){
				v[j + 1] = v[j];
				j -= 1;
			}
			v[j + 1] = chave;
		}
    }

    /**
    * Ordena um array de inteiros utilizando o insertion sort de maneira recursiva.
    * Pense que insertion sort são várias execuções da inserção ordenada e use
    * essa estratégia chamando recursivamente. 
    * Você não pode mudar a assinatura desse método, mas pode/deve criar outros
    * métodos para te auxiliar na recursão.
    */

	public void sortRecursivo(int[] v) {
    	sortRecursivo(v, 1); // começa inserindo o elemento de índice 1
	}

	private void sortRecursivo(int[] v, int i) {
    	if (i >= v.length) return; // caso base: passou do fim

    	// insere v[i] na posição correta dentro de v[0..i]
    	int chave = v[i];
    	int j = i - 1;
    	inserir(v, j, chave);

    	sortRecursivo(v, i + 1); // ordena o restante
	}

	private void inserir(int[] v, int j, int chave) {
    	if (j < 0 || v[j] <= chave) {
        	v[j + 1] = chave;
        	return;
    	}
    	v[j + 1] = v[j];       // desloca para a direita
    	inserir(v, j - 1, chave);
	}
}
