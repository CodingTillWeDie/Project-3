
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void postorderTraverse() {
        BinaryTree<String> aTree = new BinaryTree<>();
        createTree1(aTree);
        System.out.println("(binaryTree) post-order: ");
        aTree.postorderTraverse();
    }

    @Test
    void postorderTraverse_callBinaryNodeMethod() {
        BinaryTree<String> aTree = new BinaryTree<>();
        createTree1(aTree);
        System.out.println("(binaryTree) post-order: ");
        aTree.postorderTraverse_callBinaryNodeMethod();
    }

    @Test
    void getHeight_callBinaryNodeMethod() {
        BinaryTree<String> aTree = new BinaryTree<>();
        createTree1(aTree);
        System.out.println("(BinaryNode) Height of tree is " + aTree.getHeight_callBinaryNodeMethod());
    }

    @Test
    void getNumberOfNodes() {
        BinaryTree<String> aTree = new BinaryTree<>();
        createTree1(aTree);
        System.out.println("(BinaryTree) # nodes of tree is " + aTree.getNumberOfNodes());
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
