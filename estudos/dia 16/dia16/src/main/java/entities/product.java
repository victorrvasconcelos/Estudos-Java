package entities;

public class product {

        private double num;
        private double num2;
        private double escolha;

    public double getEscolha() {
        if (escolha == 1) {
            System.out.println("Operação Soma");
            escolha = num + num2;
        }
        else if (escolha == 2) {
            System.out.println("Operação Subtração");
            escolha = num - num2;
        }
        else if (escolha == 3) {
            System.out.println("Operação Multiplicação");
            escolha = num * num2;
        }
        else if (escolha == 4) {
            System.out.println("Operação Divisão");
            escolha = num / num2;
        }
        return escolha;
    }

    public void setEscolha(double escolha, double num, double num2) {
        this.escolha = escolha;
        this.num = num;
        this.num2 = num2;
    }
}
