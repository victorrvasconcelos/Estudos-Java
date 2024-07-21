import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int resultado1 = scanner.nextInt();
        System.out.print("Agora digite outro valor: ");
        int resultado2 = scanner.nextInt();

        System.out.print("Resultado da multiplicação: " + resultado1 * resultado2);

        scanner.close();
    }
}

