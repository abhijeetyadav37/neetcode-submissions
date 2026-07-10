class StockSpanner {

    // Stack stores {price, span}
    Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {

        // Today's span starts as 1 (today itself)
        int span = 1;

        // Remove all smaller or equal prices
        while (!stack.isEmpty() && stack.peek()[0] <= price) {

            // Add the popped span to today's span
            span += stack.peek()[1];

            // Remove the element
            stack.pop();
        }

        // Store current price and its span
        stack.push(new int[]{price, span});

        // Return today's span
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */