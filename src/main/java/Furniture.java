package main.java;

public class Furniture extends Product {


    public Furniture(Furnitures furnitures) {
        super(furnitures.getName(), furnitures.getPrice());
    }

    public enum Furnitures {
        CHAIR("chair", 5000), TABLE("Table", 10000), BED("Bed", 20000);
        private final int price;
        private final String name;

        public int getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        Furnitures(String name, int price) {
            this.name = name;
            this.price = price;
        }


    }
}
