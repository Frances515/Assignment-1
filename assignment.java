public class assignment{
   
  public static void main(String [] args){
     if(args[1].equals("+")){
      double num1 = Double.parseDouble(args[0]);
      double num2 = Double.parseDouble(args[2]);
      System.out.println(num1 + num2);

      }
     if(args[1].equals("*")){
      double num1 = Double.parseDouble(args[0]);
      double num2 = Double.parseDouble(args[2]);
      System.out.println(num1 * num2);
      }
  }
}