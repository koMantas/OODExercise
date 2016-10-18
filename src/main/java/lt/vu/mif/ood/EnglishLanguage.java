package lt.vu.mif.ood;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class EnglishLanguage extends BaseLanguage {

    @Override
    public String formatGreetingMessage(String name) {
        return "Hello, " + name + "!";
    }

    @Override
	public String getNameRequestMessage() {
        return"Please enter your name: ";
    }
}