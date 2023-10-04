public class HelloWorld {
  public HelloWorld() {
  }
  public static void main(String[] var0)
  {
    int [] arr = new int [] {1, 2, 3, 4, 5,6,7,8,9,100};
    int sum = 0;
    for (int i = 0; i < arr.length; i++)
    {
      sum = sum + arr[i];
    }
    System.out.println("Sum of all the elements of an array: " + sum);
    System.out.println("Hello World!");
  }
}