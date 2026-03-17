/**
 * Stack storing {@link Vector2D} objects.
 *
 * <p>This stack stores {@link Vector2D} objects. It follows the
 * <em>Last-In-First-Out (LIFO)</em> principle: the most recently pushed
 * element is the first one removed.</p>
 *
 * <p>The stack is implemented using a dynamically growing array.</p>
 */
public class Vector2DStack {

    // TODO: all variables and additional methods are private.

    /**
     * Creates an empty stack with an initial capacity of 32 elements.
     */
    public Vector2DStack() {

        //TODO: implement constructor.
    }

    /**
     * Pushes a new vector on top of the stack.
     *
     * <p>If the internal array is full, its capacity is doubled before
     * inserting the new element.</p>
     *
     * @param v the {@link Vector2D} value to push onto the stack
     */
    public void push(Vector2D v) {

        //TODO: implement method.
    }

    /**
     * Removes and returns the topmost element. Returns {@code null} if the stack is empty.
     *
     * @return the top {@link Vector2D} element, or {@code null} if the stack is empty.
     */
    public Vector2D pop() {

        //TODO: implement method.
        return null;
    }

    /**
     * Returns the element currently at the top of the stack
     * without removing it. Returns {@code null} if the stack is empty.
     *
     * @return the top {@link Vector2D} element, or {@code null} if the stack is empty.
     */
    public Vector2D peek() {

        //TODO: implement method.
        return null;
    }

    /**
     * Checks whether the stack is empty.
     *
     * @return {@code true} if the stack contains no elements,
     *         {@code false} otherwise
     */
    public boolean isEmpty() {

        //TODO: implement method.
        return false;
    }

    /**
     * Removes all elements from the stack. After this operation the stack is empty.
     */
    public void clear() {

        //TODO: implement method.
    }

    /**
     * Returns the number of elements currently stored in the stack.
     *
     * @return the current stack size
     */
    public int size() {

        //TODO: implement method.
        return -1;
    }
}