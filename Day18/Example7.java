class Example1 {
  int a=100;
  static int b=34;
  public void m1() {
        System.out.println(a);
        System.out.println(b);
      }
  public static void main(String[] args) {
      Example1 obj=new Example1();
      obj.m1();
    }
}