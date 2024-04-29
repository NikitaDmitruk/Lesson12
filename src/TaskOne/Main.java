package TaskOne;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой текст с аббревиатурами:");
        Matcher abbreviation = Pattern.compile("\\b[А-ЯA-Z]{2,6}\\b").matcher(scanner.nextLine());
        while (abbreviation.find()) {
            System.out.println(abbreviation.group());
        }
    }
}
