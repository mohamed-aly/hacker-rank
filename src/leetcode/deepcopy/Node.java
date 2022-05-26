package leetcode.deepcopy;

public class Node<T> {
    private T value;
    private Node<T> next;
    private Node<T> random;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getRandom() {
        return random;
    }

    public void setRandom(Node<T> random) {
        this.random = random;
    }
}
