package Arbol;

public class Tree
{
    private int value;
    private Tree left = null;
    private Tree right = null;

    public Tree() { }

    public Tree(int _value)
    {
        this.value = _value;
    }

    public void push(int _value)
    {
        Tree newBranch = new Tree(_value);
        if(left == null) {
            left = newBranch;
        }
        else if(right == null) {
            right = newBranch;
            System.out.println("Entre aqui");
        }
        else if (left.left == null || left.right == null) {
            left.push(_value);
        }
        else {
            right.push(_value);
        }
    }

    //Primero imprime el dato, despues recorre
    public void preOrderLeft()
    {
        System.out.print(value + ", ");
        if(left != null)
        {
            left.preOrderLeft();
        }
        if(right != null)
        {
            right.preOrderLeft();
        }
    }

    //Imprime el dato, despues recorre
    public void preOrderRight()
    {
        System.out.print(value + ", ");
        if(right != null)
        {
            right.preOrderRight();
        }
        if(left != null)
        {
            left.preOrderRight();
        }
    }

    public void postOrderLeft()
    {
        if(left != null)
        {
            left.postOrderLeft();
        }
        if(right != null)
        {
            right.postOrderLeft();
        }
        System.out.print(value + ", ");
    }

    public void postOrderRight()
    {
        if(right != null)
        {
            right.postOrderRight();
        }
        if(left != null)
        {
            left.postOrderRight();
        }
        System.out.print(value+", ");
    }

    public void inOrderLeft()
    {
        if(left != null)
        {
            left.inOrderLeft();
        }
        System.out.print(value+", ");
        if (right != null)
        {
            right.inOrderLeft();
        }
    }

}
