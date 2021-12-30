package suanfa;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 17:16 2021/2/25
 * @Modifued By:
 */
public class Solution {
    public void sortIntegers2(int[] A) {
       InsertSort(A);
    }

    public void InsertSort(int[] A) {
       int i,j,k;
       for(i=1;i<A.length;i++) {
          for(j=i-1;j>=0;j--) {
            if(A[j] <= A[i])
            //寻找第一个小于 A[i]的位置,也就是[i] 该插入的地方
             break;
            }
            if(j != i-1){
                //这个判断的意思是如果是刚好
                // A[i-1]这个地方小 于 A[i],那么不需要操作
                int temp = A[i];
                for(k=i-1;k>j;k--)
                A[k+1] = A[k]; A[k+1] = temp;//循环结束 k=j,故需要 k+1 放在该放的位置 上
            }
    }
    }
}