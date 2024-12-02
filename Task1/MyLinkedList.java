public class MyLinkedList {

    /**
     * Реализовать следующие методы
     * 1. public int size() - получить размер списка - ВЫПОЛНЕНО
     * 2. public boolean contains(int value) - проверить наличие элемента в списке - ВЫПОЛНЕНО
     */


    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node last = findLast();
            last.next = new Node(value);
        }
    }

    public int getFirst() {
        return get(0);
    }

    public int get(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException(index);
        }

        Node current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (currentIndex == index && current != null) {
            return current.value;
        }
        throw new IndexOutOfBoundsException(index);
    }

    public int popFirst() {
        return pop(0);
    }

    public int pop(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            int pop = head.value;
            head = head.next;
            return pop;
        }

        Node previous = head; // предыдущая от искомой
        int currentIndex = 1;
        while (previous.next != null) {
            if (currentIndex == index) {
                int pop = previous.next.value;
                previous.next = previous.next.next;
                return pop;
            }

            previous = previous.next;
            currentIndex++;
        }
        throw new IndexOutOfBoundsException(index);
    }


    /**
     * метод поиска последнего элемента списка
     * @return Node last
     */

    private Node findLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }


    /**
     * метод вывода списка в виде форматированной строки
     * @return String
     */

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            result.append(current.value).append(" -> ");
            current = current.next;
        }

        int length = result.length();
        if (length > 4) {
            result.delete(length - 4, length);
        }

        result.append("]");
        return result.toString();
    }


    /**
    * получаем размер списка
    */
    public int size() {
        int sizeList = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            sizeList++;
        }
        return sizeList;
    }


    /**
    * проверяем наличие заданного элемента в списке
    */
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
    return false;
    }

}