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
    /**
     * Returns the index of the first element (ignore case different)
     * @param target the element to search 
     * @return the index of first matching elements or -1 if not founded;
     * @throws IllegalArgumentException if the target is null.
     */
    public int indexOf(String target){
        if(target == null){
            throw new IllegalArgumentException("Target cannot be null!");
        }
        for(int i=0;i<count;i++){
            if(data[i].equalsIgnoreCase(target)){
                return i;
            }
        }
        return -1;
    }
    /**
     * check if the element exist in the list
     * @param target the target to search;
     * @return true if is found,or false if not found;
     * @throws IllegalArgumentException if target is null;
     */
    public boolean contains(String target){
        return indexOf(target)!=-1;

    }
    /**
     * Ensure that array has enough capacity;
     */
    public void ensureCapacity(){
        if(count == data.length){
            String  [] newData = new String[data.length*expand];
            System.arraycopy(data,0,newData,0,count);
        data = newData;
        }
    }
    /**
     * add the object at the end of  the list;
     * @param object to be added into the list
     * @throws IllegalArgumentException if object is null;
     */
    public void add(String object){
    if(object ==null){
        throw new IllegalArgumentException("Object can not be null!");
    }
    ensureCapacity();
    data[count] = object;
    count++;
    }
    /**
     * insert the element at special position in the list shift the exist element
     * @param object the element to insert
     * @param position the index by insert
     * @throws IllegalArgumentException if object is null
     * @throws IndexOutOfBoundsException if position is less or greater than the current size
     */
    public void add(String object, int position){
        if(object == null){
            throw new IllegalArgumentException("Object can not be null");
        }
        if(position <0||position>count){
            throw new IndexOutOfBoundsException("Invalid position: "+position);
        }
        ensureCapacity();
        for(int i = count;i>position;i--){
            data[i] = data[i-1];
        }
        data[position] = object;
        count++;
    }
}