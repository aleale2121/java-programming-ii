
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alefew
 */
public class University {

    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    

}
