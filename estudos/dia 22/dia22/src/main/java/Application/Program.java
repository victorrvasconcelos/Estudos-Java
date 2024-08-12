package Application;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Maria");
        list.add("Maria");
        list.add(2, "Marco");
        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------");

        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------");

        System.out.println("Index of Alex: " + list.indexOf("Alex"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("----------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
        sc.close();
    }
}
