# Deque

### Objective

In this project, we will cover the fundamentals of the `deque`, and its operations.


### Concepts

Please use the provided resources for a better understanding.


| Concept                                        | Resources                                                                                                                                |
| ---------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| Understand the Deque                           | [Deque Introduction](https://www.youtube.com/watch?v=gXZt4P97UW4)                                                                        |
| Understand how to implement deque linked list | [Deque Linked List Implementation](https://www.geeksforgeeks.org/implementation-deque-using-doubly-linked-list/?ref=header_search)      |
| Understand how to implement deque array       | [Deque Array Implementation](https://www.programiz.com/dsa/queue#:~:text=A%20queue%20is%20a%20useful,item%20that%20comes%20out%20first.) |

### Problem

Store the order number using the deque data structure.

### Implementation

In the Deque class, write the implementation of the following methods **addFirst(), addLast(), removeFirst(), removeLast()**.

> Run the main method to verify your code implementation.

````Java
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Deque deque = new Deque();

        deque.addFirst(new User(1, "Khaled"));
        deque.addFirst(new User(2, "Sara"));

        deque.addLast(new User(4, "Ahmed"));
        deque.addLast(new User(6, "Lama"));

        deque.addFirst(new User(3, "Khaled"));

        System.out.println(deque.removeFirst().name);
        System.out.println(deque.removeLast().name);

        System.out.println(deque.removeFirst().name);

    }
}

````

**Output**

```
Khaled
Lama
Sara

```

> * Once you complete this project, Create an issue with the title "Completed [your-username]".
> * Please create an issue of your questions.
