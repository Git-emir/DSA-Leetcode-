class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> res = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    res.add(1);
                } else {
                    List<Integer> prevrow = triangle.get(i - 1);
                    int sum = prevrow.get(j - 1) + prevrow.get(j);
                    res.add(sum);
                }
            }
            triangle.add(res);
        }
        return triangle;
    }
}