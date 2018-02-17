package brianassignment1;

public class Stack {
    private StackNode firstTop; //first
    //currently 8

    public void push(TreeNode treeNode) throws Exception { // Inserts a TreeNode into the stack
        StackNode newTop = new StackNode(treeNode);
        newTop.setNext(firstTop);
        firstTop = newTop;
    }

    public TreeNode pop() throws Exception { //Returns and removes the top TreeNode from the stack
        TreeNode pop = firstTop.getTreeNode();
        firstTop = firstTop.getNext();
        return pop;
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