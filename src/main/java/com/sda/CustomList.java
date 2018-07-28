package com.sda;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomList<E> implements Iterable<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public CustomList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void add (E e){
        if (size == elements.length){
            resizeArr();
        }
        elements[size++] = e;
    }
    public void resizeArr(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public E get(int i) {
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Zły element");
        }
        return (E) elements[i];
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    private class ArrayListIterator implements java.util.Iterator<E>{
        public boolean hasNext(){
            return false;

        }

        public E next(){
            return null;

        }

        public void remove(){

        }
    }
}
