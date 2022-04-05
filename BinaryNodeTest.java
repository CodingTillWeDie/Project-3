import org.junit.jupiter.api.Test;

class BinaryNodeTest {

    @Test
    public void postorderTraverse_binaryNodeMethod() {
        BinaryTree<String> aTree = new BinaryTree<>();
        createTree1(aTree);
        System.out.println("(binaryNode) post-order: ");
        aTree.postorderTraverse_callBinaryNodeMethod();

    }

    @Test
    public int getHeight_binaryNodeMethod() {

        BinaryTree<String> aTree = new BinaryTree<>();
        createTree1(aTree);
        System.out.println("(BinaryNode) Height of tree is " + aTree.getHeight_callBinaryNodeMethod());
        return 0;
    }
    public static void createTree1(BinaryTree<String> tree)
    {
        // Leaves
        BinaryTree<String> dTree = new BinaryTree<>("D");
        BinaryTree<String> eTree = new BinaryTree<>("E");
        BinaryTree<String> gTree = new BinaryTree<>("G");

        // Subtrees:
        BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
        BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
        BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        tree.setTree("A", bTree, cTree);

        System.out.println("\nGiven Tree:\n");
        System.out.println("     A      ");
        System.out.println("   /   \\  ");
        System.out.println("  B     C  ");
        System.out.println(" / \\   /  ");
        System.out.println("D   E  F   ");
        System.out.println("        \\ ");
        System.out.println("         G ");
        System.out.println();
    } // end createTree
}
