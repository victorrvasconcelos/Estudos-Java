package application;
import java.util.Locale;
import java.util.Scanner;
import entities.product;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        product p = new product();
        double price;
        double number;
        String titular;

        System.out.print("Digite o número da conta: ");
        number = sc.nextDouble();
        System.out.print("Insira o titular da conta: ");
        titular = sc.next();

        sc.next();

        System.out.print("Existe depósito inicial (s/n)?: ");
        char resp = sc.next().charAt(0);
        if (resp != 'n') {
            System.out.print("Insira um valor de depósito: ");
            price = sc.nextDouble();
            p.setPrice(price);
        }
        System.out.println();
        System.out.println("Dados Atualizados:");
        System.out.println("Conta: " + String.format("%.0f",number) + ", Suporte: " + titular + ", " + "Equilíbrio: $ " + String.format("%.2f",p.getPrice()));

        double price2;
        System.out.println();
        System.out.print("Insira um valor de depósito: ");
        price2 = sc.nextDouble();
        p.setPrice2(price2);
        System.out.println("Conta: " + String.format("%.0f",number) + ", Suporte: " + titular + ", " + "Equilíbrio: $ " + String.format("%.2f",p.getPrice()));

        double retirada;
        System.out.println();
        System.out.print("Insira um valor de retirada: ");
        retirada = sc.nextDouble();
        p.setRetirada(retirada);
        System.out.println("Dados da conta atualizados: ");
        System.out.println("Conta: " + String.format("%.0f",number) + ", Suporte: " + titular + ", " + "Equilíbrio: $ " + String.format("%.2f",p.getRetirada()));

        sc.close();
    }
}
