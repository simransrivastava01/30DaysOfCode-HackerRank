import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
    static int height(Node root)
    {
        if(root==null)
        return 0;
        int l=height(root.left);
        int r=height(root.right);
        if(l>r)
        return l+1;
        else
        return r+1;
    }
    static Node level(Node root,int level)
    {
        if(root==null)
        return null;
        else
        {
            if(level==1)
            {System.out.print(root.data+" ");}
            level(root.left,level-1);
            //System.out.print(root.data+" ");
            level(root.right,level-1);
        }
        return root;
    }

	static void levelOrder(Node root){
      //Write your code here
      if(root==null)
      return ;
      int h=height(root);
      for(int i=1;i<=h;i++)
      {
          level(root,i);
      }
      
    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}