class Solution {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder.length == 0) return true;
        return judge(postorder, 0, postorder.length-1);
    }

    public boolean judge(int[] arr, int leftIndex, int rightIndex) {
        if(rightIndex < leftIndex) return true;

        int rootVal = arr[rightIndex];
        int pos;
        for(pos = leftIndex; pos < rightIndex; pos++) {
            if(arr[pos] > rootVal) break;
        }

        for(int i = pos; i < rightIndex; i++) {
            if(arr[i] < rootVal) return false;
        }

        return judge(arr, leftIndex, pos-1) && judge(arr, pos, rightIndex-1);
    }
}