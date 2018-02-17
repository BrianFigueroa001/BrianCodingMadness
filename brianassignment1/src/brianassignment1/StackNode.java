package brianassignment1;

public class StackNode {
    private TreeNode treeNode;
    private StackNode next;

    public StackNode(TreeNode treeNode){
        this.treeNode = treeNode;
    }

    public TreeNode getTreeNode(){
        return treeNode;
    }
    public StackNode getNext(){
        return next;
    }
    public void setTreeNode(TreeNode treeNode){
        this.treeNode = treeNode;
    }
    public void setNext(StackNode next){
        this.next = next;
    }
}
