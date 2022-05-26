package leetcode.deepcopy;

import java.util.HashMap;
import java.util.Map;

public class NodeCopier<T> {
    private Map<Node<T>, Node<T>> map;

    public NodeCopier() {
        this.map = new HashMap<>();
    }

    public Node<T> deepCopyNode(Node<T> oldNode) {
        if (oldNode == null) {
            return null;
        }

        if (!map.containsKey(oldNode)) {
            Node<T> newNode = new Node<>(oldNode.getValue());
            map.put(oldNode, newNode);
            newNode.setNext(deepCopyNode(oldNode.getNext()));
            newNode.setRandom(deepCopyNode(oldNode.getRandom()));
            return newNode;
        }

        return map.get(oldNode);

    }
}
