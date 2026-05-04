import java.util.*;

class duplicateElements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String[] tokens = sc.nextLine().split(" ");
		
		boolean out = false;

		for(int i = 0; i < tokens.length; i++){
			for(int j = i + 1; j < tokens.length; j++){
				if(tokens[i].equals(tokens[j])) {
					out = true;
				}
			}
		}
		System.out.println(out);
	}
}

