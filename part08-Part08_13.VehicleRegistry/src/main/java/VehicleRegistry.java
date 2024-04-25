
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alefew
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> cars;

    public VehicleRegistry() {
        this.cars = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.cars.get(licensePlate) == null) {
            this.cars.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (this.cars.get(licensePlate) != null) {
            return this.cars.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.cars.get(licensePlate) != null) {
            this.cars.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.cars.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> names = new ArrayList<>();
        for (String owner : this.cars.values()) {
            if (!names.contains(owner)) {
                names.add(owner);
            }
        }
        for (String owner : names) {
            System.out.println(owner);
        }
    }
}
