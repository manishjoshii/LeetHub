class MyQueue {
    Stack<Integer> q;
    Stack<Integer> temp;

    public MyQueue() {
        q = new Stack<>();
        temp = new Stack<>();
    }

    public void push(int x) {
        while (!q.isEmpty()) {
            temp.push(q.pop());
        }
        q.push(x);
        while (!temp.isEmpty()) {
            q.push(temp.pop());
        }
    }

    public int pop() {
        return q.pop();
    }

    public int peek() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */