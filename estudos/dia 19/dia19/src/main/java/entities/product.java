package entities;

public class product {
        private double totalMenores;
        private double menoresIdade;
        private double TotalAltura;
        private String name;

        public double getTotalMenores() {
            return totalMenores;
        }
        public void setTotalMenores(double totalMenores) {
            this.totalMenores = totalMenores;
        }

        public void setMenoresIdade(double menoresIdade) {
            this.menoresIdade = menoresIdade;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    public double getTotalAltura() {
        return TotalAltura;
    }

    public void setTotalAltura(double totalAltura) {
        TotalAltura = totalAltura;
    }
}
