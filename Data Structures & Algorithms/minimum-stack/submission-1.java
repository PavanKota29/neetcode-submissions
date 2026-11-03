class MinStack {

    private Stack<Integer> st;
    public MinStack() {
        st = new Stack<Integer>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer> temp =new  Stack<>();
        int min = st.peek();
        while(!st.isEmpty()){
            int ele = st.pop();
            min = Math.min(min,ele);
            temp.push(ele);
        }

        while(!temp.isEmpty()){
            st.push(temp.pop());
        }

        return min;
    }
}
