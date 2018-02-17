package brianassignment1;

//left, root, right
public class BinaryTree {
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public void printInOrder() throws Exception {
        Stack stack = new Stack();
        TreeNode currentNode = root;
        int check = -1;
        boolean done = false;

        if (currentNode.getLeft() == null && currentNode.getRight() == null) {
            System.out.print(currentNode.getValue());
            return;
        }

        while (!done) {
            if (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }
            else {
                if(!stack.isEmpty()){
                    currentNode = stack.pop();
                    System.out.print(currentNode.getValue() + " ");
                    currentNode = currentNode.getRight();
                }
                else{
                    done = true;
                }
            }
        }
    }


    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
