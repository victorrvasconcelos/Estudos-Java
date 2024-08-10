package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.rent;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        rent r = new rent();
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        double totalAltura = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            genero[i] = sc.next().charAt(0);
        }

        System.out.print("Menor altura = ");
        totalAltura = altura[0];
        for (int i = 0; i < n; i++) {
            if (altura[i] < totalAltura) {
                totalAltura = altura[i];
                System.out.print(totalAltura);
            }
        }
        System.out.println();
        System.out.print("Maior altura = ");
        totalAltura = altura[0];
        for (int i = 0; i < n; i++) {
            if (altura[i] > totalAltura) {
                totalAltura = altura[i];
                System.out.print(totalAltura);
            }
        }
        System.out.println();
        double media = 0;
        double soma = 0;
        double quantidadeMulheres = 0;
        System.out.print("Media das alturas das mulheres = ");
        for (int i = 0; i < n; i++) {
            if (genero[i] != 'M') {
                quantidadeMulheres++;
                soma = altura[i];
                media += soma;
            }
        }
        media /= quantidadeMulheres;
        System.out.println(String.format("%.2f",media));

        double quantidadeHomens = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] != 'F') {
                quantidadeHomens++;
            }
        }
        System.out.printf("Numero de homens = " + String.format("%.0f",quantidadeHomens));

        sc.close();
    }
}
