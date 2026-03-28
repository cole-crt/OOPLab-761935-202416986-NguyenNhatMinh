import javax.swing.JOptionPane;
public class Equation{
    public static void main(String[] args){
        String strNum1, strNum2;
        double x;
        String result;
        
        strNum1 = JOptionPane.showInputDialog(null,
        "Please input the first number: ","Input the first number",
        JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
        "Please input the second number: ","Input the second number",
        JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);

        if(a!=0){
            x = -b/a;
            result = "Answer: " + x;
        } else {
            result = "No answer";
        }

        JOptionPane.showMessageDialog(null, result,
        "Show results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}