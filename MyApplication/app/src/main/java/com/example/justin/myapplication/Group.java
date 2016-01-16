package com.example.justin.myapplication;

import java.util.ArrayList;

public class Group {

    private int Image;
    private ArrayList<Child> Items;

    public int getImage() {
        return Image;
    }

    public void setImage(int Image) {
        this.Image = Image;
    }

    public ArrayList<Child> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Child> Items) {
        this.Items = Items;
    }
}