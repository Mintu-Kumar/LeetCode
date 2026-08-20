package LeetCodeBlind75;

public class SubTreeOfAnotherTree572 {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null)
            return false;
        if(bothTreeSame(root,subRoot))
            return true;

        return (isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot));
    }

    public boolean bothTreeSame(TreeNode root,TreeNode subRoot){
        if(root ==null && subRoot==null)
            return true;
        if(root ==null || subRoot == null)
            return false;

        return ((root.val == subRoot.val) &&bothTreeSame(root.left,subRoot.left)&& bothTreeSame(root.right,subRoot.right) );
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}
