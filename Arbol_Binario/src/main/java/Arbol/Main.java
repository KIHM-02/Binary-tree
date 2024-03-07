package Arbol;

public class Main
{
    public static void main(String[] args) {
        Tree tree = new Tree();


        tree.addNode(10);
        tree.addNode(5);
        tree.addNode(15);
        tree.addNode(15);
        tree.addNode(11);
        tree.addNode(1);
        tree.addNode(2);
        tree.addNode(4);

        /*

        tree.ordenAccess(1);
        System.out.println("\n");
        tree.ordenAccess(2);
        System.out.println("\n");
        tree.ordenAccess(3);

        */

        tree.printTree();

        System.out.println("\n");
        tree.ordenAccess(3);
    }
}
