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
     * Construct an empty Dyna
     * @param size
     */
    public DynamicArray_Shell(int size){
        if(size <=0){
            throw new IllegalArgumentException("Size Invaild!!");
        }
        data = new String[size];
        count = 0;
    }
    public int countSize(){
        return count;
    }
    public boolean isEmpty(){
        return count ==0;
    } 
}