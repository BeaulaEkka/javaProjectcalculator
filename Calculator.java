public class Calculator{

  public Calculator(){

  }
//add
public int add(int a, int b){
  return a+b;
}
//subtract
public int subtract(int a, int b){
  return a-b;
}
//multiply
public int multiply(int a, int b){
  return a*b;
}
//divide
public int divide(int a, int b){
  return a/b;
}
public int modulo(int a, int b){
  return a%b;
}

public static void main(String[] args){
  Calculator myCalculator = new Calculator();
  int added=myCalculator.add(7,5);
  System.out.print("add numbers "+added + "\n");

  int subtract=myCalculator.subtract(45,11);
  System.out.print("subtract numbers "+subtract+ "\n");
}

}
