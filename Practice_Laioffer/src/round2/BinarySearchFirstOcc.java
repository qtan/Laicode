//Given a target integer T and an integer array A sorted in ascending order, find the index of the first occurrence of T in A or return -1 if there is no such index.
//
//Assumptions
//
//There can be duplicate elements in the array.
//Examples
//
//A = {1, 2, 3}, T = 2, return 1
//A = {1, 2, 3}, T = 4, return -1
//A = {1, 2, 2, 2, 3}, T = 2, return 1
//Corner Cases
//
//What if A is null or A of zero length? We should return -1 in this case.
package round2;

public class BinarySearchFirstOcc {
	public int firstOccurrence(int[] array,int target){
		if (array==null || array.length==0) {
			return -1;
		}
		int left=0;
		int right = array.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(array[mid]>=target) {
				right=mid;
				//优先缩小右边界 这样不会让第一个漏出去
				//keep doing until the mid is either 
				//at right most or leftmost
			}else {
				left=mid;
			}
		}
		if (array[left]==target) {//先判断left 确保是第一个
			return left;
		}else if (array[right]==target){
			return right;
		}
		return -1;
	}
}
