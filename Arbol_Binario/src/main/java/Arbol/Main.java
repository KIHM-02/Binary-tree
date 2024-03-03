package Arbol;

public class Main
{
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.addNode(5);
        tree.addNode(6);
        tree.addNode(4);

        tree.ordenAccess(1);
        System.out.println("\n");
        tree.ordenAccess(2);
        System.out.println("\n");
        tree.ordenAccess(3);
    }
}
