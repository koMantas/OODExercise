package lt.vu.mif.ood;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 */
public class GreetingPrinter {

    private final File file = new File("greetings.txt");
	
	private ILanguage language;
	
	public GreetingPrinter (ILanguage language){
		this.language = language;
	}

    public void printHeader() {
        System.out.println("== Pasisveikinimai ==");
    }

    public void printHeaderToFile() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            PrintWriter writer = new PrintWriter(fileOutputStream);
            writer.append("== Pasisveikinimai ==");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public String readNameFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    public void printGreeting(String name) {
        language.printGreeting(name);
    }

    public void printGreetingToFile(String name) {
        language.printGreetingToFile(name, file);
    }

    public void printNameAskingMessage() {
        language.printNameAskingMessage();
    }
}
