
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

	public static void main(String args[]){

	preOrder obj = new preOrder();
	obj.root = new Node(1);
	obj.root.left = new Node(2);
    	obj.root.right = new Node(4);
    obj.root.right.left= new Node(3);

	obj.root.left.left= new Node(6);
	obj.root.right.right = new Node(5);

ArrayList<Integer> result = new ArrayList<>();
  preOrder.preOrderTraversal(obj.root, result);
   
  for(int i : result){
      System.out.print(i + " " );
  }
}

}