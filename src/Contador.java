import exceptions.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numMenor = scanner.nextInt();

        System.out.println("Informe outro número que seja maior que o primeiro:");
        int numMaior = scanner.nextInt();

        try {
            if (numMenor >= numMaior) {
                throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
            }
            contar(numMenor, numMaior);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int numMenor, int numMaior) {
        for (int i = numMenor; i <= numMaior; i++) {
            System.out.println(i);
        }
    }
}
