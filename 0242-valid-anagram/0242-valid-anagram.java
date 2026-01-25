class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> HM = new HashMap<>();
        for(int i = 0;i<s.length();i++){
             char letter = s.charAt(i);
             if(HM.containsKey(letter)){
                HM.put(letter,HM.get(letter) +1);
             }else{
                HM.put(letter,1);
             }
        }
        for(int i =0;i<t.length();i++){
            char word = t.charAt(i);
            if(!HM.containsKey(word)){
                return false;
            }
            if(HM.containsKey(word)){
                HM.put(word,HM.get(word) -1);
            }if(HM.get(word)<0){
                return false;
            }
        }return true;

    

    }
}