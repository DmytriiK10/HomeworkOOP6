public enum Animals {
    Cats(15), Dogs(21), Fish(30), Birds(7), Cows(10);

    private final int Age;

    Animals(int Age) {
        this.Age = Age;
    }

    public String toString() {
        return "Cats Age : " + Cats.Age + "\nDogs Age  : " + Dogs.Age + "\nFisg Age : " + Fish.Age + "\nBirds Age : " + Birds.Age + "\nCows Age : " + Cows.Age;

    }

    public static void main(String[] args) {
        Animals animals1 = Animals.Cats;
        System.out.println(Cats.toString());

    }
}

