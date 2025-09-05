
import java.util.Scanner;

public class name_and_age {

    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) throws Exception {
        
        String name;
        double age;
        String inputline;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

            if (name.trim().isEmpty()) {
                System.out.println(RED + "Enter a valid name!" + RESET);
                return;
            }

            System.out.print("Enter your age: ");
            inputline = scanner.nextLine();
            try {
                age = Double.parseDouble(inputline);
            } catch (NumberFormatException e) {
                System.err.println(RED + "Please Enter a valid age!" + RESET);
                // System.err.println(RED + "Error: " + e + RESET);
                return; 
            }


            if (age < 0) {
                System.out.println(RED + "Enter a valid age!" + RESET);
                return;
            }
            
        }

        try {
            System.out.println();

            name = name.toLowerCase();
            String[] name_words = name.split("\\s+");

            StringBuilder sb = new StringBuilder();

            for (String word : name_words) {
                if (word.length() > 0) {
                    sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");

                }
            }
            name = sb.toString().trim();
            
            if (age == (int) age) {
                System.out.println(GREEN + "Hi " + name.trim() + ", you are " + (int) age + " years old!" + RESET);
            }
            else {
                System.out.println(GREEN + "Hi " + name.trim() + ", you are " + age + " years old!" + RESET);
            }
            System.out.println();
        } catch (Exception e) {
            System.err.println(RED + "Error: " + e + RESET);
        }
       
    }
}
