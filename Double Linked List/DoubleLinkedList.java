public class DoubleLinkedList {
    private Node first;
    private Node last;
    private int count=0;

    public void add(Object data) {
       if(first == null) {
       first = new Node(data);
       last = first;
       count++;
       return;
       }
       last.next = new Node(data, null, last);
       last = last.next;
       count++;
    }

    public int size() {
        return count;
    }

    public void add(Object data,int index) {
        if(index<=-1 || index>=size()) {
            throw new IndexOutOfBoundsException();
        }
        
        if(index == 0) {
            Node newNode = new Node(data,first,null);
            first.prev = newNode;
            first = newNode;
            count++;
            return;
        }
        Node current = first;
        for(int i=1;i<index;i++) {
            current = current.next;
        }
        Node newNode = new Node(data,current.next,current);
        last.prev=newNode;
        current.next=newNode;
        count++;
    }

    public Object get(int index) {
        Node current = first;
        for(int i=0;i<index;i++) {
            current = current.next;
        }
        return current.data;
    }

    public void printList() {
        for(int i=0;i<size();i++) {
            System.out.print(get(i)+" ");
        }
        System.out.println();
    }
}
