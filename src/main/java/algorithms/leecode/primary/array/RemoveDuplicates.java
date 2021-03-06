package algorithms.leecode.primary.array;

/**
 * <h1>从排序数组中删除重复项</h1>
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 示例 1:
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * [0,1,1,1,2,2,3,3,4,4],
 * [0,1,1,2,2,3,3,4,4,4],
 * [0,1,2,2,3,3,4,4,4,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 *
 * @author 李重辰
 * @date 2019/5/2 19:52
 */

public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    RemoveDuplicates rd = new RemoveDuplicates();
    int i = rd.removeDuplicates(nums);
    for (int k : nums) {
      System.out.print(k + ", ");
    }
    System.out.println("\n处理后");
    for (int j = 0; j < i; j++) {
      System.out.print(nums[j] + ", ");
    }
  }

  private int removeDuplicates(int[] nums) {
    int length = nums.length;
    for (int i = 1; i < length; i++) {
      if (nums[i] == nums[i - 1]) {
        System.arraycopy(nums, i, nums, i - 1, length - i);
        i--;
        length--;
      }
    }
    return length;
  }

  /**
   * 神代码
   *
   * @param nums /
   * @return /
   */
  public int removeDuplicates1ms(int[] nums) {
    if (nums.length == 1) {
      return 1;
    }
    int size = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[size]) {
        nums[++size] = nums[i];
      }
    }
    return size + 1;
  }

}

