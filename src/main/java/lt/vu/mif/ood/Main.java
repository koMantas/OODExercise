package lt.vu.mif.ood;

import java.util.Scanner;

/**
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your language [1] - english, [2] - spanish, [3] lithuanian: ");

        String languageLine = scanner.nextLine();

        int choice = Integer.parseInt(languageLine);

        ILanguage selectedLanguage = null;

        switch(choice) {
            case 1:
                selectedLanguage = new EnglishLanguage();
                break;
            case 2:
                selectedLanguage = new SpanishLanguage();
                break;
            case 3:
                selectedLanguage = new LithuanianLanguage();
                break;
        }

        GreetingPrinter greetingPrinter = new GreetingPrinter(selectedLanguage);

        greetingPrinter.printNameAskingMessage();

        String name = greetingPrinter.readNameFromConsole();

        greetingPrinter.printGreeting(name);
        greetingPrinter.printGreetingToFile(name);

        System.out.println("Done.");

    }

}
