package Main;

import java.util.ArrayList;


public class ABR {
    int nb;
    public Node root=null;
    ArrayList<Integer> L ;

    public ABR(){
        this.nb = 0;
    }

    public boolean isEmpty(){
        return this.root == null;
    }
    public int nbElements(){
        return this.nb;
    }
    public ArrayList<Integer> toList(){
        this.L= new ArrayList<>();
        this.inorder(this.root);
        return L;
    }
    public boolean contains(Integer i){
        this.L = this.toList();
        for (Integer e : L) {
            if(e.equals(i)){
                return true;
            }
        }
        return false;
    }
    /* Inorder traversal of a binary tree*/
    public void inorder(Node temp)
    {
        if (temp == null)
            return;
        inorder(temp.left);
        //System.out.print(temp.key+" ");
        if(L == null ){
            L = new ArrayList<>();
        }
        L.add(temp.key);
        inorder(temp.right);
    }

    /*function to insert element in binary tree */
    public Node insert(Node temp,int key,int src)
    {
        if(src==0 || src==1){
            temp = this.root;
        }
        if (temp == null) {
            temp = new Node(key);

            this.nb++;
            if(src==1){
                this.root = temp;
            }
            return temp;
        }
        /* Otherwise, recur down the tree */
        if (key <= temp.key)
            temp.left = insert(temp.left, key,2);
        else {
            temp.right = insert(temp.right, key, 2);

        }
        /* return the (unchanged) node pointer */
        return temp;
    }
}
