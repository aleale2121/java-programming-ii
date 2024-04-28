/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alefew
 */
public class Plane {
    private String ID;
    private String model;

    public Plane(String ID, String model, int yearOfIntroduction) {
        this.ID = ID;
        this.model = model;
        this.yearOfIntroduction = yearOfIntroduction;
    }
    private int yearOfIntroduction;
}
