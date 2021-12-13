
public class BinaryTreeDriver {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.inserted(5);
        tree.inserted(3);
        tree.inserted(2);
        tree.inserted(4);
        tree.inserted(7);
        tree.inserted(6);
        tree.inserted(8);
        tree.inOrder();
    }
}
