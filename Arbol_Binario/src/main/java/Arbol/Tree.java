package Arbol;

public class Tree
{
    private Nodo root;

    public Tree() { root = null; }

    public void addNode(int _value)
    {
        root = push(this.root, _value);
    }

    public Nodo push(Nodo root, int _value)
    {
        Nodo newBranch = new Nodo(_value);

        if(root == null)
        {
            root = newBranch;
        }
        else
        {
            if(_value < root.getValue())
            {
                Nodo leftChild = push(root.getLeft(), _value);
                root.setLeft(leftChild);
            }
            else
            {
                Nodo rightChild = push(root.getRight(), _value);
                root.setRight(rightChild);
            }
        }

        return root;
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
}