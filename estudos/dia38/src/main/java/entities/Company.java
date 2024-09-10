package entities;

public class Company extends TaxPayer {
    private int numberExpenditures;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, int numberExpenditures) {
        super(name, anualIncome);
        this.numberExpenditures = numberExpenditures;
    }

    public int getNumberExpenditures() {
        return numberExpenditures;
    }

    public void setNumberExpenditures(int numberExpenditures) {
        this.numberExpenditures = numberExpenditures;
    }

    @Override
    public double tax() {
        double pessoaJuridica = 0.16;

        if (getNumberExpenditures() > 10) {
            pessoaJuridica = getAnualIncome() * 0.14;
        }

        return pessoaJuridica;
    }
}
