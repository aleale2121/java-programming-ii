/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author alefew
 */
public class TemperatureSensor implements Sensor {

    private boolean isOn;
    private Random rand;

    public TemperatureSensor() {
        this.isOn = false;
        rand = new Random();
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if (isOn) {
            return rand.nextInt(61) - 30;
        } else {
            throw new IllegalStateException();
        }
    }

}
