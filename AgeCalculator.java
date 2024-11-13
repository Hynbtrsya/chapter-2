package agecalc;

import javax.swing.JOptionPane;
import java.time.Year;

public class AgeCalculator {
    public static void main(String[] args) {
        String birthYearStr;
        int birthYear, currentYear, age;
        
        currentYear = Year.now().getValue();
        
        birthYearStr = JOptionPane.showInputDialog("Enter your birth year");
        
        birthYear = Integer.parseInt(birthYearStr);
        
        age = currentYear - birthYear;

        JOptionPane.showMessageDialog(null, "Your age is " + age, "Age Calculator", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
