package ru.tastenov.Restaurant.models.menu;

import java.util.List;

public class Category {
    private String name;
    private List<AbstractMenu> menuList;

    public Category(String name, List<AbstractMenu> menuList) {
        this.name = name;
        this.menuList = menuList;
    }

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AbstractMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<AbstractMenu> menuList) {
        this.menuList = menuList;
    }
}
