class BSTNode
{
    int key;
    BSTNode left,right; 
   public BSTNode(int item)
    {
        key = item;
        left = right =null;
    }
    
}
public class BinarySearchTree 
{
    BSTNode root;
    //Constructor
    public BinarySearchTree() 
    {
        root =null;
    }
    //Inset Key
    public BSTNode insert(BSTNode node, int key){
        if(node == null){
            return new BSTNode(key);
        }
 if (node.key == key)
            return root;

        if(node.key < key){
            node.right = insert(node.right, key);
        }else{
            node.left = insert(node.left, key);
        }

        return node;
    }

    public BSTNode delNode(BSTNode node , int key){
        if(node == null){
            return node;
        }

        if(node.key < key){
            node.right = delNode(node.right,key);
        }else if(node.key > key){
            node.left = delNode(node.left,key);
        }else{
            if(node.left == null){
                return node.right;
            }else if(node.right == null){
                return node.left;
            }
       BSTNode succ = getSucc(node);
       node.key = succ.key;
       node.right = delNode(node.right, succ.key);
        }



        return node;
    }

    static BSTNode getSucc(BSTNode node){
    node = node.right;

        while(node != null && node.left != null){
            node = node.left;
        }
        return node;
    }

    //Display Tree
    public void display(BSTNode node){
        if(node == null){
            return ;

        }

        System.out.print(node.key + " ");
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
         BinarySearchTree bst = new BinarySearchTree();
         bst.root = bst.insert(bst.root, 50);
            bst.insert(bst.root, 30);
            bst.insert(bst.root, 20);
            bst.insert(bst.root, 40);
            bst.insert(bst.root, 70);
            bst.insert(bst.root, 60);
            bst.insert(bst.root, 80);
            bst.display(bst.root);

            System.out.println("Deleting node with key 40");
            int x = 40;
            bst.root = bst.delNode(bst.root, x);
        bst.display(bst.root);
    }
}