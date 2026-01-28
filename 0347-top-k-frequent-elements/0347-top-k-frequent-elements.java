class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
         Collections.sort(list,(a,b) -> b.getValue() - a.getValue());

         int[] result = new int[k];
         for(int i = 0;i<k;i++){
            result[i] = list.get(i).getKey();
         }return result;


        
        }
}