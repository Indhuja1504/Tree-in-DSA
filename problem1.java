
class treenode{
    int value;
    treenode left, right;
    treenode(int value){
        this.value = value;
        left = right = null;
    }
}
public class treetraversal{
    public void postorder(treenode root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
    
        public void inorder(treenode root){
            if(root==null)
                return;
            inorder(root.left);
            System.out.print(root.value+" ");
            inorder(root.right);
        }
       
            public void preorder(treenode root){
                if(root==null)
                    return;
                System.out.print(root.value+" ");
                preorder(root.left);
                preorder(root.right);
                
            }
        
    public static void main(String[] args)
    {
        treenode root=new treenode(4);
        root.left=new treenode(2);
        root.right=new treenode(5);
        root.left.left=new treenode(3);
        // root.left.right=new treenode(5);
        root.right.left=new treenode(7);
        root.right.right=new treenode(6);
        // root.left.right.left=new treenode(8);
        root.right.right.left=new treenode(8);
        // root.right.right.right=new treenode(10);
        root.left.left.right=new treenode(9);
        root.left.left.right.left=new treenode(1);
        
        treetraversal tree=new treetraversal();
        
        tree.inorder(root);
        System.out.println(" ");
        tree.preorder(root);
        System.out.println(" ");
        tree.postorder(root);
    }
}
