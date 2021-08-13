import java.util.NoSuchElementException;

/**
 * Implementation of an ArrayList.
 */
public class ArrayList<T> {

    /*
     * The initial capacity of the ArrayList.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 9;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new ArrayList.
     * <p>
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast an Object[] to a T[] to get the generic typing.
     */
    public ArrayList() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Adds the data to the front of the list.
     * <p>
     * This add may require elements to be shifted.
     * <p>
     * Method should run in O(n) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        //Recursive functions call themselves
        if (data == null) {
            throw new IllegalArgumentException("Can't add null to a list!");
        } else {
            //resize array if needed
            if(size + 1 > this.backingArray.length){
                T[] tempArrayAddFront = (T[]) new Object[this.backingArray.length * 2];
                //copy all elements of the old array
                for(int i = 0; i < this.size; i ++){
                    tempArrayAddFront[i] = this.backingArray[i];
                }
                this.backingArray = tempArrayAddFront;
            }
            this.size += 1;
            for(int index = size; index > 0; index --){
                this.backingArray[index] = this.backingArray[index-1];
            }
            this.backingArray[0] = data;
        }
    }

    /**
     * Adds the data to the back of the list.
     * <p>
     * Method should run in amortized O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
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
            this.size += 1;
            this.backingArray[size] = data;
        }
    }

        /**
         * Removes and returns the first data of the list.
         *
         * Do not shrink the backing array.
         *
         * This remove may require elements to be shifted.
         *
         * Method should run in O(n) time.
         *
         * @return the data formerly located at the front of the list
         * @throws java.util.NoSuchElementException if the list is empty
         */
        public T removeFromFront () {
            // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
            T[] tempArrayRemoveFront = (T[]) new Object[this.backingArray.length];
            for(int i = 0; i < this.size-1; i ++){
                tempArrayRemoveFront[i] = this.backingArray[i+1];
            }
            this.backingArray = tempArrayRemoveFront;
            return (T) this.backingArray;
        }

        /**
         * Removes and returns the last data of the list.
         *
         * Do not shrink the backing array.
         *
         * Method should run in O(1) time.
         *
         * @return the data formerly located at the back of the list
         * @throws java.util.NoSuchElementException if the list is empty
         */
        public T removeFromBack () {
            // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
            this.backingArray[size] = null;
            size -= 1;
            return (T) this.backingArray;
        }

        /**
         * Returns the backing array of the list.
         *
         * For grading purposes only. You shouldn't need to use this method since
         * you have direct access to the variable.
         *
         * @return the backing array of the list
         */
        public T[] getBackingArray () {
            // DO NOT MODIFY THIS METHOD!
            return backingArray;
        }

        /**
         * Returns the size of the list.
         *
         * For grading purposes only. You shouldn't need to use this method since
         * you have direct access to the variable.
         *
         * @return the size of the list
         */
        public int size(){
            // DO NOT MODIFY THIS METHOD!
            return size;
        }

    }
