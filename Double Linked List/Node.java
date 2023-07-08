public class Node {
    Object data;
    Node next;
    Node prev;
    public Node(Object data) {
        this.data = data;
    }
    public Node(Object data,Node next,Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
   
}