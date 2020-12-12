public class Node {

    Node following = null;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToEnd(int data) {
        Node end = new Node(data);
        Node n = this;

        while (n.following != null) {
            n = n.following;
        }
        n.following = end;
    }

    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    public void printNodes(Node node) {
        while (node != null) {
            System.out.print(node.data + " --> ");
            node = node.following;
        }
    }

    int length(Node h) {
        int count = 0;
        while (h != null) {
            count++;
            h = h.following;
        }
        return count;
    }

    int sumOfNodes(Node node) {
        if (node == null) {
            return 0;
        }
        int sum = 0;
        while (node != null) {
            sum += node.data;
            node = node.following;
        }
        return sum;
    }

    Node deleteNode(Node head, int data) {
        Node n = head;
        if (n.data == data) {
            return head.following;
        }
        for (int i = 0; head != null && i < data - 1; i++) {
            head = head.following;
        }
        head.following = head.following.following;
        return head;
    }
}