import javax.swing.JOptionPane;
public class Calculation{
    public static void main(String[] args){
        String strNum1, strNum2;
        double sum, difference, product, quotient;
        String result;
        
        strNum1 = JOptionPane.showInputDialog(null,
        "Please input the first number: ","Input the first number",
        JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
        "Please input the second number: ","Input the second number",
        JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        if(num2!=0){
            quotient = num1/num2;
            result = "Sum: " + sum +
                     "\nDifference: " + difference +
                     "\nProduct: " + product +
                     "\nQuotient: " + quotient;
        } else {
            result = "Sum: " + sum +
                     "\nDifference: " + difference +
                     "\nProduct: " + product +
                     "\nQuotient: Cannot divide by zero!";
        }

        JOptionPane.showMessageDialog(null, result,
        "Show results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}