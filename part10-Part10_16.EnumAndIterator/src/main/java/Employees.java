
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        employees.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator
                = employees.stream().
                        filter(p -> p.getEducation() == education).
                        iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
    
    public void fire(Education education){
         Iterator<Person> iterator
                = employees.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
