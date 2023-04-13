class Example1 {
  public void descOrder(int arr[]) {
         int temp=0;
         for(int i=0;i<arr.length;i++) {
             for(int j=i+1;j<arr.length;j++) {
                if(arr[i]<arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                  }
              }
           }
         for(int i=0;i<arr.length;i++) {
             System.out.print(arr[i]+" ");
           }
       }
  public void ascOrder(int arr[]) {
         int temp=0;
         for(int i=0;i<arr.length;i++) {
             for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                  }
              }
           }
         for(int i=0;i<arr.length;i++) {
             System.out.print(arr[i]+" ");
           }
       }
  public static void main(String[] args) {
      Example1 obj=new Example1();
      int arr[]= {23,45,11,22,89};
      obj.ascOrder(arr);
    }
}