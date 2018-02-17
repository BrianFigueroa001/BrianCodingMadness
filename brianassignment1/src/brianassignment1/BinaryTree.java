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

        if (currentNode.getLeft() == null && currentNode.getRight() == null) {
            System.out.print(currentNode.getValue());
            return;
        }
        /**
         * This entire loop continues to first search for the left-most root, followed by detecting whether it has a node to its right or not.
         This entire while loop traverses the binary tree through in-order (LEFT, ROOT, RIGHT)
         Once it gets all of the left side of the binary tree, the root will be popped out of the stack and the node right to the root will be put into the stack.
         Whenever a node is printed, it will be popped out of the stack since it is no longer needed. That way, any nodes left further behind while traversing down the tree
         can get back up and print whatever is left in the stack.
         The node farthest to the right in one side of the tree will end up having its left and right nodes as NULL and the stack either only having the binary root left, or empty.
         If the stack ends up with the binary root only, this means it will begin traversal on the right side of the binary tree. If the stack is empty, that means the traversal is complete.
         In other words, the nodes farthest to the right will determine whether it is time to go down the right side of the tree, or the operation is complete.
         */

        while (check == -1) {
            //This while loop gets the the tree node farthest to the left
            while (currentNode.getLeft() != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }
            //This statement prints out currentNode
            System.out.print(currentNode.getValue() + " ");

            //From here, the outer if-else statement basically does a bunch of whacky shit that I made up somehow.
            //It checks whether the currentNode node in the traversal has a node to its RIGHT or not.

            //This if-statement runs if the currentNode has a node to its RIGHT
            //It assigns the currentNode to the node to its RIGHT
            if (currentNode.getRight() != null) {
                currentNode = currentNode.getRight();
            }

            //This else-statement runs if the LEFT/ROOT DOESN'T have a node to its RIGHT.
            else {
                /**
                 * If the if-statement runs, that means the stack is not empty and the traversal is not complete.
                 The currentNode will be assigned a popped node from the stack, and then printed.
                 This if-statement occurs mostly if a RIGHT node is printed, but there are still other roots higher in the
                 binary tree that has yet to be printed and checked for its right nodes.
                 */
                if (stack.isEmpty() != true) {
                    currentNode = stack.pop();
                    System.out.print(currentNode.getValue() + " ");
                    //This inner if-statement runs if the popped node has a node to its right. If so, the node traverses to its right.
                    if (currentNode.getRight() != null) {
                        currentNode = currentNode.getRight();
                    }
                    //This inner else-statement indicates that either the binary tree root has been reached, or the traversal ends.
                    else {
                        //If this inner if-statement runs, then the node is the binary tree root.
                        //It will pop out the binary tree root, print it, then traverse to its right to begin traversal down the right side of the binary tree.
                        if (stack.isEmpty() != true) {
                            currentNode = stack.pop();
                            System.out.print(currentNode.getValue() + " ");
                            currentNode = currentNode.getRight();
                        }
                        //If this inner-inner else statement runs, then the traversal has reached its end.
                        else {
                            check = 1;
                        }
                    }
                }
                //If this else-statement runs, then the stack is empty. At this point, the traversal has ended
                else {
                    check = 1;
                    continue;
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
