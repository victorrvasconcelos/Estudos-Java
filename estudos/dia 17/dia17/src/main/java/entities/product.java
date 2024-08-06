package entities;

public class product {

    private double price;
    private double price2;
    private double retirada;

    public double getPrice() {
        return price + price2;
    }
    public double getRetirada() {
        return getPrice() - retirada;
    }
    public void setRetirada(double retirada) {
        this.retirada = retirada;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setPrice2(double price2) {
        this.price2 = price2;
    }

}
