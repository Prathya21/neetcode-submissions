class Solution {
    public boolean isAnagram(String s, String t) {
        int sn=s.length();
        int tn=t.length();
        if(sn!=tn){
            return false;
        }
        char[] ss=s.toCharArray();
        char[] ts=t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(ts);
        return Arrays.equals(ss,ts);
    }
}
