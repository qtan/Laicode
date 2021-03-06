//Check if a given binary tree is completed. A complete binary tree is one in which every level of the binary tree is completely filled except possibly the last level. Furthermore, all nodes are as far left as possible.
//
//Examples
//
//        5
//
//      /    \
//
//    3        8
//
//  /   \
//
//1      4
//
//is completed.
//
//        5
//
//      /    \
//
//    3        8
//
//  /   \        \
//
//1      4        11
//
//is not completed.
package round5;

import java.util.ArrayDeque;
import java.util.Queue;

import round4.TreeNode;

public class CheckIfBTComplete {
	public boolean checkComplete(TreeNode root) {
		if(root == null) {
			return true;
		}
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		boolean flag = true;
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode cur = queue.poll();
			if (cur.left==null) {
				flag = false;
			}else if (flag==false) {
				return false;
			}else {
				queue.offer(cur.left);
			}
			if (cur.right==null) {
				flag = false;
			}else if (flag==false) {
				return false;
			}
			else {
				queue.offer(cur.right);
			}
		}
		return true;
		
	}
}
