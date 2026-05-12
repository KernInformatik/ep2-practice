/**
 * Binary-search-tree implementation of {@link PhysicalSet}.
 *
 * <p>The elements are stored in a binary search tree ordered according to
 * a {@link PhysicalComparator}. Duplicate elements are not stored. Two
 * elements are considered duplicates iff they are equal according to
 * {@link Physical#equals(Object)}.</p>
 */
public class PhysicalTreeSet // implements PhysicalSet // TODO: activate clause.
{

    // TODO: all variables and additional constructors and methods are private,
    //  unless a method overrides or implements an inherited public method.

    /**
     * Creates an empty set ordered according to {@link XComparator}.
     */
    public PhysicalTreeSet() {

        //TODO: implement constructor.
    }

    /**
     * Creates an empty set ordered according to the specified comparator.
     *
     * @param comparator the comparator defining the tree order;
     *                   {@code comparator != null}
     */
    public PhysicalTreeSet(PhysicalComparator comparator) {

        //TODO: implement constructor.
    }

    /**
     * {@inheritDoc}
     *
     * <p>The iterator traverses the elements in ascending order according
     * to the comparator of this set.</p>
     */
    // @Override
    public PhysicalIterator iterator() {

        //TODO: implement method.
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>Two {@code PhysicalTreeSet} objects are considered equal iff</p>
     * <ul>
     *   <li>the specified object is also a {@code PhysicalTreeSet},</li>
     *   <li>both sets contain the same number of elements, and</li>
     *   <li>for every element contained in this set, an equal element is
     *       contained in the other set.</li>
     * </ul>
     *
     * <p>The iteration order and the concrete internal tree structure are
     * irrelevant.</p>
     *
     * @param o the object to compare with
     * @return {@code true} iff the specified object represents an equal set
     */
    @Override
    public boolean equals(Object o) {

        //TODO: implement method.
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {

        //TODO: implement method.
        return 0;
    }
}