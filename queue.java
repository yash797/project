import java.util.Scanner;

class queu {
    public int a[];
    public int front, rear, capacity, count;

    queu(int x) {
        a = new int[x];
        front = 0;
        rear = -1;
        capacity = x;
        count = 0;
    }

}

interface methods {
    int size();

    void push();

    void pop();

    void display();

    boolean isfull();

    boolean isempty();
}

class implt extends queu implements methods {
    Scanner input = new Scanner(System.in);

    implt(int y) {
        super(y);
    }

    public int size() {
        return count;
    }

    public boolean isfull() {
        return (size() == capacity);
    }

    public boolean isempty() {
        return (size() == 0);
    }

    public void display() {
        System.out.println("Queue is");
        for (int i = front; i <= rear; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    public void push() {
        if (isfull()) {
            System.out.println("Queue is full cannot push another element");
        } else {
            System.out.println("Enter the elemnts of Queue");
            int z = input.nextInt();
            rear++;
            a[rear] = z;
            count++;
            display();
        }
    }

    public void pop() {
        if (isempty()) {
            System.out.println("Queue is empty no elements to display");
        }
        // a[front]=a[front-1];
        else {
            front++;
            count--;
            display();
        }
    }
}

public class queue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Queue");
        int n = input.nextInt();
        implt obj = new implt(n);
        int choice;
        char cnt;
        do {
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
            cnt = input.next().charAt(0);

        } while (cnt == 'y');
        input.close();
    }
}
