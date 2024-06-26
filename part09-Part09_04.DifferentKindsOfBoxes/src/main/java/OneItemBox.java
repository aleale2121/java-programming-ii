
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
public class OneItemBox extends Box{
       private ArrayList<Item> items;

    public OneItemBox() {
        super();
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.items.size() < 1) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    } 
}
