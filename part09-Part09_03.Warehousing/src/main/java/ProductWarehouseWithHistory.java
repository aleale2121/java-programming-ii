/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alefew
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{   
    
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.changeHistory.add(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double output = super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        return output;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.changeHistory);
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }

    public String history() {
        return this.changeHistory.toString();
    }
}
