public class Test {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);
        dll.add(50);
        dll.add("hello", 2);

        dll.printList();
    }
}
