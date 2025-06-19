import exceptions.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int numMenor = scanner.nextInt();

        System.out.println("Informe o segundo número (maior que o primeiro):");
        int numMaior = scanner.nextInt();

        try {
            while (numMenor >= numMaior) {
                System.out.println("O segundo número deve ser maior que o primeiro.");
                System.out.println("Informe o segundo número (maior que o primeiro):");
                numMaior = scanner.nextInt();
            }
            contar(numMenor, numMaior);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    static void contar(int numMenor, int numMaior) throws ParametrosInvalidosException {
        int contagem = numMaior - numMenor;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo número " + i);
        }
    }
}