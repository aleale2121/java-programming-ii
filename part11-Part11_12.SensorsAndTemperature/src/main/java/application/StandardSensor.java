/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author alefew
 */
public class StandardSensor implements Sensor{
    private int n;

    public StandardSensor(int n) {
        this.n=n;
    }
    

    @Override
    public boolean isOn() {
        return true;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        return n;
    }
    
}
