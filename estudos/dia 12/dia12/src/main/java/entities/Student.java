package entities;

public class Student {
    public String name;
    public double nota;
    public double nota2;
    public double nota3;

    public double trimestre() {
        return nota + nota2 + nota3;
    }

    public String resultado() {
        double missao = 0;
        String retorno = "";

        System.out.println("FINAL GRADE = " + trimestre());

        if (trimestre() >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            missao = 60 - trimestre();
            retorno = "MISSING " + missao + " POINTS";
        }

        return retorno;
    }
}
