package java21days;

public class ArrayCopier {
  public static void main(String[] args) {
    int[] arr1 = { 3, 1, 45, 5, 1, 0, 81, 2 };
    float[] arr2 = new float[arr1.length];
    System.out.print("Array 1: [ ");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println("]");

    System.out.print("Array 2: [ ");
    int count = 0;
    int count2 = 0;
    // while (count < arr1.length && arr1[count] != 1) {
    //   arr2[count] = (float)arr1[count];
    //   System.out.print(arr2[count++] + " ");
    // }
    while (count < arr1.length) {
      if (arr1[count] == 1) {
        count++;
        continue;
      } 
      arr2[count2] = (float)arr1[count++];
      System.out.print(arr2[count2++] + " ");
    }
    System.out.println("]");
  }
}
