package com.erssbora.datastructure.arrays;

/**
 * Array implementation example
 */
public class Example0 {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(5);

        myArray.add(3);
        myArray.add(4);
        myArray.add(7);
        myArray.add(2);

        myArray.add(2, 9);
        myArray.print();
        System.out.println("Size = " + myArray.size());
        System.out.println();

        myArray.remove();
        myArray.remove(0);
        myArray.print();
        System.out.println("Size = " + myArray.size());
    }
}

class MyArray {
    private int arr[];
    private int capacity;
    private int size;

    public MyArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public void add(int item) {
        if (size == capacity) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
        arr[size++] = item;
    }

    public void add(int index, int item) {
        if (size == capacity) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }

        if (index < 0 && index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of range");
        }

        int lastItem = 0;
        int newItem = item;
        for (int i = index; i < size; i++) {
            lastItem = arr[i];
            arr[i] = newItem;
            newItem = lastItem;
        }
        arr[size++] = newItem;
    }

    public int get(int index) {
        if (index < 0 && index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of range");
        }
        return arr[index];
    }

    public void remove() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty");
        }
        arr[--size] = 0;
    }

    public void remove(int index) {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty");
        }

        if (index < 0 && index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of range");
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
