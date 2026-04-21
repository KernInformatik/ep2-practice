/**
 * Doubly linked list with elements of type {@link Physical}.
 *
 * <p>The list is implemented as a (non-cyclic) doubly linked structure with
 * references to the first (head) and last node (last).</p>
 *
 * TODO: use {@link PhysicalDoublyLinkedListNode} as the node class of this list.
 *   Do NOT use the Java Collection Framework in your implementation.
 */
public class PhysicalDoublyLinkedList {

    private PhysicalDoublyLinkedListNode head;
    private PhysicalDoublyLinkedListNode last;
    private int size;

    /**
     * Creates an empty list.
     */
    public PhysicalDoublyLinkedList() {

        // TODO: implement constructor.
    }

    /**
     * Creates a new list that is a copy of the specified list. Later changes of
     * {@code this} (like adding or removing elements) will not affect {@code list} and
     * vice versa.
     *
     * <p>The new list contains the same elements and in the same order
     * as {@code list}.</p>
     *
     * @param list the list to copy; {@code list != null}
     */
    public PhysicalDoublyLinkedList(PhysicalDoublyLinkedList list) {

        // TODO: implement constructor.
    }

    /**
     * Adds an element at the head of the list.
     *
     * @param v the element to add
     */
    public void addFirst(Physical v) {

        // TODO: implement method.
    }

    /**
     * Adds an element at the end of the list.
     *
     * @param p the element to add
     */
    public void addLast(Physical p) {

        // TODO: implement method.
    }

    /**
     * Adds an element at the specified position in the list.
     *
     * <p>If {@code index == 0}, the element is inserted at the head of the list.
     * If {@code index == size()}, the element is inserted at the end of the list.
     * All elements currently stored at positions greater than or equal to
     * {@code index} are shifted by one position toward the end of the list.</p>
     *
     * @param index the position at which the element is to be inserted;
     *              {@code 0 <= index <= size()}
     * @param p     the element to add
     */
    public void add(int index, Physical p) {

        // TODO: implement method.
    }

    /**
     * Removes and returns the head element of the list.
     *
     * <p>This method removes the first element of the list.</p>
     *
     * @return the first element in the list, or {@code null} if {@code size() == 0}
     */
    public Physical pollFirst() {

        // TODO: implement method.
        return null;
    }

    /**
     * Removes and returns the last element of the list.
     *
     * <p>This method removes the last element of the list.</p>
     *
     * @return the last element in the list, or {@code null} if {@code size() == 0}
     */
    public Physical pollLast() {

        // TODO: implement method.
        return null;
    }

    /**
     * Returns the head element of the list without removing it.
     *
     * <p>The list remains unchanged after this operation.</p>
     *
     * @return the first element in the list, or {@code null} if {@code size() == 0}
     */
    public Physical peekFirst() {

        // TODO: implement method.
        return null;
    }

    /**
     * Returns the last element of the list without removing it.
     *
     * <p>The list remains unchanged after this operation.</p>
     *
     * @return the last element in the list, or {@code null} if {@code size() == 0}
     */
    public Physical peekLast() {

        // TODO: implement method.
        return null;
    }

    /**
     * Returns whether this list contains the specified element (identical to `p`).
     *
     * @param p the element to search for
     * @return {@code true} if present, otherwise {@code false}
     */
    public boolean contains(Physical p) {

        // TODO: implement method.
        return false;
    }

    /**
     * Returns the element at the specified position in the list.
     *
     * <p>The first element has index {@code 0}.</p>
     *
     * @param index the index of the element to return;
     *              {@code 0 <= index < size()}
     * @return the element at the specified position
     */
    public Physical get(int index) {

        // TODO: implement method.
        return null;
    }

    /**
     * Removes and returns the element at the specified position in the list.
     *
     * <p>All elements following the removed element are shifted by one position
     * toward the head of the list.</p>
     *
     * @param index the index of the element to remove;
     *              {@code 0 <= index < size()}
     * @return the removed element
     */
    public Physical remove(int index) {

        // TODO: implement method.
        return null;
    }

    /**
     * Returns whether this list contains no elements.
     *
     * @return {@code true} if {@code size() == 0}, {@code false} otherwise
     */
    public boolean isEmpty() {

        // TODO: implement method.
        return false;
    }

    /**
     * Removes all elements from the list.
     */
    public void clear() {

        //TODO: implement method.
    }

    /**
     * Returns the number of elements currently stored in the list.
     *
     * @return the current size of the list
     */
    public int size() {

        // TODO: implement method.
        return -1;
    }
}
