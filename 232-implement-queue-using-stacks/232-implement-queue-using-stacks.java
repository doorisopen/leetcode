class MyQueue {
    private Stack<Integer> stk;
    
    public MyQueue() {
        stk = new Stack<>();
    }
    
    public void push(int x) {
        pushBack(x);
    }
    
    public int pop() {
        return stk.pop();
    }
    
    public int peek() {
        return stk.peek();
    }
    
    public boolean empty() {
        return stk.isEmpty();
    }
    
    private void pushBack(int x) {
        Stack<Integer> temp = new Stack<>();
        while (!stk.isEmpty()) {
            temp.push(stk.peek());
            stk.pop();
        }
        temp.push(x);
        while (!temp.isEmpty()) {
            stk.push(temp.peek());
            temp.pop();
        }
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