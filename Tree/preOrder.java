
import java.util.*;




class Node{

     int data;
     Node  left;
     Node right;

     Node(int value){
        this.data = value;
        this.left = this.right = null;
     }


}

public class preOrder{

    ArrayList<Integer> list = new ArrayList<>();
    Node root;

    public static void preOrderTraversal(Node node, ArrayList<Integer> list){
        if(node == null){
            return ;
        }

    
    list.add(node.data);
	
   
	
	preOrderTraversal(node.left,list);
	preOrderTraversal(node.right,list);



    }

    public int getHeight(Node node){
        if(node == null){
            return 0;
        }

        return 1+ Math.max(getHeight(node.left),getHeight(node.right));
    }

	public static void main(String args[]){

	preOrder obj = new preOrder();
	obj.root = new Node(1);
	obj.root.left = new Node(2);
    	obj.root.right = new Node(4);
    obj.root.right.left= new Node(3);

	obj.root.left.left= new Node(6);
	obj.root.right.right = new Node(5);
    obj.root.right.right.left = new Node(51);

ArrayList<Integer> result = new ArrayList<>();
  preOrder.preOrderTraversal(obj.root, result);
   System.out.println("height of tree is  : "+obj.getHeight(obj.root));
    System.out.println("\n PreOrder Traversal of the tree is : ");
  for(int i : result){
      System.out.print(i + " " );
  }
}

}