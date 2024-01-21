public class Deque {

    public Node front;
    public Node rear;

    Deque() {
        this.front = null;
        this.rear = null;
    }

    public void addFirst(User newData) {
        // Your code here

    }

    public void addLast(User newData) {
        // Your code here
    }

    public User removeFirst() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }

        // Your code here

        return null;
    }

    public User removeLast() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }

        // Your code here

        return null;
    }

    public User getFront() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }

        return front.data;
    }

    public User getRear() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }

        return rear.data;
    }
}
