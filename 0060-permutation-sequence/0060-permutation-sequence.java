class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        ArrayList<Integer> num = new ArrayList<>();
        for(int i =1;i<n;i++){
            fact = fact *i;
            num.add(i);
        }
        num.add(n);
        k = k-1;
        String ans ="";
        while(true){
            ans += num.get(k/fact);
            num.remove(k/fact);
            if(num.size() ==0) break;

            k = k%fact;
            fact = fact/num.size();
        }return ans;

    }
}