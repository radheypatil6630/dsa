import java.util.Scanner;

public class insertIntoTree {
    static Scanner sc = new Scanner(System.in);

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int x) {
            this.val = x;
            left = right = null;
        }
    }

    Node root ;


    public void insert(Node node){
        if(node == null){
            return;
        }
        // System.out.println("Enter value to insert : ");
        // int value = sc.nextInt();
        insert(sc, node);

    }

    public void insert(Scanner sc , Node node){
        if(node == null){
            return;
        }

        System.out.println("If you want o insert left child of "+node.val);
        boolean left = sc.nextBoolean();

        if(left){
            System.out.println("Enter value for left child ");
            int value = sc.nextInt();

            node.left = new Node (value);
            insert(sc , node.left);
        }

        System.out.println("if you want to insert right child of "+node.val);
        boolean right = sc.nextBoolean();

        if(right ){
            System.out.println("Enter value of right child :");
            int value = sc.nextInt();

            node.right = new Node(value);
            insert(sc,node.right);
        }
    }



    public  void display(Node node){
        if(node == null){
            return;
        }
        System.out.println("Node data : "+node.val);
        display(node.left);
        display(node.right);
    }

    public static void main(String args[]){
        insertIntoTree tree = new insertIntoTree();
        System.out.println("Enter value for root node : ");
        int value = sc.nextInt();
        tree.root = new Node(value);

        tree.insert(tree.root);

        System.out.println("Tree structure:");
        tree.display(tree.root);
    }
 
}

