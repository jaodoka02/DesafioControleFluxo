import java.util.Scanner;

public class testeContador
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");

        int num2 = scanner.nextInt();

        scanner.close();

        try {
            if (num1 >= num2) {
                throw new ParametrosInvalidosException();
            }

            for (int i = num1; i <= num2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}