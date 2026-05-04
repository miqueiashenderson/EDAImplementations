import java.util.*;
public class ComparacaoBusca {
    public int buscaBinariaRecursiva(int[] v, int ini, int fim, int n) {
		if (ini <= fim) {    
        int meio = (ini + fim) / 2;

        if (v[meio] == n) return meio;

        if (n < v[meio])
            return buscaBinariaRecursiva(v, ini, meio - 1, n);
        else
            return buscaBinariaRecursiva(v, meio + 1, fim, n);
	} else {
		return -1;
	} /*
		if(ini <= fim){
			int meio = (ini + fim) / 2;
			if(v[meio] == n){return meio;}
			if(n < v[meio]){
				return buscaBinariaRecursiva(v, ini, meio - 1, n);
			}
			else{
				return buscaBinariaRecursiva(v, meio + 1, fim, n);
				} 
		} else {
        return -1;
    	}*/
	}

    public int buscaBinariaIterativa(int[] v, int chave) {
        int inicio = 0, fim = v.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (v[meio] == chave)
                return meio;

            if (v[meio] < chave)
                inicio = meio + 1;
            else
                fim = meio - 1;
        }

        return -1;
    }

}
