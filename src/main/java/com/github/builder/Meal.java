package com.github.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private static int counter = 0;
    private final int id = counter++;
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void showPrice() {
        float price = 0f;
        for (Item item : items)
            price += item.price();
        System.out.println(this + " cost: " + price);
    }

    public void showItems() {
        System.out.println(this);
        for (Item item : items)
            System.out.println("name: " + item.name() + " package: " + item
                    .packing() + " price: " + item.price());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
