import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        int numMenor = scanner.nextInt();

        System.out.println("Informe outro número que seja maior que o primeiro:");
        int numMaior = scanner.nextInt();

        while (numMaior <= numMenor) {
            System.out.printf("Número inválido! O segundo número deve ser maior que %d. Tente novamente: ", numMenor);
            numMaior = scanner.nextInt();  // Corrigido: estava solicitando numMenor novamente
        }
        scanner.nextLine();

        System.out.println("Escolha entre impar (i) e par (p): ");
        String opcao = scanner.nextLine().toLowerCase();

        while (!opcao.equals("i") && !opcao.equals("p")) {
            System.out.println("Opção inválida. Escolha entre (i) para impar ou (p) para par");
            opcao = scanner.nextLine().toLowerCase();
        }
    }
}
