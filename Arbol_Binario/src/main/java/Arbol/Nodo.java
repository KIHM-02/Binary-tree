package Arbol;

public class Nodo
{
    private int value;
    private String color;
    private Nodo left, right;

    public Nodo(int value, String color)
    {
        this.value = value;
        this.color = color;
        left = null;
        right = null;
    }

    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }
}
