public class MyCalculator_Test {      //unit-tester, testar komponenter
  private static MyCalculator calc = new MyCalculator();

  public static final String ANSI_RED    = "\u001B[31m";
  public static final String ANSI_GREEN  = "\u001B[32m";
  public static final String ANSI_RESET  = "\u001B[0m";

  private static boolean test_StartValueOfFirstNumber(){
    double temp = calc.getFirstNumber();
    if(0 == temp){
      return true;
    }
    return false;
  }
  private static boolean test_StartValueOfSecondNumber(){
    double temp = calc.getSecondNumber();
    if(0 == temp){
      return true;
    }
    return false;
  }
  private static boolean test_StartValueOfAnswer(){
    double temp = calc.getAnswer();
    if(0 == temp){
      return true;
    }
    return false;
  }
  private static boolean test_StartValueOfOperator(){
    String temp = calc.getOperator();
    if("-1" == temp){
      return true;
    }
    return false;
  }
  private static boolean test_AddMethod(){
    double temp1 = 1.3, temp2 = 3.2, correctAnswer = temp1+temp2;
    double calculatedAnswer = calc.callAdd(temp1, temp2);
    if(correctAnswer == calculatedAnswer){
      return true;
    }
    return false;
  }
  private static boolean test_SubMethod(){
    double temp1 = 1.3, temp2 = 3.2, correctAnswer = temp1-temp2;
    double calculatedAnswer = calc.callSub(temp1, temp2);
    if(correctAnswer == calculatedAnswer){
      return true;
    }
    return false;
  }
  private static boolean test_MultMethod(){
    double temp1 = 1.3, temp2 = 3.2, correctAnswer = temp1*temp2;
    double calculatedAnswer = calc.callMult(temp1, temp2);
    if(correctAnswer == calculatedAnswer){
      return true;
    }
    return false;
  }
  private static boolean test_DivMethod(){
    double temp1 = 1.3, temp2 = 3.2, correctAnswer = temp1/temp2;
    double calculatedAnswer = calc.callDiv(temp1, temp2);
    if(correctAnswer == calculatedAnswer){
      return true;
    }
    return false;
  }

  public static void main(String[] args){
    int totalAmountOfErrors = 0;   //not necessary but useful
    if(test_StartValueOfFirstNumber()){
      System.out.println("SV FirstNumber: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("SV FirstNumber: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErrors++;       //not necessary but useful
    }
    if(test_StartValueOfSecondNumber()){
      System.out.println("SV SecondNumber: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("SV SecondNumber: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErrors++;
    }
    if(test_StartValueOfAnswer()){
      System.out.println("SV Answer: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("SV Answer: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErrors++;
    }
    if(test_StartValueOfOperator()){
      System.out.println("SV Operator: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("SV Operator: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErrors++;
    }
    if(test_AddMethod()){
      System.out.println("Add method: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("Add method: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErrors++;
    }
    if(test_SubMethod()){
      System.out.println("Sub method: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("Sub method: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErrors++;
    }
    if(test_MultMethod()){
      System.out.println("Mult method: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("Mult method: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErrors++;
    }
    if(test_DivMethod()){
      System.out.println("Div method: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("Div method: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErrors++;
    }
  }
}
