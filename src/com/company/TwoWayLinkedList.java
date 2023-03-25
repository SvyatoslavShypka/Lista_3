package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TwoWayLinkedList<T> {
    public class Element {
        private T value;
        private Element next;
        private Element prev;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Element getNext() {
            return next;
        }

        public void setNext(Element next) {
            this.next = next;
        }

        public Element getPrev() {
            return prev;
        }

        public void setPrev(Element prev) {
            this.prev = prev;
        }

        Element(T data) {
            this.value = data;
        }
    }

    Element head = null;

    public void add(T value) {
        Element newElement = new Element(value);
        if (head == null) {
            head = newElement;
        }
        else {
            Element tail = head;
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            tail.setNext(newElement);
            newElement.setPrev(tail);
        }
    }

    public void addAt(int index, T value) throws NoSuchElementException {
        // TODO
    }

    public void clear() {
        // TODO
    }

    public boolean contains(T value) {
        // TODO

        return false;
    }

    public T get(int index) throws NoSuchElementException {
        // TODO

            T result = (T) new Object();
            return result;
    }

    public void set(int index, T value) throws NoSuchElementException {
        // TODO
    }

    public int indexOf(T value) {
        // TODO

        return 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public T removeAt(int index) throws NoSuchElementException {
        // TODO

            T result = (T) new Object();
            return result;
    }

    public boolean remove(T value) {
        // TODO

        return false;
    }

    public int size() {
        // TODO

        return 0;
    }

    public Iterator<T> iterator() {
        return new TwoWayLinkedListIterator();
    }

    private class TwoWayLinkedListIterator implements Iterator<T> {

        Element actElem;

        public TwoWayLinkedListIterator() {
            this.actElem = head;
        }

        @Override
        public boolean hasNext() {
            return actElem != null;
        }

        @Override
        public T next() {
            if (hasNext() == false) throw new NoSuchElementException();
            T currentValue = actElem.getValue();
            actElem = actElem.getNext();
            return currentValue;
        }
    }

    public void insert(
            TwoWayLinkedList<T> anotherList,
            int beforeIndex) throws NoSuchElementException {
        // TODO
    }

    public void insert(
            TwoWayLinkedList<T> anotherList,
            T beforeElement) throws NoSuchElementException {
        // TODO
    }
}
