package shop.learnup.shopspringbootapp.services;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;

@Slf4j
public class Item {

    public int id;
    public String name;
    public float price;
    public int available = 0;
    static int nextId = 0;

    public Item(String name, float price, int available) {
        this.id = ++nextId;
        this.name = name;
        this.price = price;
        this.available = available;
    }

}
