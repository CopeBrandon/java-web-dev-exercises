package studio.studio3_4;

import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }
    @Override
    public String toString() {
        String output = "";
        output += this.name + "\n" + this.price + "\n" + this.category + "\n" + this.isNew;
        return output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && isNew == menuItem.isNew && name.equals(menuItem.name) && category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category, isNew);
    }
}