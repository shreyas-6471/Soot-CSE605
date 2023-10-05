public class HelloWorld {
  public HelloWorld() {
  }
  public static int getSum(int arr[])
  {
    int sum=0;
    for (int i = 0; i < arr.length; i++)
    {
      if(arr[i]>=5)
      {
        sum = sum + arr[i];
      }
      else {
        sum += 1;
      }
    }
    return sum;

  }
  public static void main(String[] var0)
  {
    int [] arr = new int [] {1, 2, 3, 4, 5,6,7,8,9,100};
    int sum = getSum(arr);
    System.out.println("Sum of all the elements of an array: " + sum);
    System.out.println("Hello World!");
  }
}