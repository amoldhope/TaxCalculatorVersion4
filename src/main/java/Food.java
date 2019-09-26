package main.java;

public class Food extends Product {
    public Food(Foods foods) {
        super(foods.getname(), foods.getPrice());
    }

    public enum Foods {
        RICE("Rice", 50), SUGAR("Sugar", 44),
        BISCUITS("Bisciut", 666), WHEAT("Wheat", 777),
        JUICE("Juice", 33), DAAL("Daal", 33);

        private String name;
        private int price;

        Foods(String foods, int price) {
            this.name = foods;
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public String getname() {
            return name;
        }
    }
}



