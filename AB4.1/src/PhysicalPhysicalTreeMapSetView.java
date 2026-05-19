/**
 * A set view backed by a {@link PhysicalPhysicalTreeMap}.
 * <p>
 * The elements of this set are the keys of the underlying tree map.
 * The set directly reflects the current state of the backing map and does
 * not maintain its own storage.
 * </p>
 *
 * <p>
 * Iterators of this set view iterate over all keys of the underlying tree map
 * in its natural tree order. Iterators of this set view may throw {@link ConcurrentModificationException}
 * if the backing map is structurally modified during iteration.
 * </p>
 *
 * <p>
 * The implementation uses a tree structure together with a
 * {@link PhysicalComparator} for element ordering and lookup operations.
 * </p>
 */
public class PhysicalPhysicalTreeMapSetView //implements PhysicalSet //TODO: acivate clause.
{

    // TODO: all variables and additional constructors and methods are private,
    //  unless a method overrides or implements an inherited public method.

    /**
     * Creates a new set view backed by the specified tree map.
     *
     * @param map the backing tree map; {@code map != null}
     * @param rootBox a shared mutable reference to the root node of the
     *                backing tree structure; {@code rootBox != null}
     *                and {@code rootBox.length >= 1}
     * @param modCounterBox a shared mutable modification counter used to
     *                      detect structural changes during iteration;
     *                      {@code modCounterBox != null}
     *                      and {@code modCounterBox.length >= 1}
     */
    public PhysicalPhysicalTreeMapSetView(
            PhysicalPhysicalTreeMap map,
            PhysicalPhysicalTreeMapNode[] rootBox,
            int[] modCounterBox) {

        //TODO: implement constructor.
    }

    /**
     * {@inheritDoc}
     *
     * <p>If {@code p} is not already a key of the backing map, it is inserted
     * with associated value {@code null}.</p>
     *
     * <p>If an equal key already exists, the backing map remains unchanged.</p>
     *
     * @param p the element to add; {@code p != null}
     * @return {@code true} if the backing map changed as a result of the call,
     *         otherwise {@code false}
     */
    //@Override
    public boolean add(Physical p) {

        //TODO: implement method.
        return false;
    }
}