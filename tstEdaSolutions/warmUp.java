import java.util.Scanner;

class warmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        String[] partes = sc.nextLine().trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < partes.length; i++) {
            if (i > 0) sb.append(" ");
            sb.append(n * Integer.parseInt(partes[i]));
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
