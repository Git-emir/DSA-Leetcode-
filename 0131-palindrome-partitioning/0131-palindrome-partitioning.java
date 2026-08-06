class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0,ans,path,s);
        return ans;
    }

    private void func(int idx, List<List<String>> ans,List<String> path,String s){
        if(idx == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i =idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                path.add(s.substring(idx,i+1));
                func(i+1,ans,path,s);
                path.remove(path.size() -1);
            }
        }
    }

    private boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
            
        }return true;
    }
}