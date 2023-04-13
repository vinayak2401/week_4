import java.util.Scanner;

class Append {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int arr[] = { 23, 45, 22, 11, 7 };
    System.out.println("Enter number to append");
    int num = s.nextInt();
    System.out.print("Given array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    for (int i = 0; i < num; i++) {
      int temp = arr[arr.length - 1];
      for (int j = arr.length - 1; j > 0; j--) {
        arr[j] = arr[j - 1];
      }
      arr[0] = temp;
    }
    System.out.print("\nAppended array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    s.close();
  }
}
