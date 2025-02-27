package org.example.chapter03.pr2.bst;


public class Main {
    public static void main(String[] args) {
        TreeNode tree = insertNode(null, 10); //Root TreeNode
        tree = insertNode(tree, 5);
        tree = insertNode(tree, 15);
        tree = insertNode(tree, 3);
        tree = insertNode(tree, 7);
        tree = insertNode(tree, 12);
        tree = insertNode(tree, 1);
        // tree= 으로 새로 바꿔주고 그걸 다시 루트 노드로 넣어줘서 다시 붙여줌

    }

    public static TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.value) {
            root.left = insertNode(root.left, value);
        } else if(value > root.value) {
            root.right = insertNode(root.right, value);
        }
        return root;
    }
}
