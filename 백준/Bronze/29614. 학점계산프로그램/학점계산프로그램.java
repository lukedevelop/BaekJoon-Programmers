import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 

        double sum = 0.0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char grade = str.charAt(i);
            double gradeValue = 0.0;

            if (i < str.length() - 1 && str.charAt(i + 1) == '+') {
                switch (grade) {
                    case 'A':
                        gradeValue = 4.5;
                        break;
                    case 'B':
                        gradeValue = 3.5;
                        break;
                    case 'C':
                        gradeValue = 2.5;
                        break;
                    case 'D':
                        gradeValue = 1.5;
                        break;
                }
                i++; 
            } else {
                switch (grade) {
                    case 'A':
                        gradeValue = 4.0;
                        break;
                    case 'B':
                        gradeValue = 3.0;
                        break;
                    case 'C':
                        gradeValue = 2.0;
                        break;
                    case 'D':
                        gradeValue = 1.0;
                        break;
                    case 'F':
                        gradeValue = 0.0;
                        break;
                }
            }

            sum += gradeValue;
            count++;
        }

        double average = sum / count;
        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.println(df.format(average));
    }
}