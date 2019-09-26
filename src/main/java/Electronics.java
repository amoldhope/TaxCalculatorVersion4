package main.java;

public class Electronics extends Product {


    public Electronics(ElectrnicsAppliences electrnicsAppliences) {
        super(electrnicsAppliences.name, electrnicsAppliences.price);
    }


    public enum ElectrnicsAppliences {
        TELEVISION("TV", 40000), FREEZE("Freeze", 30000), MOBILE("Mobile", 30000), HEADPHONES("Headphones", 4000);

        private final String name;
        private final int price;

        ElectrnicsAppliences(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }
}
