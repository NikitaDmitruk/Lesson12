package TaskWithStar;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        Matcher documentNumber = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b").matcher(text);
        Matcher telephoneNumber = Pattern.compile("\\+\\([0-9]{2}\\)[0-9]{7}\\b").matcher(text);
        Matcher email = Pattern.compile("\\b[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+\\b").matcher(text);
        while (documentNumber.find()) {
            System.out.println("document number: " + documentNumber.group());
        }
        while (email.find()) {
            System.out.println("email: " + email.group());
        }
        while (telephoneNumber.find()) {
            System.out.println("telephone number: " + telephoneNumber.group());
        }
    }
}
