package LeetCodeBlind75;

public class InvertBinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }


    public static TreeNode invertTree(TreeNode root){

        if(root==null)
            return root;

        else
        {
            invertTree(root.left);
            invertTree(root.right);
            TreeNode temp = root.left;
            root.left =  root.right;
            root.right=temp;
            return root;
        }


    }
    public static void main(String[] args) {

    }
}
