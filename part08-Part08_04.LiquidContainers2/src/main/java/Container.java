/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alefew
 */
public class Container {

    private int liquid;

    public Container() {
        this.liquid = 0;
    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.liquid=Math.min(this.liquid + amount, 100);
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.liquid=Math.max(0, this.liquid - amount);
        }
    }

    public String toString() {
        return this.liquid + "/100";
    }
}
