import java.util.Arrays;

public class ProblemTwo {
  // 2.	You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list.
  // The list should be made by splicing together the nodes of the first two lists.
  // Implement the iterative and/or recursive solution.

  public static void main(String[] args) {
    ProblemTwo problem = new ProblemTwo();
    int[] result = problem.mergeLists(new int[]{0, 2, 4, 5, 6}, new int[]{1, 3, 9, 11, 15});
    System.out.println(Arrays.toString(result));
  }

  public int[] mergeLists(int[] list1, int[] list2){
    int[] result = new int[list1.length + list2.length];
    int index1 = 0;
    int index2 = 0;
    int resultIndex = 0;
    while( index1 < list1.length && index2 < list2.length) {
      if(list1[index1] < list2[index2]){
        result[resultIndex] = list1[index1];
        index1++;
      } else {
        result[resultIndex] = list2[index2];
        index2++;
      }
      resultIndex++;
    }

    if(index1 == (list1.length - 1)) {
      result = appendRemaining(result, resultIndex, list2, index2);
    } else {
      result = appendRemaining(result, resultIndex, list2, index2);
    }

    return result;
  }

  private int[] appendRemaining(int[] combined, int combinedIndex, int[] remaining, int remainingIndex) {
    while (remainingIndex < remaining.length) {
      combined[combinedIndex] = remaining[remainingIndex];
      combinedIndex++;
      remainingIndex++;
    }
    return combined;
  }

}
