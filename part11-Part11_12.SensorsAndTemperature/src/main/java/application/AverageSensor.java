/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alefew
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> reads;

    public AverageSensor() {
        sensors = new ArrayList();
        reads = new ArrayList();

    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        if (!sensors.stream().noneMatch((s) -> (!s.isOn()))) {
            return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        sensors.forEach((s) -> {
            s.setOn();
        });
    }

    @Override
    public void setOff() {
      for (Sensor s : sensors) {
                 s.setOff();
            };
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty()) {
            throw new IllegalStateException();
        } else {
            int summ = 0;
            for (Sensor s : sensors) {
                summ += s.read();
            };
            int avg = Math.toIntExact(summ / sensors.size());
            this.reads.add(avg);
            return avg;
        }
    }

    public List<Integer> readings() {
        return this.reads;

    }
}
