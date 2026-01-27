class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            String s = strs[i];
            int[] count = new int[26];
          for(int j= 0;j<s.length();j++){
            char word = s.charAt(j);
            count[word - 'a']++;
          
            }String ss = Arrays.toString(count);
            if(!hm.containsKey(ss)){
                hm.put(ss,new ArrayList<>());
            }hm.get(ss).add(s);

        }return new ArrayList<>(hm.values());
    }
}