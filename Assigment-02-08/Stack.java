// LIFO

// arr =[1]

// push 2

// arr =[1,2]

// pop - 2  will  be removed

// arr= [1]

public class Stack {
    private int[] arr;
    private int ptr; // top of stack

    public Stack(int cap) {
        arr = new int[cap];
        ptr = -1;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow: Stack is empty");
        }
        int temp = arr[ptr];
        ptr--;
        return temp;

    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[ptr];

    }

    void push(int el) {
        if(ptr==arr.length-1){
            throw new RuntimeException("Stack overflow: Stack is full!");
        }
        ptr++;
        arr[ptr] = el;
    } 

    int getSize() {
        return ptr + 1;
    }

    boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args){
        Stack st = new Stack(3);
        st.push(5);
        st.push(4);
        st.push(3);
        // st.push(2);
        System.out.println(st.peek());

    }

}
