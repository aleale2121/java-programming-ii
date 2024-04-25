
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alefew
 */
public class TodoList {

    private ArrayList<String> lists = new ArrayList<>();

    public TodoList() {}

    public void add(String task) {
        lists.add(task);
    }

    public void remove(int number) {
        if (number<=lists.size()) {
            lists.remove(number - 1);
        }
    }
    
    public void print(){
        for (int i=0;i<lists.size();i++){
            System.out.println((i+1)+": "+lists.get(i));
        }
    }

}
