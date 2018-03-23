package niuke;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
	
		Solution solution=new Solution();
		TreeNode node=new TreeNode(0);
	}
	
	
	  public int maxPathSum(TreeNode root) {
		return 0;
	        
	  }
	  
	  int max=Integer.MIN_VALUE;
	  public int findMax(TreeNode root){
		  if(root==null){
			  return 0;
		  }
		  int left=findMax(root.left);
		  int right=findMax(root.right);
		  int path=left+root.val+right;
		  if(max<path){
			  max=path;
		  }
		  return Math.max(left, right)+root.val;
	  }
	  
	  
    
}
class ListNode {
    int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}
class RandomListNode {
     int label;
     RandomListNode next, random;
     RandomListNode(int x) { this.label = x; }
}

class UndirectedGraphNode {
	int label;
	ArrayList<UndirectedGraphNode> neighbors;

	UndirectedGraphNode(int x) {
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}



