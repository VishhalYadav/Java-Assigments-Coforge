// FIFO
// size = 5
// arr = [1,0,0,0,0]

// push 2 to arr = [2,1,0,0,0]

// push 3 to arr = [3,2,1,0,0]

// pop arr = [2], 1 will  be popped.

// The push operation should add elements to end of queue.(rear)
// The pop operation remove elements from front of queue.(front)


public class Queue {
    private int []arr;
    private int front;
    private int rear;
    private int size;

    Queue(int cap){
        arr = new int[cap];
        front = 0;
        rear = -1;
        size = 0;
    }

    void push(int el){
        if(size == arr.length){
            throw new RuntimeException("Queue is already full!");
        }
        
        rear = (rear+1) % arr.length;
        arr[rear] = el;
        size++;

    }

    int pop(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }
        int temp = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return temp;

    }

    int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }

        return arr[front];
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return arr.length == size;
    }

    public static void main(String[] args){
        Queue q = new Queue(3);
        q.push(5);
        q.push(4);
        q.push(3);

        q.pop();
        System.out.println(q.peek());

    }

}
