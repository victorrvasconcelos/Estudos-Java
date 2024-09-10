package entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double multi = 0;
        if (getAnualIncome() < 20000.00) {
            multi = (getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.50);
        }
        else if (getAnualIncome() > 20000.00) {
            multi = (getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.50);
        }
        return multi;
    }
}
