import org.junit.jupiter.api.Test;

class BinaryNodeTest {

    @Test
    public void postorderTraverse_binaryNodeMethod() {

        BinaryTree<String> Tree1 = new BinaryTree<>();
        createTree1(Tree1);
        System.out.println("(binaryNode) post-order: ");
        Tree1.getRootNode().postorderTraverse_binaryNodeMethod();

        BinaryTree<String> Tree2 = new BinaryTree<>();
        createTree2(Tree2);
        System.out.println("(binaryNode) post-order: ");
        Tree2.getRootNode().postorderTraverse_binaryNodeMethod();

        BinaryTree<String> Tree3 = new BinaryTree<>();
        createTree3(Tree3);
        System.out.println("(binaryNode) post-order: ");
        Tree3.getRootNode().postorderTraverse_binaryNodeMethod();

        BinaryTree<String> Tree4 = new BinaryTree<>();
        createTree4(Tree4);
        System.out.println("(binaryNode) post-order: ");
        Tree4.getRootNode().postorderTraverse_binaryNodeMethod();

        BinaryTree<String> Tree5 = new BinaryTree<>();
        createTree5(Tree5);
        System.out.println("(binaryNode) post-order: ");
        Tree5.getRootNode().postorderTraverse_binaryNodeMethod();

    }

    @Test
    public void getHeight_binaryNodeMethod() {

        BinaryTree<String> Tree1 = new BinaryTree<>();
        createTree1(Tree1);
        System.out.println("(BinaryNode) Height of tree is " + Tree1.getRootNode().getHeight_binaryNodeMethod());

        BinaryTree<String> Tree2 = new BinaryTree<>();
        createTree2(Tree2);
        System.out.println("(BinaryNode) Height of tree is " + Tree2.getRootNode().getHeight_binaryNodeMethod());

        BinaryTree<String> Tree3 = new BinaryTree<>();
        createTree3(Tree3);
        System.out.println("(BinaryNode) Height of tree is " + Tree3.getRootNode().getHeight_binaryNodeMethod());

        BinaryTree<String> Tree4 = new BinaryTree<>();
        createTree4(Tree4);
        System.out.println("(BinaryNode) Height of tree is " + Tree4.getRootNode().getHeight_binaryNodeMethod());

        BinaryTree<String> Tree5 = new BinaryTree<>();
        createTree5(Tree5);
        System.out.println("(BinaryNode) Height of tree is " + Tree5.getRootNode().getHeight_binaryNodeMethod());
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
    } // end createTree1

    public static void createTree2(BinaryTree<String> tree)
    {
        // Leaves
        BinaryTree<String> fTree = new BinaryTree<>("F");
        BinaryTree<String> hTree = new BinaryTree<>("H");
        BinaryTree<String> gTree = new BinaryTree<>("G");
        BinaryTree<String> bTree = new BinaryTree<>("B");

        // Subtrees:
        BinaryTree<String> dTree = new BinaryTree<>("D", fTree, null);
        BinaryTree<String> eTree = new BinaryTree<>("E", gTree, hTree);
        BinaryTree<String> cTree = new BinaryTree<>("C", dTree, eTree);

        tree.setTree("A", bTree, cTree);

        System.out.println("\nGiven Tree:\n");
        System.out.println("     A      ");
        System.out.println("   /   \\  ");
        System.out.println("  B     C  ");
        System.out.println("      /   \\");
        System.out.println("     D     E ");
        System.out.println("    /    /   \\ ");
        System.out.println("   F    G     H ");
        System.out.println();
    } // end createTree2

    public static void createTree3(BinaryTree<String> tree)
    {
        // Leaves
        BinaryTree<String> bTree = new BinaryTree<>("B", null,null);
        BinaryTree<String> cTree = new BinaryTree<>("C", null, null);

        tree.setTree("A", bTree, cTree);

        System.out.println("\nGiven Tree:\n");
        System.out.println("     A      ");
        System.out.println("   /   \\  ");
        System.out.println("  B     C  ");
        System.out.println();
    } // end createTree3

    public static void createTree4(BinaryTree<String> tree)
    {
        // Leaves
        BinaryTree<String> dTree = new BinaryTree<>("D");
        BinaryTree<String> eTree = new BinaryTree<>("E");

        // Subtrees:
        BinaryTree<String> bTree = new BinaryTree<>("B", dTree, null);
        BinaryTree<String> cTree = new BinaryTree<>("C", null, eTree);

        tree.setTree("A", bTree, cTree);

        System.out.println("\nGiven Tree:\n");
        System.out.println("     A      ");
        System.out.println("   /   \\  ");
        System.out.println("  B     C  ");
        System.out.println(" /       \\  ");
        System.out.println("D         E   ");

        System.out.println();
    } // end createTree4

    public static void createTree5(BinaryTree<String> tree)
    {

        tree.setTree("A",null,null);

        System.out.println("\nGiven Tree:\n");
        System.out.println("     A      ");
        System.out.println();
    } // end createTree5
}
