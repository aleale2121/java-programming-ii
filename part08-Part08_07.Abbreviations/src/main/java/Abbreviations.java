
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
public class Abbreviations {

    private HashMap<String, String> database;

    public Abbreviations() {
        this.database = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.database.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.database.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.database.get(abbreviation);

    }
}
