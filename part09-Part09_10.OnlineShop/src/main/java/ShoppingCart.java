
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alefew
 */
public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.items.get(product) == null) {
            this.items.put(product, new Item(product, 1, price));
        } else {
            this.items.get(product).increaseQuantity();
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : this.items.values()) {
            totalPrice = totalPrice + item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : this.items.values()) {
            System.out.println(item);
        }
    }
}
