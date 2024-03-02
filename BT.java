import java.util.Scanner;
class treeNode{
    int data;
    treeNode left;
    treeNode right;
    public treeNode(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}
class BinaryTree
{
    treeNode root=null;
    void insert()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the root value:");
        int val=sc.nextInt();
        if(val != -1)
        {
            treeNode node=new treeNode(val);
            root=node;
            insert(root);
        }
    }
    
    void insert(treeNode curr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the left value of "+curr.data + ":");
        int left_val=sc.nextInt();
        if(left_val != -1)
        {
            treeNode node=new treeNode(left_val);
            curr.left=node;
            insert(curr.left);
        }
        
        System.out.println("Enter the right value of "+curr.data + ":");
        int right_val=sc.nextInt();
        if(right_val != -1)
        {
            treeNode node=new treeNode(right_val);
            curr.right=node;
            insert(curr.right);
        }
    }
    
    void in_order()
    {
        in_order(root);
    }
    void in_order(treeNode curr)
    {
        if(curr==null)
        {
            return;
        }
       
        in_order(curr.left);
        System.out.print(curr.data+" ");
        in_order(curr.right);
    }
    
    void pre_order()
    {
        pre_order(root);
    }
    void pre_order(treeNode curr)
    {
        if(curr==null)
        {
            return;
        }
        System.out.print(curr.data+" ");
        pre_order(curr.left);
        pre_order(curr.right);
    }
    
     void post_order()
    {
        post_order(root);
    }
    void post_order(treeNode curr)
    {
        if(curr==null)
        {
            return;
        }
       
        post_order(curr.left);
        post_order(curr.right);
        System.out.print(curr.data+" ");
    }
}

public class Main{
    public static void main(String[]args){
        BinaryTree bt=new BinaryTree();
        bt.insert();
        bt.in_order();
        System.out.println();
        bt.pre_order();
        System.out.println();
        bt.post_order();
        
    }
}


/* 

OUTPUT:

Enter the root value:
1
Enter the left value of 1:
2
Enter the left value of 2:
4
Enter the left value of 4:
-1
Enter the right value of 4:
-1
Enter the right value of 2:
5
Enter the left value of 5:
-1
Enter the right value of 5:
-1
Enter the right value of 1:
3
Enter the left value of 3:
6
Enter the left value of 6:
-1
Enter the right value of 6:
-1
Enter the right value of 3:
7
Enter the left value of 7:
-1
Enter the right value of 7:
-1
4 2 5 1 6 3 7 
1 2 4 5 3 6 7 
4 5 2 6 7 3 1 

*/