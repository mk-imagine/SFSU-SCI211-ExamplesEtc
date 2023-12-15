public class LinkedBag<T> {
    Node headNode;
    int count;

    public LinkedBag() {
        headNode = null;
        count = 0;
    }

    private Node getLastNode() {
        Node currentNode = headNode;
        while (currentNode != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public T add(T data) {
        Node lastNode = getLastNode();
        lastNode.next = new Node(data);
        count++;
        return data;
    }

    private void remove(T item) {
        if (headNode.data == item) {
            headNode = headNode.next;
        } else {
            Node curNode = headNode.next;
            Node prevNode = headNode;
            while (curNode != null) {
                if (curNode.data == item) {
                    prevNode.next = curNode.next;
                }
                prevNode = curNode;
                curNode = curNode.next;
            }
        }
    }

    public void removeAllOccurences(T array) {
        

    }

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
