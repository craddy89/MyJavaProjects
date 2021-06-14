package List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(4);
        myLinkedList.add(10);

        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}
