
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
public class Herd implements Movable {

    private ArrayList<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable herd : herds) {
            herd.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (Movable herd : herds) {
            str += herd.toString() + "\n";
        }
        return str;
    }

}
