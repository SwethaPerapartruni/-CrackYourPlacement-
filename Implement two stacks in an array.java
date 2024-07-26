class twoStacks {
    // Declare stack1 and stack2 as instance variables
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    // Constructor to initialize the two stacks
    twoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        stack1.push(x);
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        stack2.push(x);
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if (!stack1.isEmpty()) {
            return stack1.pop();
        } else {
            return -1;
        }
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            return -1;
        }
    }
}
