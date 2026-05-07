package utils;
public interface List{
    int size();
    boolean isEmpty();
    String get(int index);
    int indexOf(String element);
    boolean contains(String element);
    void add(String element);
    void add(int index,String element);
    String remove(int index);
    boolean remove(String element);
}