package lt.vu.mif.ood;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class SpanishLanguage extends BaseLanguage {
	
	public void printGreeting(String name) {
        System.out.println(formatGreetingMessage(name));
    }

    @Override
    public String formatGreetingMessage(String name) {
        return "Hola, " + name + "!";
    }

    @Override
    protected String getNameRequestMessage() {
        return "Escriba su nombre por favor: ";
    }
}