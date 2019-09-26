package main.java;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class TaxCalculator<Public> {
    int totalFoodAmount;
    int totalFurnitureAmout;
    int totalElectronixAmount;

    public String calculate(List<ProductInventory> items) {
        getFoodBill(items);
        getElectronicsBill(items);
        getFurnitureBill(items);
        applyDiscount();
        applyGst();
        return invoice(items);
    }

    private void getFoodBill(List<ProductInventory> items) {
        for (ProductInventory item : items) {
            if (item.getProduct() instanceof Food) {
                Food food = (Food) item.getProduct();
                totalFoodAmount += (food.getPrice() * item.getQuantity());
            }
        }
    }

    private void getElectronicsBill(List<ProductInventory> items) {
        for (ProductInventory item : items) {
            if (item.getProduct() instanceof Furniture) {
                Furniture furniture = (Furniture) item.getProduct();
                totalFurnitureAmout += (furniture.getPrice() * item.getQuantity());

            }
        }
    }

    private void getFurnitureBill(List<ProductInventory> items) {
        for (ProductInventory item : items) {
            if (item.getProduct() instanceof Electronics) {
                Electronics electronics = (Electronics) item.getProduct();
                totalFoodAmount += (electronics.getPrice() * item.getQuantity());
            }
        }
    }

    void applyGst() {
        totalFoodAmount += totalFoodAmount * TaxSlab.FOOD.getGstSlabs() / 100;
        totalFurnitureAmout += totalFurnitureAmout * TaxSlab.FURNITURE.getGstSlabs() / 100;
        totalElectronixAmount += totalFurnitureAmout * TaxSlab.ELECTRONIX.getGstSlabs() / 100;
    }

    public void applyDiscount() {
        double discountRate = 0.10;
        if (totalFoodAmount > 1000) {
            totalFoodAmount -= totalFoodAmount * discountRate;
        }
        if (totalFurnitureAmout > 1000) {
            totalFurnitureAmout -= totalFurnitureAmout * discountRate;
        }
        if (totalElectronixAmount > 1000) {
            totalElectronixAmount -= totalElectronixAmount * discountRate;
        }
    }

    String invoice(List<ProductInventory> items) {
        String invoice = "Product  price  quantity  total\n";
        for (ProductInventory item : items) {
            invoice += item.getProduct().getName() + "  " + item.getProduct().getPrice() + "   " + item.getQuantity() + "       " + (item.getProduct().getPrice() * item.getQuantity()) + "\n";
        }
        invoice += "\ntotal bill " + (totalFurnitureAmout + totalFoodAmount + totalElectronixAmount);
        return invoice;
    }
}
