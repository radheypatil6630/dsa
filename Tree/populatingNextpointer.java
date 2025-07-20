
    // 116. Populating Next Right Pointers in Each Node
    class Node {
    int val;
    Node left, right, next;

    Node(int val) {
        this.val = val;
        this.left = this.right = this.next = null;
    }
}

public class populatingNextpointer {

    public static Node connect(Node root) {
        if (root == null) return null;

        Node leftMost = root;

        // Process all levels
        while (leftMost.left != null) {
            Node current = leftMost;

            // Connect children within the same level
            while (current != null) {
                // Connect left → right
                current.left.next = current.right;

                // Connect right → next.left (if exists)
                if (current.next != null) {
                    current.right.next = current.next.left;
                } else {
                    // This is where `.next` remains null for last right node in the level
                    current.right.next = null;
                }

                // Move to next node in current level
                current = current.next;
            }

            // Move down one level
            leftMost = leftMost.left;
        }

        return root;
    }

    // Print level-wise next pointers
    public static void printLevels(Node root) {
        Node levelStart = root;
        while (levelStart != null) {
            Node current = levelStart;
            while (current != null) {
                System.out.print(current.val + " → ");
                current = current.next;
            }
            System.out.println("NULL");
            levelStart = levelStart.left;
        }
    }

    public static void main(String[] args) {
        /*
                  1
                /   \
               2     3
              / \   / \
             4  5  6  7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root = connect(root);

        System.out.println("Level-wise next pointers:");
        printLevels(root);
    }
}


