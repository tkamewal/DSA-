import java.util.LinkedList;
import java.util.Queue;
public class SubTreeOfAnotherTree {
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
//      public static int heightOftree(Node root) {
//     if(root == null){
//         return 0;
//     }

//     int leftHeight = heightOftree(root.left);
//     int rightHeight = heightOftree(root.right);

//    if (leftHeight > rightHeight) {
//      return leftHeight+1;
//    } else {
//     return rightHeight+1;
//    }

// // int myHeight = Math.max(leftheight , rightheight) + 1 ;

//    }

//    public static int Diameter(Node root) {
//     if(root == null){
//         return 0;
//     }

//     int Diam1 = Diameter(root.left);
//     int Diam2 = Diameter(root.right);
//     int Diam3 = heightOftree(root.left) +  heightOftree(root.right) + 1;
//     return Math.max(Diam3, Math.max(Diam1, Diam2));



//    }
public static boolean IsIdentical(Node root, Node subRoot){
    if(root == null && subRoot == null) {
        return true;
    }
    if(root == null || subRoot == null) {
        return true;
    }
    if (root.data == subRoot.data) {
        return IsIdentical(root.left, subRoot.left) && IsIdentical(root.right, subRoot.right);
}
return false;
}
public static boolean isSubTree(Node root, Node subRoot) {
    if (subRoot == null) {
        return true;
    }
    if (root == null) {
        return false;
    }

    if (root.data == subRoot.data) {
        if (IsIdentical(root, subRoot)) {
            return true;
        }
    }
return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
}    

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int nodes1[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1};
BinaryTree tree = new BinaryTree();
Node Root = tree.BuildTree(nodes);
Node subroot = tree.BuildTree(nodes1);
// System.out.println(diameter2(Root).diam);
isSubTree(Root, subroot);
    }
}


