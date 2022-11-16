import java.util.Scanner;

class stck{
    public int a[];
    public int front ,rear,capacity,count;
    stck(int x){
        a=new int [x];
        front =0;rear=-1;
        capacity=x; count =0;
    }

}

interface methods{
    int size();
    void push();void pop();
    void display();
    boolean isfull(); boolean isempty();
}

class implt extends stck implements methods{
    Scanner input = new Scanner(System.in);
    implt(int y){
        super(y);
    }
    public int size(){
        return count;
    }
    public boolean isfull(){
        return (size()==capacity);
    }
    public boolean isempty(){
        return( size()==0 );
    }
    public void display(){
        System.out.println("stack is");
        for(int i=rear;i>=front;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
    public void push(){
        if(isfull()){
            System.out.println("stack is full cannot push another element");
        }
        else{
            System.out.println("Enter the elemnts of stack");
            int z = input.nextInt();
        rear++;
        a[rear]=z;
        count++;
        display();}
    }
    public void pop(){
        if(isempty()){
            System.out.println("stack is empty no elements to display");
        }
        //a[front]=a[front-1];
        else{rear--;
        count--;
        display();}
    }
}

public class stack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int n=input.nextInt();
        implt obj = new implt(n);
        int choice;char cnt;
        do{
            System.out.println("Following operations are available to perform:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                obj.push();
                break;
                case 2:
                obj.pop();
                break;
            }
        System.out.println("If yes enter y else enter n:");
         cnt =input.next().charAt(0);
            
        }while(cnt=='y');
        input.close();
    }
}
