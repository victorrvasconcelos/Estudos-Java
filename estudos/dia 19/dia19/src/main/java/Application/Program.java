package Application;
import entities.product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n;
        product p = new product();

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        double totalAltura = 0;
        double menoresIdade = 0;
        String name;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + i + "a" + " pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();

            totalAltura += altura[i];
            p.setTotalAltura(totalAltura);

            if (idade[i] < 16) {
                name = nome[i];
                menoresIdade++;
                p.setName(name);
                p.setMenoresIdade(menoresIdade);
            }
        }
        double totalMenores = menoresIdade / n;
        double total = 0;

        total = totalMenores * 100;
        p.setTotalMenores(total);
        totalAltura /= n;

        System.out.println();
        System.out.println("Altura média: " + String.format("%.2f",totalAltura));

        System.out.println("Pessoas com menos de 16 anos: " + p.getTotalMenores() + "%");
        System.out.println(p.getName());

        sc.close();
    }
}
