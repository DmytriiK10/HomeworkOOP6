package Vehicle;

public enum Vehicles {
    BMW(500), Mersedes(600), Audi(700);

    private final int price;

    Vehicles(int price) {
        this.price = price;

    }

    public String getColor(String color) {
        return color;

    }
    public String toString() {
        return "BMW Color : " + BMW.getColor("Green")   + "\nBMW price : " + BMW.price + "\nMersedes Color : " +  Mersedes.getColor("Black") + "\nMersedes price : " + Mersedes.price + "\nAudi Color : " + Audi.getColor("White") + "\nAudi price : " + Audi.price;
    }

    public static void main(String[] args) {
        Vehicles vehicle1 = Vehicles.BMW;
        System.out.println(BMW.toString());

    }


}




