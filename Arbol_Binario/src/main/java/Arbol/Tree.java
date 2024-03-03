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

    public void preOrderAccessLeft()
    {
        preOrdenLeft(this.root);
    }

    public void preOrdenLeft(Nodo root)
    {
        System.out.print(root.getValue()+", ");
        if (root.getLeft() != null)
        {
            preOrdenLeft(root.getLeft());
        }
        if(root.getRight() != null)
        {
            preOrdenLeft(root.getRight());
        }
    }
}