import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left, right;
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BTS {
    Node root;
    BTS() {
        root = null;
    }
    Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }
        return node;
    }

    Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (root.key > key) {
            return search(root.left, key);
        }
        return search(root.right, key);

    }
    void display(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }


        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelNodes = queue.size();

            //current lvl
            for (int i = 0; i < levelNodes; i++) {
                Node currentNode = queue.poll();
                if (currentNode != null) {
                    System.out.print(currentNode.key + " ");
                    queue.add(currentNode.left);
                    queue.add(currentNode.right);
                } else {
                    System.out.print("null ");
                    queue.add(null);
                    queue.add(null);
                }
            }
            System.out.println();

            while (!queue.isEmpty() && queue.peek() == null) {
                queue.poll();
            }
        }
    }


}

public class zd1 {
    public static void main(String[] args) {
        BTS tree = new BTS();
        tree.root = tree.insert(tree.root, 12);
        tree.insert(tree.root, 6);
        tree.insert(tree.root, 5);
        tree.insert(tree.root, 7);
        tree.insert(tree.root, 18);
        tree.insert(tree.root, 14);
        tree.insert(tree.root, 19);

        tree.display(tree.root);

        Node result = tree.search(tree.root, 60);
        if (result != null) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}