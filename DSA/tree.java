import java.util.*;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public void setRight(TreeNode right) {
		this.right = right;
	}	
	
}




public class TreeDemo {
	
	TreeNode node=null;
	TreeNode root=null;
	TreeNode p=root;
	TreeNode q=root;
	
	public TreeNode insert(TreeNode root, int data) {
		if(root==null) {
			root=new TreeNode(data);
			return root;
		}
		
		if(data<= root.getData()) {
			root.setLeft(insert(root.getLeft(),data));
		}else if(data>root.getData()){
			root.setRight(insert(root.getRight(),data));
		}
		
		return root;
	}
	
	void inorder(TreeNode node) {
		if(node==null) {
			return;
		}
		inorder(node.getLeft());
		System.out.println(node.getData());
		inorder(node.getRight());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=null;
		TreeDemo tree = new TreeDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of inputs: ");
		int n=sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println("Enter value: ");
			int temp_val=sc.nextInt();
			root=tree.insert(root, temp_val); //generates a tree
		}
		
		System.out.println("Tree created successfully!!!");
		tree.inorder(root);
	}

}
