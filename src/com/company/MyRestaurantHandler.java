package com.company;

import java.util.ArrayList;
import java.util.List;
import com.company.IMenu;
import com.company.IRestaurant;

public class MyRestaurantHandler implements IMenu{
    List<IItem> menuList = new ArrayList<IItem>();
    List<IItem> selectedList = new ArrayList<IItem>();

    public MyRestaurantHandler(){
        IItem food = new IItem(){
            @Override
            public IItem name() {
                System.out.println("First food item ");
                return this;
            }
            public Integer cost(){
                return 190;
            }
        };

        IItem food2 = new IItem(){
            @Override
            public IItem name() {
                System.out.println("Second food item ");
                return this;
            }
            public Integer cost(){
                return 130;
            }
        };

        IItem food3 = new IItem(){
            @Override
            //returns the current object, which is a name() with string = name;
            //can check by printing the this as well: System.out.println(this);
            public IItem name() {
                System.out.println("Third food item ");
                return this;
            }
            public Integer cost(){
                return 99;
            }
        };

        menuList.add(food);
        menuList.add(food2);
        menuList.add(food3);
    }

    @Override
    public IMenu order(int index) {
        IItem item = get(index);
        selectedList.add(item);
        System.out.println("Order given: ");
        item.name();
        return this;
    }

    @Override
    public IMenu eat() {
        for(IItem item: selectedList){
            System.out.println("eating: ");
            item.name();
        }
        return this;
    }

    public IMenu pay(){
        int price =0;
        for(IItem item : selectedList){
            price = price + item.cost();
        }
        System.out.println("paying sek: " + price);
        return this;
    }

    @Override
    public IItem get(int index) {
        if(index<3){
            return menuList.get(index);
        }
        return null;
    }
    public void showMenu(){
        System.out.println("Menu in MyRestaurant: ");
        for(IItem item : menuList){
            item.name();
        }
    }
}
