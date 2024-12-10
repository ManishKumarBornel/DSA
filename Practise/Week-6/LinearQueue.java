import java.util.Scanner;
public class LinearQueue {
    private static final int MAX = 1000;
    private static int front = 0;
    private static int rear = 0;
    private static int[] queue = new int[MAX];

    public static boolean isEmpty() {
        return front == rear;
    }

    public static boolean isFull() {
        return rear == MAX;
    }

    public static void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            queue[rear++] = item;
        }
    }

    public static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Dequeued item: " + queue[front++]);
        }
    }

    public static void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter item to enqueue: ");
                    int item = scanner.nextInt();
                    enqueue(item);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}