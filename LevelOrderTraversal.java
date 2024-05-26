import java.util.*;
public class LevelOrderTraversal {
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
    public static void levelorder(Node root){
        if (root == null) {
            return;
        }


        Queue<Node> q = new LinkedList<>();

        q.add(root) ;
        q.add(null);

        while (!q.isEmpty()) {
            Node cuurNode = q.remove();
            if (cuurNode == null) {
                System.out.println( );
           if (q.isEmpty()) {
            break;
           } else {
            q.add(null);
           }
            } else {
                System.out.print(cuurNode.data+" ");
                if (cuurNode.left != null) {
                    q.add(cuurNode.left);
                }
                if (cuurNode.right != null) {
                    q.add(cuurNode.right);
                }
            }

        }



        // if(root == null){
        //     return;
        // }

        // postorder(root.left);
        // postorder(root.right);
        // System.out.print(root.data+" ");

    

    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
BinaryTree tree = new BinaryTree();
Node Root = tree.BuildTree(nodes);
levelorder(Root);
    }
}
