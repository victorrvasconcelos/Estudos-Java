import java.util.Locale;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int soma = 0;

        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
        sc.close();
    }
}
