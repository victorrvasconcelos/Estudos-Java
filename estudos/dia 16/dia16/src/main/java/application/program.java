package application;
import java.util.Locale;
import java.util.Scanner;
import entities.product;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite 2 números: ");
        double num = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Agora escolha sua operação");
        double escolha = sc.nextDouble();
        product p = new product();

        p.setEscolha(escolha, num, num2);

        System.out.println("Calculo: " + p.getEscolha());


    }
}
