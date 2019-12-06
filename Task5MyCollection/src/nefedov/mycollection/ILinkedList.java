package nefedov.mycollection;

public interface ILinkedList<E> extends Iterable<E>{

    void add(E element);

    void addFirst(E element);

    void add(int index, E element);

    void clear();

    E get(int index);

    E getLast();

    E getFirst();

    int indexOf(E element);

    E remove(int index);

    E set (int index, E element);

    int size();

    E[] toArray(E[] arr);

    Object[] toArray();

    String toString();



}
