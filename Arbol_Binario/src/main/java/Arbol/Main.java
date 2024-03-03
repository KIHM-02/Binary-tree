package Arbol;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.addNode(5);
        tree.addNode(6);
        tree.addNode(4);

        tree.preOrderAccessLeft();
    }
}
