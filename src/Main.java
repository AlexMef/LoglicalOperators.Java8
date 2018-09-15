import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

//        String month = in.next();
        String [] arrayNames = new String[]{"Fred", "George", "Anna", "Peter"};
        int [] arrayOfIntegers = new int[10000];
        int someInteger;
        do {
            try {
                someInteger = in.nextInt();
                break;
            } catch (InputMismatchException ex){
                ex.printStackTrace();
            }
        } while (true);

        for (int i = 0; i < arrayOfIntegers.length; i++){
            arrayOfIntegers[i] = random.nextInt(100);
        }

        for (int i = 0; i < arrayOfIntegers.length; i++){
            if (arrayOfIntegers[i] == someInteger){
                System.out.println("Index of " + i + " " + someInteger);
            }

        }

//        for (int i = 0; i < arrayNames.length; i++){
//            System.out.println(arrayNames[i]);
//        }



//        switch (month){
//            default:
//                System.out.println("Unknown month");
//                break;
//            case "january" : case "february" : case "december":
//                System.out.println("Winter");
//                break;
//            case "march": case "april": case "may" :
//                System.out.println("Spring");
//                break;
//            case "june": case "july": case "august":
//                System.out.println("Summer");
//                break;
//            case "semptember": case "october": case "november":
//                System.out.println("Autumn");
//                break;
//
//        }
    }
}
