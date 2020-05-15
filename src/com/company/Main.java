package com.company;

public class Main {

    public static void main(String[] args) {
	Box box1 = new Box("headphones");
	Storage<Integer, Box> storage = new Storage<>();
	Box box2 = new Box("pencil");
	storage.put(25,box1);
	storage.put(26,box2);
	System.out.println(storage.get(26).item);
    }
}
