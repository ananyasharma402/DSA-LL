import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public interface Levelorder {
    
    

    // Node class
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


     public static void levelorder(Node root) {

        if(root==null){
            return;
        }

        Queue <Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
         
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }    else{
                System.out.println(currNode.data+"");
                if(currNode.left !=null){
                    q.add(currNode.left);
                }
                if(currNode.right !=null){
                    q.add(currNode.right);
                }
            }
            
        }
     }



    public static void main(String[] args) {

        // Creating the binary tree manually
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        /*
                 1
                / \
               2   3
              / \
             4   5
        */

       
        
        System.out.print("Levelorder: ");
        levelorder(root);
    } 

}
