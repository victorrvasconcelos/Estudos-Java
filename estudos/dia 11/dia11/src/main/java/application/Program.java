package application;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite o nome do produto: ");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        product.quantity = sc.nextInt();

        System.out.println("Produto: " + product);

        System.out.println();
        System.out.print("Número de Produtos no estoque: ");
        int quantity = sc.nextInt();
        product.addPProduct(quantity);

        System.out.println();
        System.out.print("Atualizado: " + product);

        System.out.println();
        System.out.print("Número de Produtos removido do estoque: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.print("Atualizado: " + product);

        sc.close();
    }
}