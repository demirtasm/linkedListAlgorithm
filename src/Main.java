public class Main {
    public static void main(String[] args) {
        // Example
        Node node = new Node(4);
        node.appendToEnd(5);
        node.appendToEnd(6);
        node.appendToEnd(7);
        // End of Example

        //Sum all Nodes
        System.out.println(node.sumOfNodes(node));

        //Println Nodes 4 --> 5 --> 6 --> 7
        node.printNodes(node);

        //Total Nodes Length
        System.out.println(node.length(node));

        //Delete Nodes
        node.deleteNode(node, 1);
        node.printNodes(node);
    }
}
