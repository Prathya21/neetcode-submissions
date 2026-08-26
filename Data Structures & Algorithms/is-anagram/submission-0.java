class Solution {
    public boolean isAnagram(String s, String t) {
        int sn=s.length();
        int tn=t.length();
        if(sn!=tn){
            return false;
        }
        char[] sSort=s.toCharArray();
        char[] tSort=t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort,tSort);
    }
}
