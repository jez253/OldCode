// -------------------------------------------------------------------------
/**
 * This class defines the basic abstraction of the TreeNode.
 *
 * @author Eric Hotinger
 * @author Trevor Senior
 * @version Oct 11, 2012
 */
public interface TreeNode
{

    // ----------------------------------------------------------
    /**
     * Inserts a Handle into a given TreeNode and returns the value of the
     * TreeNode after insertion.
     *
     * @param handle
     *            the handle containing information to be stored into the
     *            TreeNode
     * @return the TreeNode after insertion
     */
    public TreeNode insert(Handle handle);


    // ----------------------------------------------------------
    /**
     * Prints a representation of a given TreeNode given the depth and print
     * mode (There are multiple ways to print out -- so we need print modes).
     *
     * @param depth
     *            the depth of the TreeNode
     * @param printMode
     *            the print mode to print out the TreeNode in a specific manner
     */
    public void print(int depth, Util.printMode printMode);


    // ----------------------------------------------------------
    /**
     * Removes a TreeNode from the Tree given a Handle.
     *
     * @param handle
     *            the handle to remove from the Tree (and Memory Manager)
     * @return returns the removed TreeNode
     */
    public TreeNode remove(Handle handle);


    // ----------------------------------------------------------
    /**
     * Searches the Tree for a given Handle based on a search mode.
     *
     * @param searchMode
     *            the SearchCommand (There are multiple ways to search -- so we
     *            need search modes)
     */
    public void search(SearchCommand searchMode);
}
