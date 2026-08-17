class Pair{
    int val;
    int ind;

    Pair(int val,int ind){
        this.val = val;
        this.ind = ind;
    }
}
class StockSpanner {
    Stack<Pair> st;
    int ind;

    public StockSpanner() {
        st = new Stack<>();
        ind = -1;
    }
    
    public int next(int price) {
        ind += 1;
        while(!st.isEmpty() && st.peek().val <= price){
                st.pop();
        }
        int ans = ind -(st.isEmpty()? -1 :st.peek().ind);
        st.push(new Pair(price,ind));
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */