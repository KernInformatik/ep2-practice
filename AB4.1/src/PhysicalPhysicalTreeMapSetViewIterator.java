/**
 * Iterator over the keys of a {@link PhysicalPhysicalTreeMapSetView}.
 *
 * <p>This iterator traverses the underlying binary search tree in
 * in-order, producing the keys in ascending order according to the
 * comparator used by the backing tree map.</p>
 *
 * <p>The iterator uses an explicit {@link java.util.Stack} to store the
 * traversal state. No independent copy of all keys is created.</p>
 *
 * <p>The iterator is fail-fast. If the backing map is structurally modified
 * after this iterator has been created, {@code #next()} throws a
 * {@link ConcurrentModificationException}.</p>
 */
public class PhysicalPhysicalTreeMapSetViewIterator //implements PhysicalIterator //TODO: acivate clause.
{

    // TODO: all variables and additional constructors and methods are private,
    //  unless a method overrides or implements an inherited public method.

    /**
     * Creates a new iterator over the specified tree.
     *
     * <p>The iterator starts before the first key according to in-order traversal.
     * If {@code root} is an empty node, the iterator has no elements.</p>
     *
     * @param root the root node of the tree to traverse; {@code root != null}
     * @param modCounterBox shared modification counter of the backing map;
     *                      {@code modCounterBox != null}
     *                      and {@code modCounterBox.length >= 1}
     */
    public PhysicalPhysicalTreeMapSetViewIterator(
            PhysicalPhysicalTreeMapNode root,
            int[] modCounterBox) {

        //TODO: implement constructor.
    }
}