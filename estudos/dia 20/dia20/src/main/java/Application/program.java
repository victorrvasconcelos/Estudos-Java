package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.rent;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        rent[] vect = new rent[10];
        System.out.print("Quantos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + (i+1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new rent(nome, email);
        }
        System.out.println();
        System.out.println("Quartos Alugados: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

    }
}
