public class Main {
    public static void main(String[] args) {
        int find = 0;
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(23);
        myLinkedList.add(97);
        System.out.println("Выводим список:  " + myLinkedList);
        System.out.println("Количество элементов (размер) в списке = " + myLinkedList.size());
        find = 15;
        System.out.println("Проверяем, есть ли число " + find + " в списке? " + myLinkedList.contains(find));
        find = 9;
        System.out.println("Проверяем, есть ли число " + find + " в списке? " + myLinkedList.contains(find));

    }
}