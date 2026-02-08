class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int k=1;
        for(int i=citations.length-1;i>=0;i--){
            if(citations[i]>=k){
                k++;
            }
            else{
                break;
            }
        }
        return k-1;
    }
}