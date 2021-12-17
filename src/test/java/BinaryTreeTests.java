import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

//import org.junit.jupiter.api.Test;
//
//public class BinaryTreeTests {
//    @Test
//    void testConstructor() {
//        assertNull((new BinaryTree()).root);
//    }
//
//    @Test
//    void testInsert() {
//        BinaryTree bst = new BinaryTree();
//        bst.insert(3);
//        BinaryTree.Node node = bst.root;
//        assertEquals(3, node.data);
//        assertNull(node.right);
//        assertNull(node.left);
//    }
//
//    @Test
//    void testInsert2() {
//        BinaryTree bst = new BinaryTree();
//        bst.insert(0);
//        bst.insert(1);
//        BinaryTree.Node node = bst.root.right;
//        assertNull(node.right);
//        assertNull(node.left);
//        assertEquals(1, node.data);
//    }
//
//    @Test
//    void testInsert3() {
//        BinaryTree bst = new BinaryTree();
//        bst.insert(0);
//        bst.insert(0);
//        bst.insert(1);
//        BinaryTree.Node node = bst.root.right.right;
//        assertNull(node.left);
//        assertEquals(1, node.data);
//        assertNull(node.right);
//    }
//
//    @Test
//    void testInsert4() {
//        BinaryTree bst = new BinaryTree();
//        bst.insert(0);
//        bst.insert(-1);
//        BinaryTree.Node node = bst.root.left;
//        assertEquals(-1, node.data);
//        assertNull(node.right);
//        assertNull(node.left);
//    }
//
//    @Test
//    void testInsert5() {
//        BinaryTree bst = new BinaryTree();
//        bst.insert(1);
//        bst.insert(0);
//        bst.insert(-1);
//        BinaryTree.Node node = bst.root.left.left;
//        assertEquals(-1, node.data);
//        assertNull(node.right);
//        assertNull(node.left);
//    }
//
//    @Test
//    void testMinNode() {
//        BinaryTree bst = new BinaryTree();
//        BinaryTree.Node node = new BinaryTree.Node(1);
//        assertSame(node, bst.minNode(node));
//    }
//
//    @Test
//    void testDeleteNode() {
//        BinaryTree bst = new BinaryTree();
//        BinaryTree.Node node = new BinaryTree.Node(1);
//        BinaryTree.Node actualDeleteNodeResult = bst.deleteNode(node, 42);
//        assertSame(node, actualDeleteNodeResult);
//        assertNull(actualDeleteNodeResult.right);
//    }
//
//    @Test
//    void testDeleteNode2() {
//        BinaryTree bst = new BinaryTree();
//        assertNull(bst.deleteNode(new BinaryTree.Node(42), 42));
//    }
//
//    @Test
//    void testDeleteNode3() {
//        BinaryTree bst = new BinaryTree();
//        BinaryTree.Node node = new BinaryTree.Node(1);
//        BinaryTree.Node actualDeleteNodeResult = bst.deleteNode(node, 0);
//        assertSame(node, actualDeleteNodeResult);
//        assertNull(actualDeleteNodeResult.left);
//    }
//
//    @Test
//    void testInorderTraversal() {
//        BinaryTree bst = new BinaryTree();
//        BinaryTree.Node node = new BinaryTree.Node(1);
//        bst.inorderTraversal(node);
//        assertEquals(1, node.data);
//    }
//
//    @Test
//    void testInorderTraversal2() {
//        BinaryTree bst = new BinaryTree();
//        bst.insert(0);
//        BinaryTree.Node node = new BinaryTree.Node(1);
//        bst.inorderTraversal(node);
//        assertEquals(1, node.data);
//        assertEquals(0, bst.root.data);
//    }
//
//    @Test
//    void testNodeConstructor() {
//        BinaryTree.Node actualNode = new BinaryTree.Node(1);
//        assertEquals(1, actualNode.data);
//        assertNull(actualNode.right);
//        assertNull(actualNode.left);
//    }
//}