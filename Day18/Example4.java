class Example1 {
  int n=100;
  static int num=200;
  public static void main(String[] args) {
      Example1 obj=new Example1();
      Example1 obj2=new Example1();
      System.out.println(obj.n);
      System.out.println(obj.num);
      obj.n=150;
      obj.num=250;
      System.out.println(obj.n);
      System.out.println(obj.num);
      System.out.println(obj2.n);
      System.out.println(obj2.num);
    }
}