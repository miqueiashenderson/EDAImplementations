import java.util.Scanner;

class elementsFrequency{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String[] tokens = sc.nextLine().split(" ");
		int out = 0;

		for(int i = 0; i < tokens.length; i++){
			if(Integer.parseInt(tokens[i]) == n){
				out++;
			}
		}
		System.out.println(out);
	}
}
