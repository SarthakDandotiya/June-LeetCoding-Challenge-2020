// Question:
// H-Index II
// .*

class Solution {
    public int hIndex(int[] citations) {
        // Alternate solution (slower)
        // for(int i = 0; i < citations.length; i++){
        // if(citations[i] >= citations.length-i)
        // return citations.length-i;
        // }
        // return 0;

        int l = 0;
        int r = citations.length - 1;
        while (l <= r) {
            int m = (r - l) / 2 + l;
            int h = citations.length - m;
            if (citations[m] > h) {
                r = m - 1;
            } else if (citations[m] < h) {
                l = m + 1;
            } else {
                return h;
            }
        }
        return citations.length - l;

        // if (citations == null || citations.length == 0)
        // return 0;

        // int left = 0;
        // int right = citations.length - 1;
        // while (left <= right) {
        // int middle = (right - left) / 2 + left;
        // int h = citations.length - middle;
        // if (citations[middle] > h)
        // right = middle - 1;
        // else if (citations[middle] < h)
        // left = middle + 1;
        // else
        // return h;
        // }
        // return citations.length - 1;
    }
}