public class Deque {

    public Node front;
    public Node rear;

    Deque() {
        this.front = null;
        this.rear = null;
    }

    public void addFirst(User newData) {
        Node newNode = new Node(newData);
        if(front == null){
            this.front = newNode;
            this.rear = newNode;
        }

        if(front != null){
        newNode.next = front;
        front.previews = newNode;
        front = newNode;
        }




    }

    public void addLast(User newData) {
        Node newNode = new Node(newData);
        if (rear == null) {
            this.rear = newNode;
            this.front = newNode;
        }
        if (rear != null){
            newNode.previews = rear;
            rear.next = newNode;
            rear = newNode;
        }

    }

    public User removeFirst() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }

        front.next.previews = null;
        var x = front.data;
        front = front.next;
        
        return x;
    }

    public User removeLast() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }

        rear.previews.next = null;
        var y = rear.data;
        rear = rear.previews;

        return y;
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

    public void desplay(){
        var temp = rear;
        System.out.println(temp.previews.data.id);

        while (temp.previews != null) {
            System.out.println(temp.data.id);
            temp = temp.previews;
        }
    }
}
