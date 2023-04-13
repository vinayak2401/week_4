import java.util.Scanner;

class Sum {
  public void sum() {
    Scanner s = new Scanner(System.in);
    int arr[] = { 23, 35, 89, 10, 70, 45 };
    System.out.println("Enter the value:");
    int input = s.nextInt();
    boolean found = false;

    System.out.print("Given Array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {

        if (arr[i] + arr[j] == input) {
          System.out.println("\nindex values are:" + i + "," + j);
          found = true;
        }

      }
    }
    if (found == false) {
      System.out.println("\nNo value matches the given input in the array");
      System.out.println("Try again!!");
      sum();
    }
  }

  public static void main(String args[]) {

    Sum obj = new Sum();
    obj.sum();
  }
}