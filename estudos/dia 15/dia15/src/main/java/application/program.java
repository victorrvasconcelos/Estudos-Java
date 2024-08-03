package application;
import java.util.Locale;
import java.util.Scanner;
import entities.product;
public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Escola");
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Dinheiro: ");
        double price = sc.nextDouble();
        product product = new product();

        product.setName(nome);
        product.setPrice(price);

        System.out.println("Nome: " + product.getName());
        System.out.println("Price: " + product.getPrice());

    }
}
