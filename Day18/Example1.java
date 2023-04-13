import java.util.Scanner;

class Append {
  public void append() {
    Scanner s = new Scanner(System.in);
    int arr[] = { 23, 45, 22, 89, 4 };
    System.out.println("Enter number to append those elements");
    int input = s.nextInt();
    System.out.print("Given array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    for (int i = 0; i < input; i++) {
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
  }

  public static void main(String[] args) {
    Append obj = new Append();
    obj.append();
  }
}