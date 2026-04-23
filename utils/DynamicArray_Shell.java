package utils;
public class DynamicArray_Shell{
    private static final int list =10;
    private static final int expand = 2;
    private int count;
    private String [] data;
    /**
     * initial the capacity for further use;
     */
    public DynamicArray_Shell(){
        data = new String[list];
        count= 0 ;
    }
    /**
     * Construct an empty Dynamic list and initial capacity;
     * @param size initial capicity of the internal array
     * @throws IllegalArgumentException if size is less or equal to 0;
     */
    public DynamicArray_Shell(int size){
        if(size <=0){
            throw new IllegalArgumentException("Size Invaild!!");
        }
        data = new String[size];
        count = 0;
    }
    /**
     * Returns how many elements it has in the list;
     * @return size of the list;
     */
    public int countSize(){
        return count;
    }
        /**
     * Return true if list is empty;
     * @return true if list has no element ,otherwise its false;
     */
    public boolean isEmpty(){
        return count ==0;
    }
    /**
     * @param position the index to access;
     * @return the String stored in the specified position;
     * @throws IndexOutOfBoundsException if position is less or equal or greater than the current size;
     */
    public  String get(int position){
        if(position <0||position>=count){
            throw new IndexOutOfBoundsException("Invalid position: "+ position);
        }
        return data [position];
    }
}