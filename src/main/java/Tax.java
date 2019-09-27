package main.java;

enum TaxSlab {

    FOOD, FURNITURE, ELECTRONIX;


        public int getGstSlabs() {
        switch (this) {
            case FOOD:
                return 0;

            case FURNITURE:
                return 10;

            case ELECTRONIX:
                return 15;

        }
        return 0;
    }
}