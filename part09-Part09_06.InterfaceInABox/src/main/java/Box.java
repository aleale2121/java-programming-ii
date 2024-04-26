
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
public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> items;
    private int totalWeight;

    public Box(double capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
        totalWeight = 0;
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : this.items) {
            weight = weight + item.weight();
        }
        return weight;
    }

    public void add(Packable packable) {
        if (packable.weight() + this.weight() <= this.capacity) {
            this.items.add(packable);
        }
    }


    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
