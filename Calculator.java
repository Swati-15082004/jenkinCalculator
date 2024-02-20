class Calculator {
   
    float addition(float operand_1, float operand_2){
        return(operand_1 + operand_2);
    }

    float substraction(float operand_1, float operand_2){
        return(operand_1 - operand_2);
    }
    
    float multiplication(float operand_1, float operand_2){
        return(operand_1 * operand_2);
    }
    
    float division(float operand_1, float operand_2){
        return(operand_1 / operand_2);
    }
   // float Square(float operand_1, float operand_2)
        //return(operand_1 / operand_2);S
   // }
   // float cube(float operand_1, float operand_2){
        //return(operand_1 / operand_2);
   // }

 public static void main(String[] args)
 {
  float operand_1 =10;
  float operand_2=5;

  Calculator calc = new Calculator();

  float add_result = calc.addition(operand_1, operand_2);
  System.out.println("Result of Addition is:"+ add_result);

  float sub_result = calc.substraction(operand_1, operand_2);
  System.out.println("Result of Substraction is:"+ sub_result);

  float mul_result = calc.multiplication(operand_1, operand_2);
  System.out.println("Result multiplication is:"+ mul_result);

  float div_result = calc.division(operand_1, operand_2);
  System.out.println("Result of division is:"+ div_result);

  Extended_Calci calci = new Extended_Calci();

  float Sqr_result = calci.Square(operand_1);
  System.out.println("Result of square is:"+ Sqr_result);

  float cube_result = calci.cube(operand_1);
  System.out.println("Result of cube is:"+ cube_result);

  
  

 }
}