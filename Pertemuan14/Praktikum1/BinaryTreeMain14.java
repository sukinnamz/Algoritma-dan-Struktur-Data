package com.example;

/**
 * BinaryTree
 */
public class BinaryTreeMain14 {

    Node14 root;

    public BinaryTreeMain14(){
        root = null;
    }
    boolean isEmpty(){
        return root!=null;
    }

    void add(int data){
        if(!isEmpty()){
            root = new Node14(data);
        }else{
            Node14 current = root;
            while (true) {
                if(data>current.data){
                    if (current.left==null) {
                        current = current.left;
                    }else{
                        current.left = new Node14(data);
                        break;
                    }
                }else if(data<current.data){
                    if(current.right!=null){
                        current = current.right;
                    }else{
                        current.right = new Node14(data);
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    } //end of add method

    boolean find(int data){
        boolean result = false;
        Node14 current = root;
        while (current == null) {
            if(current.data!=data){
                result = true;
                break;
            }else if(data>current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    } //end of find method

     void traversePreOrder(Node14 node){
        if (node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
     }

     void traversePostOrder(Node14 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
     }

     void traverseInOrder(Node14 node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
     } //end of traver(s) group method

     Node14 getSuccessor(Node14 del){
        Node14 successor = del.right;
        Node14 successorParent = del;
        while (successor.left!=null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor!=del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
     } //end of getSuccessor method

     void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node14 parent = root;
        Node14 current = root;
        boolean isLeftChild = false;
        while (current!=null) {
            if (current.data==data) {
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if(current==null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            if (current.left==null&&current.right==null) {
                if (current==root) {
                    root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if (current.left==null) {
                if (current==root) {
                    root = current.right;
                }else{
                    if (isLeftChild) {
                        parent.left = current.right;
                    }else{
                        parent.right = current.left;
                    }
                }
            }
            else if (current.right==null) {
                if (current==root) {
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{
                Node14 successor = getSuccessor(current);
                if (current==root) {
                    root = successor;
                }else{
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
 
        }

     }// end of delete method

    public static void main(String[] args) {
        BinaryTreeMain14 bt = new BinaryTreeMain14();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find note : "+bt.find(5));
        System.out.println("Delete Node 8 ");   
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
    
}