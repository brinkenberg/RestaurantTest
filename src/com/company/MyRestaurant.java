package com.company;
import com.company.IMenu;
import com.company.IRestaurant;

public class MyRestaurant implements IRestaurant{
    private String name;
    private String IMenu;

    @Override
    public IRestaurant name(String name) {
        this.name=name;
        System.out.println("Name of the restaurant:  " +  name);
        return this;
    }

    @Override
    public IMenu show() {
        MyRestaurantHandler handler = new MyRestaurantHandler();
        handler.showMenu();
        return handler;
    }
}
