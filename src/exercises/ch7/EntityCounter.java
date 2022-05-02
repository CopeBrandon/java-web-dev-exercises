package exercises.ch7;

import java.util.ArrayList;

public class EntityCounter {
    ArrayList<Integer> arr = new ArrayList<>();
    public int createID(){
        while(true) {
            int id = (int) (Math.random() * 100);
            if (!this.arr.contains(id)) {
                this.arr.add(id);
                return id;
            }
        }
    }
}
