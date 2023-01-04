package org.example;

public class BSTNode {
    private Node root;
    private class Node {
        private int key;
        private String val;
        private Node left,right;
        private int size;

        public Node(int key, java.lang.String val, int n) {
            this.key = key;
            this.val = val;
            size = n;
        }
    }

    public int size() {
        return size(root);
    }
    private int size(Node node) {
        if(node == null)
            return 0;
        else
            return node.size;
    }

    public String searchValue(int key){
        return searchValue(root, key);
    }
    private String searchValue (Node root, int key)
    {
        if (root == null) {
            return null;
        }

        if (key == root.key){
            return root.val;
        }

        if (key > root.key)
            return searchValue(root.right, key);

        return searchValue(root.left, key);
    }

    public void put(int key, String val) {
        root = put(root,key,val);
    }

    private Node put(Node x, int key, String val) {
        if (x == null) {
            return new Node(key,val,1);
        }
        if (key > x.key) {
            x.right = put(x.right,key,val);
        } else if (key < x.key) {
            x.left = put(x.left,key,val);
        } else {
            x.val = val;
        }
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    private Node min(Node x) {
        if (x.left == null) {
            return x;
        }
        return min(x.left);
    }
    public int getSize() {
        return getSize(root);
    }
    private int getSize(Node node) {
        if(node == null)
            return 0;
        else
            return node.size;
    }

    public void delete(int key) {
        root = delete(root, key);
    }
    private Node delete(Node node, int key) {
        if (node == null) return null;

        if (key > node.key) node.right = delete(node.right, key);
        else if (key < node.key) node.left = delete(node.left, key);
        else {
            if (node.right == null) return node.left;
            else if (node.left == null) return node.right;

            root.key = minValue(root.right);

            root.right = delete(root.right, root.key);
        }

        node.size = getSize(node.left) + getSize(node.right) + 1;

        return node;
    }

    private int minValue(Node node) {
        int minValue = node.key;
        while (node.left != null) {
            minValue = node.left.key;
            node = node.left;
        }

        return minValue;
    }
    public void depthOrderTraversal() {
        depthTraversal(root);
    }

    private void depthTraversal(Node node) {
        if (node != null) {
            System.out.print("Key: " + node.key + " Value: " + node.val + "\n");
            depthTraversal(node.left);
            depthTraversal(node.right);
        }
    }
}
