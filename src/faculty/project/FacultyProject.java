package faculty.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFrame; 

public class FacultyProject {

  
    public static void main(String[] args) {
        try {

            File output = new File("sumAreas.txt");
            File input = new File("inputFile.txt");
            Scanner into = new Scanner(input);
           
            if (!into.hasNextInt()) {
                System.out.println("File is empty");
                into.close();
                return;
            }

            int x = into.nextInt();
            if (x < 2) {
                System.out.println("Enter number more than or equals two");
                into.close();
                return;
            }

            Shape arr[] = new Shape[x]; 
            for (int i = 0; i < x; i++) {
                if (!into.hasNext()) break; 
                
                String str = into.next();
                if (!into.hasNextDouble()) break; 
                double num = into.nextDouble();
                
                if (str.equalsIgnoreCase("circle")) {
                    arr[i] = new Circle(num);
                } else if (str.equalsIgnoreCase("cube")) {
                    arr[i] = new Cube(num);
                } else {
                    System.out.println("Unkown Shape " + str);
                }
            }
            into.close();

            PrintWriter W = new PrintWriter(output);
            for (int i = 0; i < x; i++) {
                if (arr[i] != null) { 
                    W.println(arr[i].getArea());
                }
            }
            W.close();
            
            
            for (int i = 0; i < x; i++) {
                if (arr[i] != null) {
                    creatFram("Shape " + (i + 1), arr[i]);
                }
            }
            
        } catch (FileNotFoundException y) {
            System.out.println("Error: File not found! " + y.getMessage());
        }
    }

    
   
    public static void creatFram(String title, Shape shape) {
        JFrame frame = new JFrame(title);
        GUI panel = new GUI(shape);
        
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    } 

}