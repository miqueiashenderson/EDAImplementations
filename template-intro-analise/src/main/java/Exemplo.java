import java.io.*;
import java.util.*;

public class Exemplo {

	static final int REPETICOES = 30;

    public static void main(String[] args) {

        // lendo da entrada padrão
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            // Cabeçalho
            System.out.println("alg time sample");
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
				               
				// Arrays para armazenar os tempos individuais de cada repetição
    	long[] temposHash = new long[REPETICOES];
    	long[] temposFor = new long[REPETICOES];

    	for(int r = 0; r < REPETICOES; r++){
        	// Medição do HashSetlong
			long start = System.nanoTime();
        	duplicateElementsHashSet(tokens);        
        	temposHash[r] = System.nanoTime() - start;
    
        	// Medição do TwoFor
        	start = System.nanoTime();
        	duplicateElementsTwoFor(tokens);
        	temposFor[r] = System.nanoTime() - start;
    	}

    	// Ordenando os arrays para encontrar a mediana
    	Arrays.sort(temposHash);
    	Arrays.sort(temposFor);

    	// Pegando o elemento central (Mediana) em vez de calcular a média
    	long medianaHash = temposHash[REPETICOES / 2];
    	long medianaFor = temposFor[REPETICOES / 2];

	    // saída padrão: método tempo tamanho_da_entrada
    	System.out.println("duplicateElementsHashSet " + medianaHash + " " + tokens.length);
    	System.out.println("duplicateElementsTwoFor " + medianaFor + " " + tokens.length);	
			}	
		} catch (IOException ioe){} 
	}
    public static boolean duplicateElementsTwoFor(String[] tokens) {
    	for(int i = 0; i < tokens.length; i++){
			for(int j = i + 1; j < tokens.length; j++){
				if(tokens[i].equals(tokens[j])) return true;
			}
		}
		return false;
	}

	public static boolean duplicateElementsHashSet(String[] tokens) {
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < tokens.length; i++){
			if(set.contains(tokens[i])){
				return true;	
			}
			set.add(tokens[i]);
		}
		return false;
	}
}
