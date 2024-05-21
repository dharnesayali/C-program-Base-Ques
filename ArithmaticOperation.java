 class Operation{
  public static void main(String[] args) {
    int a = 10;
    int b = 5;
    int output;

    output = a + b;  
    System.out.println("The sum is: " + output);

    output = a - b;  
    System.out.println("The difference is: " + output);

    output = a * b;  
    System.out.println("The product is: " + output);
    
    if( b != 0) {
      output = a / b;  
      System.out.println("The quotient is: " + output);
    } else {
      System.out.println("Math error: Division by zero");
    }
  }
}
