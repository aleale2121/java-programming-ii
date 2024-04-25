
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
public class IOU {

    private HashMap<String, Double> owes;

    public IOU() {
        this.owes = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        Double owed = owes.getOrDefault(toWhom, 0.0);
        owed += amount;
        this.owes.put(toWhom, owed);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return owes.getOrDefault(toWhom, 0.0);
    }
}
