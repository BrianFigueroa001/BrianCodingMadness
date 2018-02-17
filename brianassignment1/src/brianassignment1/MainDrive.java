package brianassignment1;

public class MainDrive {
    public static void main(String[] Args) throws Exception {
//        ---ASSIGNMENT BINARY TREE

        TreeNode root8 = new TreeNode(8);
        //left of root
        TreeNode node5 = new TreeNode(5);
        TreeNode node9 = new TreeNode(9);
        TreeNode node7 = new TreeNode(7);
        TreeNode node1 = new TreeNode(1);
        TreeNode node12 = new TreeNode(12);
        TreeNode node2 = new TreeNode(2);
        //right of root
        TreeNode node4 = new TreeNode(4);
        TreeNode node11 = new TreeNode(11);
        TreeNode node3 = new TreeNode(3);
        root8.setLeft(node5);
        root8.getLeft().setLeft(node9);
        root8.getLeft().setRight(node7);
        root8.getLeft().getRight().setLeft(node1);
        root8.getLeft().getRight().setRight(node12);
        root8.getLeft().getRight().getRight().setLeft(node2);
        root8.setRight(node4);
        root8.getRight().setRight(node11);
        root8.getRight().getRight().setLeft(node3);

//        ---SECOND BINARY TREE

//        TreeNode root0 = new TreeNode(0);
//        //Left of root
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node7 = new TreeNode(7);
//        TreeNode node8 = new TreeNode(8);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node9 = new TreeNode(9);
//        TreeNode node10 = new TreeNode(10);
//        //right of root
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node11 = new TreeNode(11);
//        TreeNode node12 = new TreeNode(12);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node13 = new TreeNode(13);
//        TreeNode node14 = new TreeNode(14);
//
//        root0.setLeft(node1);
//        root0.setRight(node2);
//        //left side
//        //node1
//        root0.getLeft().setLeft(node3);
//        root0.getLeft().setRight(node4);
//        //node3
//        root0.getLeft().getLeft().setLeft(node7);
//        root0.getLeft().getLeft().setRight(node8);
//        //node4
//        root0.getLeft().getRight().setLeft(node9);
//        root0.getLeft().getRight().setRight(node10);
//        //right side
//        //node 2
//        root0.getRight().setLeft(node5);
//        root0.getRight().setRight(node6);
//        //node 5
//        root0.getRight().getLeft().setLeft(node11);
//        root0.getRight().getLeft().setRight(node12);
//        //node 6
//        root0.getRight().getRight().setLeft(node13);
//        root0.getRight().getRight().setRight(node14);

        //---THIRD BINARY TREE

        //root
//        TreeNode root60 = new TreeNode(60);
//        //left
//        TreeNode node41 = new TreeNode(41);
//        TreeNode node16 = new TreeNode(16);
//        TreeNode node25 = new TreeNode(25);
//        TreeNode node53 = new TreeNode(53);
//        TreeNode node46 = new TreeNode(46);
//        TreeNode node42 = new TreeNode(42);
//        TreeNode node55 = new TreeNode(55);
//        //right
//        TreeNode node74 = new TreeNode(74);
//        TreeNode node65 = new TreeNode(65);
//        TreeNode node63 = new TreeNode(63);
//        TreeNode node62 = new TreeNode(62);
//        TreeNode node64 = new TreeNode(64);
//        TreeNode node70 = new TreeNode(70);
//
//        //root
//        root60.setLeft(node41);
//        root60.setRight(node74);
//
//        //left
//        root60.getLeft().setLeft(node16);
//        root60.getLeft().getLeft().setRight(node25);
//        root60.getLeft().setRight(node53);
//        root60.getLeft().getRight().setLeft(node46);
//        root60.getLeft().getRight().getLeft().setLeft(node42);
//        root60.getLeft().getRight().setRight(node55);
//
//        //right
//        root60.getRight().setLeft(node65);
//        root60.getRight().getLeft().setLeft(node63);
//        root60.getRight().getLeft().getLeft().setLeft(node62);
//        root60.getRight().getLeft().getLeft().setRight(node64);
//        root60.getRight().getLeft().setRight(node70);


        BinaryTree tree = new BinaryTree(root8);
        tree.printInOrder();



    }

}

