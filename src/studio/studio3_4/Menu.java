package studio.studio3_4;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItem = new ArrayList<>();
    private String  dateUpdated;

    public Menu(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getMenuItem() {
        return menuItem;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setMenuItem(ArrayList<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }
//    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    @Override
    public String toString() {
        String output = "";
        for(MenuItem item : menuItem) {
            output += item.toString();
        }
        return output;
    }
    public void addItem(MenuItem item) {
        if(menuItem.contains(item)) {
            System.out.println("Menu Item already exist");
        } else {
            this.menuItem.add(item);
        }
    }
    public void removeItem(MenuItem item) {
        this.menuItem.remove(item);
    }
    public void printMenu(int numItems) {
        if(numItems > menuItem.size()) {
            numItems = menuItem.size();
        }
        for(int i = 0; i < numItems; i++) {
            System.out.println(menuItem.get(i).toString());
        }
    }
}