

public class linked_list {
    private Node head;
    private Node tail;
    private  int size;

    public linked_list(){
        this.size = 0;
    }

    public void insertAtFirst(int value){
        Node newNode= new Node(value);

        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
            System.out.println("tail is "+tail.data);
        }
        size++;
    }

    public void insertAtLast(int value){
        if(tail == null){
            insertAtFirst(value);
            return;
        }

        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertAtPosition(int value,int index){
        if(size==0){
            insertAtFirst(value);
            return;
        }

        if(size==1){
            insertAtLast(value);
            return;
        }

        
        Node temp = head;
        for (int i = 1; i < index ; i++) {
           
            temp = temp.next;
            
        }
        Node newNode = new Node(value,temp.next); /*  The new node (25) is created, and its next is set to 30.
        Now, newNode = [25 → 30]. */
        temp.next = newNode;
        // newNode.next = temp.next;
        // temp.next = newNode;

        size++;
        
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private Node next;
        private int data;
    
        public Node(int data) {
            this.data = data;
        }

        
        private  Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    
        
    }
    public static void main(String[] args) {
        
        linked_list list  = new linked_list();
        list.insertAtFirst(1);
        list.insertAtFirst(10);
        list.insertAtFirst(15);
        list.insertAtFirst(20);

        list.insertAtLast(100);

        list.insertAtPosition(52, 3);
        list.display();

    }


}


/*  static Node addTwoLists(Node num1, Node num2) {
        
        int ele1= 0, ele2 = 0;
        Node head = null;
        
        while(num1 != null){
             ele1 = ele1 * 10 + num1.data;
             
             num1 = num1.next;
         }
        
        while(num2 != null){
            ele2 = ele2 * 10 + num2.data;
            
            num2 = num2.next;
        }
        
        int sum = ele1 + ele2;
        
        if(sum == 0 ) return new Node(0);
        
        while(sum > 0){
            int rem = sum % 10;
                
                
                Node dummy = new Node(rem);
                
                if(head == null){
                    head = dummy;
                    // dummy.next = null;
                }
                // 390       3    9  0 
                dummy.next = head;
                head = dummy;
                
                
                sum = sum / 10;
                // System.out.print(head.data);
        }
        
        return head;
    } */
