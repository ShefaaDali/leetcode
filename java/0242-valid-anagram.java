class Solution {
    //time complexity of O(n)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
          
        
        //Solution 2 |time complexity of O(n log n)
        /* if(s.length()!=t.length()) return false;
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        for(int i=0;i<tArray.length;i++)
        if(sArray[i]!=tArray[i])
        return false;
        return true;*/
        
        //Solution 3 |time complexity of O(n log n)
        /*
         if(s.length()!=t.length()) return false;
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        s = new String(sArray);
        t = new String(tArray);
        if(s.equals(t))return true;
        return false;/*
        
        
       //Solution 4 |time complexity of O(n)
        /*public boolean isAnagram(String s, String t) {
	Map<Integer, Integer> freqs = new HashMap<>();
	s.chars().forEach(ch -> freqs.put(ch, freqs.getOrDefault(ch, 0) + 1));
	t.chars().forEach(ch -> freqs.put(ch, freqs.getOrDefault(ch, 0) - 1));
	return freqs.values().stream().allMatch(x -> x == 0);*/
}	
    }
}
