public class MoveImpostor {
    public static int[] moveImpostor(int[] in) {
        int indexImpostor = searchImpostor(in);
		int j;
        /*
		while (j > 0 && in[j - 1] > in[j]) {
            int temp = in[j];
            in[j] = in[j - 1];
            in[j - 1] = temp;
            j--;
        }*/
		for(j = indexImpostor; j > 0 && in[j - 1] > in[j]; j--){
			int temp = in[j];
			in[j] = in[j - 1];
			in[j - 1] = temp;
		}
        return in;
    }

    public static int searchImpostor(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;  
            }
        }
        return -1;
    }
}
