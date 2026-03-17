/**
 * A simple associative data structure (map) mapping {@link Vector2D} keys to {@link Ant} values.
 *
 * <p>This class represents a minimal key-value association structure.
 * Each {@code Vector2D} key is associated with exactly one {@code Ant} value.
 * Internally the associations are stored in arrays.</p>
 */
public class Vector2DAntMap {

    // TODO: all variables and additional methods are private.

    /**
     * Creates an empty map (with no associations).
     */
    public Vector2DAntMap() {

        //TODO: implement constructor.
    }

    /**
     * Insert a new association into the map.
     *
     * <p>If the specified key already exists, its associated value
     * is replaced with the given value.</p>
     *
     * @param k the key (a {@link Vector2D} position)
     * @param v the value (an {@link Ant})
     * @return the previously associated value, or {@code null} if none existed
     */
    public Ant put(Vector2D k, Ant v) {

        //TODO: implement method.
        return null;
    }

    /**
     * Remove the association with the given key.
     *
     * @param k the key to remove
     * @return the value previously associated with the key,
     *         or {@code null} if the key was not present
     */
    public Ant remove(Vector2D k) {

        //TODO: implement method.
        return null;
    }

    /**
     * Return the value associated with the given key.
     *
     * @param k the key to search for
     * @return the associated {@link Ant}, or {@code null} if the key is not present
     */
    public Ant get(Vector2D k) {

        //TODO: implement method.
        return null;
    }

    /**
     * Check whether the map contains the given key.
     *
     * @param k the key to check
     * @return {@code true} if the key exists in the map,
     *         {@code false} otherwise
     */
    public boolean containsKey(Vector2D k) {

        //TODO: implement method.
        return false;
    }

    /**
     * Check whether the map contains the given value.
     *
     * @param v the value to check
     * @return {@code true} if the value exists in the map,
     *         {@code false} otherwise
     */
    public boolean containsValue(Ant v) {

        //TODO: implement method.
        return false;
    }

    /**
     * Return the number of stored associations.
     *
     * @return the number of key-value pairs stored within the map.
     */
    public int size() {

        //TODO: implement method.
        return -1;
    }

    /**
     * Returns all keys stored within in this map.
     *
     * <p>
     * The returned stack contains all {@link Vector2D} keys currently stored
     * in the map. Each key appears exactly once in the stack.
     * The order is not specified.
     * </p>
     *
     * @return a {@link Vector2DStack} containing all stored keys
     */
    public Vector2DStack keys() {

        //TODO: implement method.
        return null;
    }

    /**
     * Returns all values stored in this map.
     *
     * <p>
     * The returned queue contains all {@link Ant} objects currently stored
     * within the map. Duplicate entries may occur if there is more than
     * one association with the same value. The order is not specified.
     * </p>
     *
     * @return an {@link AntQueue} containing all stored values
     */
    public AntQueue values() {

        //TODO: implement method.
        return null;
    }
}