package suanfa.leetcode.tree;

import java.util.Objects;

/**
 * @Author: Zxw
 * @Description: leetCode 反转二叉树
 * @Date: Created in 23:30 2021/1/19
 * @Modifued By:
 */
class FlipBinaryTreeNode{
    //存储的数值
    public int val;
    //右节点
    public FlipBinaryTreeNode righNode;
    //左节点
    public FlipBinaryTreeNode leftNode;

    public FlipBinaryTreeNode() {
    }

    public FlipBinaryTreeNode(int val) {
        this.val = val;
    }

    public FlipBinaryTreeNode(int val, FlipBinaryTreeNode righNode, FlipBinaryTreeNode leftNode) {
        this.val = val;
        this.righNode = righNode;
        this.leftNode = leftNode;
    }
}

public class FlipBinaryTree {

    //先序遍历
    public static void firstRoot(FlipBinaryTreeNode flipBinaryTreeNode){
        //如果当前节点威null 啥也不做
        if(Objects.isNull(flipBinaryTreeNode)) return;

        System.out.println(flipBinaryTreeNode.val);

        //遍历左子树
        if(!Objects.isNull(flipBinaryTreeNode.righNode)) {
            firstRoot(flipBinaryTreeNode.righNode);
        }

        //遍历右子树
        if(!Objects.isNull(flipBinaryTreeNode.leftNode)){
            firstRoot(flipBinaryTreeNode.leftNode);
        }

    }

    public static void main(String[] args) {

        //构造一个测试二叉树
        FlipBinaryTreeNode flipBinaryTreeNodeHead = new FlipBinaryTreeNode(1);
        FlipBinaryTreeNode flipBinaryTreeNodeTwo = new FlipBinaryTreeNode(2);
        FlipBinaryTreeNode flipBinaryTreeNodeThree = new FlipBinaryTreeNode(3);
        FlipBinaryTreeNode flipBinaryTreeNodeFour = new FlipBinaryTreeNode(4);
        FlipBinaryTreeNode flipBinaryTreeNodeFive = new FlipBinaryTreeNode(5);

        flipBinaryTreeNodeHead.righNode = flipBinaryTreeNodeTwo;

        flipBinaryTreeNodeHead.leftNode = flipBinaryTreeNodeFour;

        flipBinaryTreeNodeTwo.righNode = flipBinaryTreeNodeThree;

        flipBinaryTreeNodeFour.righNode = flipBinaryTreeNodeFive;


        firstRoot(flipBinaryTreeNodeHead);
    }



}