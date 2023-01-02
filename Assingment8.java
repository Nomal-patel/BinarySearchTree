import java.util.LinkedList;
import java.util.Queue;

public class Assingment8 {

    public static class Team{
        public String name;
        public int yearFormed;


        public Team(String n,int y){
            this.name = n;
            this.yearFormed = y;
        }
        //GETTERS

        public String getName(){
            return name;
        }

        public int getYearFormed(){
            return yearFormed;
        }

        //SETTERS

        public void setName(String name){
            this.name = name;
        }

        public void  setYearFormedFormed(int yearFormed){
            this.yearFormed = yearFormed;
        }

    }// end Team class


    //Node class
    public static class Node{

        String value;
        public Team t;
        public Node left;
        public  Node right;

        Node(String v){
            value=v;
            t=null;
            right = null;
            left = null;
        }

        public Team getT(){
            return t;
        }
        public  Node getLeft(){
            return left;
        }
        public Node getRight(){
            return right;
        }
        public String getValue(){
            return value;
        }







    }    //End Node Class
    public static class Tree {

        //INORDER METHOD
        public void inorder(Node n) {
            if (n == null) {
                return;
            }
            inorder(n.left);
            System.out.println(n.value);
            inorder(n.right);
        }

        //POSTORDER METHOD
        public void postorder(Node n) {
            if (n == null) {
                return;
            }
            postorder(n.left);
            postorder(n.right);
            System.out.println(n.value);
        }
        //PREORDER METHOD

        public void preorder(Node n) {
            if (n == null) {
                return;
            }
            System.out.println(n.value);
            preorder(n.left);
            preorder(n.right);
        }

        //breadFirst method
        public void breadFirst(Node root){
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                Node n = queue.poll();
                System.out.println(n.value);
                if(n.left != null){
                    queue.add(n.left);
                }
                if(n.right != null){
                    queue.add(n.right);
                }
            }
        }



    }

    //END TREE












}
