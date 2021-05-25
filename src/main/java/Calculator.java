public class Calculator {



    public void
    calculatorTest(String calculator, double val1, double val2){
        double result;

        switch(calculator){
            case "*" : result = val1 * val2;
            System.out.println("multiplication " +val1+ " and " +val2+ " = "+ result);
            break;

            case "/" : result = val1 / val2;
            System.out.println("Division " +val1+ " and " +val2+ " = "+ result);
            break;

            case "+" : result = val1 + val2;
            System.out.println("Sum of two numbers " +val1+ " and " +val2+ " = "+ result);
            break;

            case "-" : result = val1 - val2;
            System.out.println("Subtraction " +val1+ " and " +val2+ " = "+ result);
            break;

            default:System.out.println("Wrong value entered");
        }


    }

}
