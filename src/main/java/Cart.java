package main.java;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    static List<ProductInventory> items = new ArrayList<>();

    public void AddItem(Product newItem) {
        ProductInventory product = isExist(newItem);
        if (product == null) {
            items.add(new ProductInventory(newItem, 1));
            return;
        }
        product.setQuantity(product.getQuantity() + 1);
    }

    private ProductInventory isExist(Product newItem) {
        for (ProductInventory item : items) {
            if (item.getProduct().getName().equals(newItem.getName())) {
                return item;
            }
        }
        return null;
    }
}






