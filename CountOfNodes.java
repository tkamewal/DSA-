import java.util.LinkedList;
import java.util.Queue;

public class CountOfNodes {
       static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;

        }
    }
   public static int CountOfNodes(Node root) {
    if(root == null){
        return 0;
    }

    int leftNodes = CountOfNodes(root.left);
    int rightNodes = CountOfNodes(root.right);

    return leftNodes + rightNodes +1;



   }

    

    

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
BinaryTree tree = new BinaryTree();
Node Root = tree.BuildTree(nodes);
System.out.println(CountOfNodes(Root));
    }
}
