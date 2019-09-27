package main.java;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    static List<ItemInventory> items = new ArrayList<>();

    public void AddItem(Product newItem) {
        ItemInventory item = isExist(newItem);
        if (item == null) {
            items.add(new ItemInventory(newItem, 1));
            return;
        }
        item.setQuantity(item.getQuantity() + 1);
    }

    private ItemInventory isExist(Product newItem) {
        for (ItemInventory item : items) {
            if (item.getProduct().getName().equals(newItem.getName())) {
                return item;
            }
        }
        return null;
    }
}






