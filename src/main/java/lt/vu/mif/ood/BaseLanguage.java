package lt.vu.mif.ood;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Created by Mantas on 2016-10-04.
 */
public abstract class BaseLanguage implements ILanguage {

    public void printGreeting(String name) {
        System.out.println(formatGreetingMessage(name));
    }


    public void printGreetingToFile(String name, File file) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            PrintWriter writer = new PrintWriter(fileOutputStream);
            writer.append(formatGreetingMessage(name));
            writer.flush();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public void printNameAskingMessage() {
        System.out.println(getNameRequestMessage());
    }

    protected abstract String formatGreetingMessage(String name);

    protected abstract String getNameRequestMessage();
}
