/**
 * Doubly linked circular list with sentinel (NIL) node
 * and elements of type {@link Physical}.
 *
 * <p>The list is implemented as a doubly linked ring. A dedicated NIL node
 * is always present and simplifies all insert/remove operations:
 * for an empty list, {@code nil.next == nil} and {@code nil.prev == nil}.</p>
 */
public class PhysicalDoublyLinkedRingList {

    //TODO: all variables and additional methods and constructors must be private.

    /**
     * Creates an empty list.
     */
    public PhysicalDoublyLinkedRingList() {

        //TODO: implement constructor.
    }

    /**
     * Creates a new list that is a copy of the specified list.
     * Later changes of {@code this} do not affect {@code list} and vice versa.
     *
     * @param list the list to copy; {@code list != null}
     */
    public PhysicalDoublyLinkedRingList(PhysicalDoublyLinkedRingList list) {

        //TODO: implement constructor.
    }

    /**
     * Adds an element at the head of the list.
     *
     * @param p the element to add
     */
    public void addFirst(Physical p) {

        //TODO: implement method.
    }

    /**
     * Adds an element at the end of the list.
     *
     * @param p the element to add
     */
    public void addLast(Physical p) {

        //TODO: implement method.
    }

    /**
     * Adds an element at the specified position in the list.
     *
     * <p>If {@code index == 0}, the element is inserted at the head of the list.
     * If {@code index == size()}, the element is inserted at the end of the list.</p>
     *
     * @param index the insertion index; {@code 0 <= index <= size()}
     * @param p the element to add
     */
    public void add(int index, Physical p) {

        //TODO: implement method.
    }

    /**
     * Removes and returns the head element of the list.
     *
     * @return the first element, or {@code null} if the list is empty
     */
    public Physical pollFirst() {

        //TODO: implement method.
        return null;
    }

    /**
     * Removes and returns the last element of the list.
     *
     * @return the last element, or {@code null} if the list is empty
     */
    public Physical pollLast() {

        //TODO: implement method.
        return null;
    }

    /**
     * Returns the head element without removing it.
     *
     * @return the first element, or {@code null} if the list is empty
     */
    public Physical peekFirst() {

        //TODO: implement method.
        return null;
    }

    /**
     * Returns the last element without removing it.
     *
     * @return the last element, or {@code null} if the list is empty
     */
    public Physical peekLast() {

        //TODO: implement method.
        return null;
    }

    /**
     * Returns whether this list contains the specified element (identical to `p`).
     *
     * @param p the element to search for
     * @return {@code true} if present, otherwise {@code false}
     */
    public boolean contains(Physical p) {

        //TODO: implement method.
        return false;
    }

    /**
     * Returns the element at the specified position.
     *
     * @param index the index; {@code 0 <= index < size()}
     * @return the element at the specified position
     */
    public Physical get(int index) {

        //TODO: implement method.
        return null;
    }

    /**
     * Removes and returns the element at the specified position.
     *
     * @param index the index; {@code 0 <= index < size()}
     * @return the removed element
     */
    public Physical remove(int index) {

        //TODO: implement method.
        return null;
    }

    /**
     * Removes all elements from the list.
     */
    public void clear() {

        //TODO: implement method.
    }

    /**
     * Returns whether this list contains no elements.
     *
     * @return {@code true} if empty, otherwise {@code false}
     */
    public boolean isEmpty() {

        //TODO: implement method.
        return false;
    }

    /**
     * Returns the number of elements currently stored in the list.
     *
     * @return the current size
     */
    public int size() {

        //TODO: implement method.
        return -1;
    }
}

// TODO: define further classes, if needed (either here or in a separate file).

