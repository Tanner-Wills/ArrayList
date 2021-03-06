import java.util.NoSuchElementException;
/**
 * Implementation of an ArrayList.
 */
public class ArrayList<T> {

    /**
     * Instance Variables
     */

    public static final int INITIAL_CAPACITY = 9;
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new ArrayList.
     * <p>
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast an Object[] to a T[] to get the generic typing.
     */
    public ArrayList() {
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Adds the data to the front of the list.
     */
    public void addToFront(T data) {
        //Consider recursive functions call themselves
        if (data == null) {
            throw new IllegalArgumentException("Can't add null to a list!");
        } else {
            //resize array if needed
            if(size + 1 > this.backingArray.length){
                T[] tempArrayAddFront = (T[]) new Object[this.backingArray.length * 2];
                //copy all elements of the old array
                for(int i = 0; i < this.size; i ++){
                    tempArrayAddFront[i+1] = this.backingArray[i];
                }
                this.backingArray = tempArrayAddFront;
            } else {
                for (int index = size; index > 0; index--) {
                    this.backingArray[index] = this.backingArray[index - 1];
                }
            }
            this.backingArray[0] = data;
            this.size += 1;
        }
    }

    /**
     * Adds the data to the back of the list.
     */
    public void addToBack(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Can't add null to a list!");
        } else {
            //resize array if needed
            if (size + 1 > this.backingArray.length) {
                T[] tempArrayAddBack = (T[]) new Object[this.backingArray.length * 2];
                //copy all elements of the old array
                for (int i = 0; i < this.size; i++) {
                    tempArrayAddBack[i] = this.backingArray[i];
                }
                this.backingArray = tempArrayAddBack;
            }
            this.backingArray[size] = data;
            this.size += 1;
        }
    }

        /**
         * Removes and returns the first data of the list.
         *
         * @return the data formerly located at the front of the list
         */
        public T removeFromFront () {
            if(this.size == 0){
                throw new IllegalArgumentException("This list is empty!");
            }
            T frontStore = backingArray[0];
            for(int i = 0; i < this.size; i ++){
                this.backingArray[i] = this.backingArray[i+1];
            }
            this.backingArray[size] = null;
            this.size -=1;
            return frontStore;
        }

        /**
         * Removes and returns the last data of the list.
         *
         * @return the data formerly located at the back of the list
         */
        public T removeFromBack () {
            if(this.size == 0){
                throw new IllegalArgumentException("The list is empty!");
            }
            T backItem = backingArray[size];
            this.backingArray[size-1] = null;
            size -= 1;
            return backItem;
        }

        /**
         * @return the backing array of the list
         */
        public T[] getBackingArray () {
            return backingArray;
        }

        /**
         * @return the size of the list
         */
        public int size(){
            return size;
        }
        public T get(int i){
            return backingArray[i];
        }
    }
