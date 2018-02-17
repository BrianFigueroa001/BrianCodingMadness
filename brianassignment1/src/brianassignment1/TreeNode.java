package brianassignment1;

public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value){
        this.value = value;
    }
    public int getValue(){ // This gets the value for the TreeNode
        return value;
    }
    public TreeNode getLeft(){ // This gets the current node’s left node
        return left;
    }
    public TreeNode getRight(){ // This gets the current node’s right node
        return right;
    }
    public void setValue(int value){ // This sets the value for the TreeNode
        this.value = value;
    }
    public void setLeft(TreeNode left){ // This sets the current node’s left node
        this.left = left;
    }
    public void setRight(TreeNode right){ // This sets the current Node’s right node
        this.right = right;
    }

}
