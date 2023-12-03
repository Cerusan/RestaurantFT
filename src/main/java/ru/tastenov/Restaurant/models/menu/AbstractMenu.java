package ru.tastenov.Restaurant.models.menu;

import java.util.List;

//Abstract class for menu
public class AbstractMenu {
    private int id;
    private String name;
    private List<Ingridient> ingridientList;
    private double price;
    private double calories;

    public AbstractMenu(String name, double price, double calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public AbstractMenu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingridient> getIngridientList() {
        return ingridientList;
    }

    public void setIngridientList(List<Ingridient> ingridientList) {
        this.ingridientList = ingridientList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
