class Sort {
  public static void main(String args[]) {
    int arr[] = { 12, 89, 34, -3, -2, 43, 89, -97 };
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] < arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] >= 0) {
        for (int j = i - 1; j >= 0; j--) {
          if (arr[j] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
