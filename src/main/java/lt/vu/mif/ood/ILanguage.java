package lt.vu.mif.ood;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public interface ILanguage {
	
	void printGreeting(String name);

	void printGreetingToFile(String name, File file);
	
	void printNameAskingMessage();
}