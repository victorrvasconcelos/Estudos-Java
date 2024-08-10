package Application;
public class Program {
    public static void main(String[] args) {

        int x = 20;
        Integer obj = x;
        System.out.println(obj);
        int y = obj * 2;
        System.out.println(y);

        System.out.println("-------------------");
        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        
        System.out.println("-------------------");
        for (String obj1 : vect) {
            System.out.println(obj1);
        }

    }
}
