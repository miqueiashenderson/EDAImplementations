import java.util.Arrays;

public class AssertsMoveImpostor {

    public static void runTests() {
        int[] in = new int[]{1, 2, 4, 3, 7, 90};
        int[] expect = new int[]{1, 2, 3, 4, 7, 90};
        int[] actual = MoveImpostor.moveImpostor(in);
        assert Arrays.equals(expect, actual) : "Caso 1 falhou. Esperado: " + Arrays.toString(expect) + " Obtido: " + Arrays.toString(actual);

        in = new int[]{5, 7, 8, 19, -4, 4, 1, 6, 8, 12, 81, 3};
        expect = new int[]{-4, 5, 7, 8, 19, 4, 1, 6, 8, 12, 81, 3};
        actual = MoveImpostor.moveImpostor(in);
        assert Arrays.equals(expect, actual) : "Caso 2 falhou. Esperado: " + Arrays.toString(expect) + " Obtido: " + Arrays.toString(actual);

        in = new int[]{10, 14, 12};
        expect = new int[]{10, 12, 14};
        actual = MoveImpostor.moveImpostor(in);
        assert Arrays.equals(expect, actual) : "Caso 3 falhou. Esperado: " + Arrays.toString(expect) + " Obtido: " + Arrays.toString(actual);

        in = new int[]{-1, 0, 1, 2, 5, 7, 9, 3};
        expect = new int[]{-1, 0, 1, 2, 3, 5, 7, 9};
        actual = MoveImpostor.moveImpostor(in);
        assert Arrays.equals(expect, actual) : "Caso 4 falhou. Esperado: " + Arrays.toString(expect) + " Obtido: " + Arrays.toString(actual);
    }

    public static void main(String[] args) {
        boolean assertsEnabled = false;
        assert assertsEnabled = true;

        if (!assertsEnabled) {
            System.err.println("Ative assertions com -ea para executar os testes.");
            System.exit(1);
        }

        runTests();
    }
}
