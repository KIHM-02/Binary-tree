package Arbol;

public class Tree {

    private Nodo root;
    private final String NEGRO = "NEGRO";
    private final String ROJO = "ROJO";

    public Tree() {
        this.root = null;
    }

    public void addNode(int value) {
        root = insert(root, value);
        root.setColor(NEGRO);
    }

    private Nodo insert(Nodo root, int value) {
        Nodo newBranch = new Nodo(value, ROJO);

        if (root == null) {
            root = newBranch;
        }

        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }

        if (isRed(root.getRight()) && !isRed(root.getLeft())) {
            root = rotateLeft(root);
        }
        if (isRed(root.getLeft()) && isRed(root.getLeft().getLeft())) {
            root = rotateRight(root);
        }
        if(isRed(root.getLeft()) && !isRed(root.getRight()))
        {
            colorFlip(root);
        }

        return root;
    }

    private void colorFlip(Nodo root)
    {
        root.setColor(NEGRO);
        if(root.getLeft() == null && root.getRight() != null)
        {
            root.getLeft().setColor(NEGRO);
            root.getRight().setColor(NEGRO);
        }
    }

    private Nodo rotateLeft(Nodo root) {
        Nodo x = root.getRight();
        root.setRight(x.getLeft());
        x.setLeft(root);
        x.setColor(root.getColor());
        root.setColor(ROJO);
        return x;
    }

    private Nodo rotateRight(Nodo root) {
        Nodo x = root.getLeft();
        root.setLeft(x.getRight());
        x.setRight(root);
        x.setColor(root.getColor());
        root.setColor(ROJO);
        return x;
    }

    private boolean isRed(Nodo node) {
        return node != null && ROJO.equals(node.getColor());
    }

    public void ordenAccess(int option)
    {
        switch (option)
        {
            case 1:
                preOrden(this.root);
                break;

            case 2:
                postOrden(this.root);
                break;

            case 3:
                inOrden(this.root);
                break;
        }
    }

    public void preOrden(Nodo root)
    {
        System.out.print(root.getValue()+", ");
        if (root.getLeft() != null)
        {
            preOrden(root.getLeft());
        }
        if(root.getRight() != null)
        {
            preOrden(root.getRight());
        }
    }

    public void postOrden(Nodo root)
    {
        if (root.getLeft() != null)
        {
            postOrden(root.getLeft());
        }
        if(root.getRight() != null)
        {
            postOrden(root.getRight());
        }
        System.out.print(root.getValue()+", ");
    }

    public void inOrden(Nodo root)
    {
        if(root.getLeft() != null)
        {
            inOrden(root.getLeft());
        }
        System.out.print(root.getValue()+", ");
        if(root.getRight() != null)
        {
            inOrden(root.getRight());
        }
    }

    public void printTree() {
        printTree(root, 0);
    }

    private void printTree(Nodo root, int nivel) {
        if (root != null) {
            printTree(root.getRight(), nivel + 1);

            for (int i = 0; i < nivel; i++) {
                System.out.print("    "); // Espacios para la indentación
            }
            System.out.println(root.getValue() + " (" + root.getColor() + ")");

            printTree(root.getLeft(), nivel + 1);
        }
    }

}