class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int val) {
        root = insertNode(root, val);
    }

    private TreeNode insertNode(TreeNode currentNode, int val) {
        if (currentNode == null) {
            return new TreeNode(val);
        }
        if (val < currentNode.val) {
            currentNode.left = insertNode(currentNode.left, val);
        } else if (val > currentNode.val){
            currentNode.right = insertNode(currentNode.right, val);
        }
        return currentNode;
    }
    public boolean search (int val) {
        return searchNode(root, val);
    }
    private boolean searchNode ( TreeNode currentNode, int val) {
        if (currentNode == null) {
            return false;
        }
        if (val == currentNode.val) {
            return true;
        } else if (val < currentNode.val){
            return searchNode(currentNode.left, val);
        } else {
            return searchNode(currentNode.right, val);
        }
    }
    public void inorderTraversal() {
        inorder(root);
    }
    private void inorder(TreeNode currentNode) {
        if (currentNode != null) {
            inorder(currentNode.left);
            System.out.print(currentNode.val + " ");
                inorder(currentNode.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);

        System.out.println("Inorder Traversal: ");
        tree.inorderTraversal();
        int searchValue = 5;
        if (tree.search(searchValue)) {
            System.out.println("\nValue: " + searchValue + " is found in the tree.");
        } else {
            System.out.println("\nValue: " + searchValue + " is not found in the tree.");
        }
    }
}
