package nefedov.mycollection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class MyLinkedList<E> implements ILinkedList<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList() {
    }

    @Override
    public void addFirst(E element){
        final Node<E> f = firstNode;
        final Node<E> newNode = new Node<>(null, element, f);
        firstNode = newNode;
        if (f == null)
            lastNode = newNode;
        else
            f.setPrevElement(newNode);
        size++;
    }


    @Override
    public void add(E element) {
        final Node<E> l = lastNode;
        final Node<E> newNode = new Node<>(l, element, null);
        lastNode = newNode;
        if (l == null)
            firstNode = newNode;
        else
            l.setNextElement(newNode);
        size++;
    }


    @Override
    public void add(int index, E element) {
        Node<E> next = getElem(index);
        Node<E> pred = next.getPrevElement();
        Node<E> newNode = new Node<>(pred, element, next);
        next.setPrevElement(newNode);

        if (pred == null)
            firstNode = newNode;
        else
            pred.setNextElement(newNode);
        size++;
    }

    @Override
    public void clear() {
        MyLinkedList.Node next;
        for(MyLinkedList.Node x = this.firstNode; x != null; x = next) {
            next = x.nextElement;
            x.setElement(null);
            x.setNextElement(null);
            x.setPrevElement(null);
        }

        firstNode.setElement(null);
        lastNode.setElement(null);
        size = 0;
    }

    @Override
    public E getLast() {
        Node<E> l = lastNode;
        return l.getElement();
    }

    @Override
    public E getFirst() {
        final Node<E> f = firstNode;
        if (f == null)
            throw new NoSuchElementException();
        return f.getElement();
    }

    @Override
    public E get(int index) {
        if (index < (size >> 1)) {
            Node<E> x = firstNode;
            for (int i = 0; i < index; i++)
                x = x.getNextElement();
            return x.getElement();
        } else {
            Node<E> x = lastNode;
            for (int i = size - 1; i > index; i--)
                x = x.getPrevElement();
            return x.getElement();
        }
    }


    @Override
    public int indexOf(E element) {
        int index=0;
        Node<E> elem = firstNode;
        for (int i =0; i < size; i ++){
            if(element.equals(elem.getElement())){
                index = i;
                break;
            }
            else {
                index = -1;
            }
            elem = elem.getNextElement();
        }
        return index;
    }

    @Override
    public E remove(int index) {
        Node<E> x = getElem(index);
        E element;
        Node<E> prev;
        Node<E> next;
        element = x.getElement();
        prev = x.getPrevElement();
        next = x.getNextElement();

        if(x.getPrevElement()==null){
            firstNode = next;
        }
        else {
            prev.setNextElement(next);
            x.setPrevElement(null);
        }

        if(x.getNextElement()==null){
            lastNode = prev;
        }
        else {
            next.setPrevElement(prev);
            x.setNextElement(null);
        }

        x.setElement(null);
        size--;
        return element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> x =getElem(index);
        E old = x.getElement();
        x.setElement(element);
        return old;
    }

    private Node<E> getElem(int index){
        if (index < (size >> 1)) {
            Node<E> x = firstNode;
            for (int i = 0; i < index; i++)
                x = x.getNextElement();
            return x;
        } else {
            Node<E> x = lastNode;
            for (int i = size - 1; i > index; i--)
                x = x.getPrevElement();
            return x;
        }
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public  E[] toArray(E[] arr) {
        if(arr.length < size) {
            arr = (E[]) java.lang.reflect.Array.newInstance(arr.getClass().getComponentType(), size);
        }
        int i=0;
        Object[] result = arr;
        for(Node<E> x = firstNode; x!= null; x=x.getNextElement()){
            result[i++] = x.getElement();
        }

        if(arr.length > size) {
            arr[size] = null;
        }
        return arr;
    }

    @Override
    public Object[] toArray(){
        Object[] result = new Object[this.size];
        int i = 0;
        for(MyLinkedList.Node elem = this.firstNode; elem != null; elem = elem.getNextElement()){
            result[i++] = elem.getElement();
        }

        return result;
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {

            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return get(counter++);
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinkedList<?> that = (MyLinkedList<?>) o;
        return size == that.size &&
                Objects.equals(firstNode, that.firstNode) &&
                Objects.equals(lastNode, that.lastNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNode, lastNode, size);
    }

    @Override
    public String toString() {

        String res="MyLinkedList: [" + get(0);
        StringBuffer sb = new StringBuffer(res);
        for(int i =1; i < size; i++){
            sb.append(", ").append(get(i));
        }
        sb.append("]");
        return sb.toString();
    }

    private class Node<E>{
        private E element;
        private Node<E> nextElement;
        private Node<E> prevElement;

        private Node(Node<E> prevElement, E element, Node<E> nextElement) {
            this.element = element;
            this.prevElement = prevElement;
            this.nextElement = nextElement;
        }

        E getElement() {
            return element;
        }

        void setElement(E element) {
            this.element = element;
        }

        Node<E> getNextElement() {
            return nextElement;
        }

        void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        Node<E> getPrevElement() {
            return prevElement;
        }

        void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }

}
