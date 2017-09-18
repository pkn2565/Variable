import javax.swing.*;
import java.util.Scanner;

public class Variable {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a boolean value");//tells user to enter the appropriate variable
        boolean booleanVar = keyboard.nextBoolean();//allows keyboard to understand the next variable
        System.out.println("Enter a Character");//tells user to enter the appropriate variable
        char charVar = keyboard.next().charAt(0);//allows keyboard to understand the next variable
        System.out.println("Enter a double value");//tells user to enter the appropriate variable
        double doubleVar = keyboard.nextDouble();//allows keyboard to understand the next variable
        System.out.println("Enter a float value");//tells user to enter the appropriate variable
        float floatVar = keyboard.nextFloat();//allows keyboard to understand the next variable
        System.out.println("Enter a long Variable");//tells user to enter the appropriate variable
        long longVar = keyboard.nextLong();//allows keyboard to understand the next variable
        System.out.println("Enter an int value");//tells user to enter the appropriate variable
        int intVar = keyboard.nextInt();//allows keyboard to understand the next variable
        System.out.println("Enter a short value");//tells user to enter the appropriate variable
        short shortVar = keyboard.nextShort();//allows keyboard to understand the next variable
        System.out.println("Enter a byte value");//tells user to enter the appropriate variable
        byte byteVar = keyboard.nextByte();//allows keyboard to understand the next variable
        JOptionPane.showMessageDialog(null,"Your boolean value is " + booleanVar + "\n" +
        "Your Char value is " + charVar + "\n" + "Your double value is " + doubleVar + "\n" + "Your float value is " +
        floatVar + "\n" + "Your long value is " + longVar + "\n" + "Your int value is " + intVar + "\n" +
        "Your short value is " + shortVar + "\n" + "Your byte value is " + byteVar);//shows values in JOptions pane

    }
}