
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alefew
 */
public class BoxWithMaxWeight extends Box {

   private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        super();
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public int capacitySUM() {
        int sum = 0;
        for (Item item : this.items) {
            sum = sum + item.getWeight();
        }
        return sum;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + capacitySUM() <= capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
