public class SelectionSort implements SortingStrategy {
	
    /**
    * Ordena um array de inteiros utilizando o selection sort.
    */
    public void sort(int[] v) {
        for(int i = 0; i < v.length; i++){
			int min_index = i;
			for(int j = i + 1; j < v.length; j++){
				if(v[j] < v[min_index]){
					min_index = j;
				}
			}
			int aux = v[i];
			v[i] = v[min_index];
			v[min_index] = aux;
		}
    }

    /**
    * Ordena um array de inteiros utilizando o selection sort de maneira recursiva.
    * Pense que selection sort são várias execuções da atividade de procurar 
    * o menor e colocá-lo em seu lugar. Use essa estratégia chamando recursivamente. 
    * Você não pode mudar a assinatura desse método, mas pode/deve criar outros
    * métodos para te auxiliar na recursão.
    */
    public void sortRecursivo(int[] v) {
		sortRecursivo(v, 0);	
	}
	
	public void sortRecursivo(int[] v, int i){
		/**
		 * Caso base é se o indice não se encontra no ultimo índice do vetor.
		 * */
		if(i < v.length - 1){
			int j = smallest(v, i);
			/**Swap*/
			int aux = v[i];
			v[i] = v[j];
			v[j] = aux;
			/**Chamada recursiva i + 1*/
			sortRecursivo(v, i + 1);
		}
	}
	
	public int smallest(int[] v, int j){
		/**
		 * Caso base: se j é igual ao último indice do vetor.
		 * */
		if(j == v.length - 1) return j;	
		int k = smallest(v, j + 1);
		return v[j] < v[k] ? j : k;
	}
}
