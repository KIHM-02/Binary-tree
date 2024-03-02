package Arbol;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.push(5);
        tree.push(6);
        tree.push(1);


        tree.preOrderLeft();
        System.out.println("\n");
        tree.preOrderRight();

        System.out.println("\n");
        tree.postOrderLeft();
        System.out.println("\n");
        tree.postOrderRight();

        System.out.println("\n");
        tree.inOrderLeft();
    }
}
