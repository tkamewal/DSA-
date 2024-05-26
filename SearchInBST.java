import java.util.*;
public class SearchInBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            // this.left = null;
            // this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
           return root = new Node(val);
        }

        if(root.data > val) {
            root.left = insert(root.left, val);
        }
        if(root.data < val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
    System.out.print(root.data+" ");    
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if(root.data > key) {
           return search(root.left, key);
        }
        if(root.data < key) {
           return search(root.right, key);
        }
        if(root.data == key) {
           return true;
        }
        else{
            return search(root.right, key);
        }
    }
    
    public static void main(String args[]){
     
  int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
  Node root = null;

  for (int i = 0; i < values.length; i++) {
    root = insert(root, values[i]);
  }
  inorder(root);
  System.out.println();

  if(search(root, 7)){
    System.out.println("found");
  } else {
    System.out.println("Not Found");
  }
    }
}
