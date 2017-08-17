package com.company;

public class Main {

    public static void main(String[] args) {
        new MyRestaurant().name("Rest").show().order(0).order(1).order(2).eat().pay();
    }
}
