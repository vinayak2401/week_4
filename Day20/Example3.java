import java.util.Scanner;
class Perfect{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={23,78,45,90,444,55,66};
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
  }
}