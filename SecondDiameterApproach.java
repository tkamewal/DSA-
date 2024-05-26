import java.util.LinkedList;
import java.util.Queue;
public class SecondDiameterApproach {
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

    
static class TreeInfo {
   int ht;
   int diam; 

   TreeInfo(int ht, int diam){
    this.ht = ht;
    this.diam = diam;
   }
}

public static TreeInfo diameter2( Node root){

    if (root == null) {
       return new TreeInfo(0, 0);
    }

    TreeInfo left = diameter2(root.left);
    TreeInfo right = diameter2(root.right);

    int myHeight = Math.max(left.ht, right.ht) + 1;

    int diam1 = left.diam;
    int diam2 = right.diam;
    int diam3 = left.ht + right.ht + 1;

    int myDiam = Math.max(diam3, Math.max(diam1, diam2));

    TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
    return myInfo;


}    

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
BinaryTree tree = new BinaryTree();
Node Root = tree.BuildTree(nodes);
System.out.println(diameter2(Root).diam);
    }
}

