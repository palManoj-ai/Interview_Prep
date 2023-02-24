import org.w3c.dom.Node;

public class BinaryTree {

    static class NodeOfTree{
        int data;
        Node right;
        Node left;

        NodeOfTree(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int index=-1;
        public static Node buildTree(int[] nodes)
        index++;
        if(nodes[index]==-1){
            return null;
        }
        NodeOfTree newNode=new NodeOfTree(index);
        buildTree(nodes);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}