/**
 * Leaf node representing a file in a project tree.
 *
 * <p>A {@code ProjectFile} has no children. The subtree rooted at a file
 * therefore consists only of the file itself.</p>
 */
public class ProjectFile //implements ProjectNode //TODO: activate clause.
{

    //TODO: define missing parts of this class (variables and methods).

    /**
     * Creates a new file node.
     *
     * @param name the file name;
     *             {@code name != null && !name.isEmpty()}
     * @param numberOfBytes the file numberOfBytes in bytes;
     *             {@code numberOfBytes >= 0}
     */
    public ProjectFile(String name, long numberOfBytes) {

        //TODO: implement constructor.
    }
}