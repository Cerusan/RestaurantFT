package ru.tastenov.Restaurant.models.menu;

public class Ingridient {
    private String name;
    private double quantity;

    public Ingridient(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Ingridient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
