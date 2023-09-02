class Stack
{
    int size;
    int arr[];
    Stack(int size)
    {
        this.arr= new int[size];
    }

    int top= -1;

    void push(int x)
    {
        if(top==arr.length-1)
        {
            System.out.println("Stack is full!");
        }
        else{
            top++;
            arr[top]= x;
        }
    }

    void pop()
    {
        if(top==-1)
        {
            System.out.println("The stack is empty!");
        }
        else{
            System.out.println("The poped element is: "+arr[top]);
            top--;
        }
    }

    void print()
    {
        if(top==-1)
        {
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The elements of the stack are: ");
            for(int i=top; i>=0; i--)
            {
                System.out.println(arr[i]+" ");
            }
        }
    }

    public static void main(String args[])
    {
        Stack s1= new Stack(30);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(15);
        s1.push(9);

        s1.print();

        s1.pop();
        s1.pop();
        s1.pop();

        s1.print();
    }

}