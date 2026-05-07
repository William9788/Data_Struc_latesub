package utils;
public class LinkedList implements List{
    private Node head;
    private int size;
    private class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
        }
public LinkedList(){
    head = null;
    size = 0;
}
@Override
public int size(){
    return size;
}
@Override
public boolean isEmpty(){
    return size ==0;
}
/**
 * Return element at the specified index;
 * @param index the position of the element;
 * @return the element to be given;
 * @throw IndexOutOfBoundsException if index is invalid;
 */
@Override
public String get(int index){
    if(index<0||index>=size){
        throw new IndexOutOfBoundsException("Invalid index:"+index);
    }
    Node current = head;
    for(int i=0;i<index;i++){
        current = current.next;
    }
    return current.data;
}
@Override
public void add(String element){
    if(element==null){
        throw new IllegalArgumentException("Invail element");
    }
    Node newNode = new Node(element);
    if(head == null){
        head = newNode;
    }
    else{
        Node current = head;
        while(current.next!=null){
            current = current.next;

        }
        current.next = newNode;
    }
    size++;
}
    }
