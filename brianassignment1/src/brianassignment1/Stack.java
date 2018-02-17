package brianassignment1;

public class Stack {
    private StackNode firstTop; //first
    //currently 8

    public void push(TreeNode treeNode) throws Exception { // Inserts a TreeNode into the stack
        if (isEmpty()) {
            firstTop = new StackNode(treeNode);
            return;
        }
        StackNode currentTop = firstTop;
        while (currentTop.getNext() != null){
            currentTop = currentTop.getNext();
        }
        StackNode newTop = new StackNode(treeNode);
        currentTop.setNext(newTop);
    }
    public TreeNode pop() throws Exception { //Returns and removes the top TreeNode from the stack
        StackNode currentTop = firstTop;
        if(currentTop.getNext() != null) {
            while (currentTop.getNext().getNext() != null) {
                currentTop = currentTop.getNext();
            }
            TreeNode popNode = currentTop.getNext().getTreeNode();
            currentTop.setNext(null);
            return popNode;
        }
        else {
            TreeNode popNode = currentTop.getTreeNode();
            firstTop = null;
            return popNode;
        }
    }
    //currentRoot: 5
    //Stack:8
    public boolean isEmpty() throws Exception { // Checks to see if the stack is empty
        if (firstTop == null){
            return true;
        }
        return false;
    }

}
//8, 5,