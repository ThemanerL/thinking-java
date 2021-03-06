package algorithms.leecode.primary.array;

import java.util.Arrays;

/**
 * <h1>存在重复</h1>
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 *
 * @author 李重辰
 * @date 2019/8/16 20:52
 */
public class ContainsDuplicate {
  public static void main(String[] args) {
    int[] ints = {1, 2, 3, 1};
    boolean solution = new ContainsDuplicate().solution(ints);
    System.out.println(solution);
  }

  private boolean solution(int[] nums) {
    return nums.length != Arrays.stream(nums).distinct().count();
  }
}
