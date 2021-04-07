package opencart.ZParser;

import opencart.ZParser.Model.ClassProperties;
import opencart.ZParser.ReadFile.ReadFile;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class Parser {
    public static void main(String args[]) throws IOException {
        Scanner inp = new Scanner(System.in);

        ReadFile readfile = new ReadFile();

        //String filePath = new String(inp.nextLine());
        String filePath = "C:\\Users\\datvu\\OneDrive\\Documents\\OpenCart";

        Set<ClassProperties> allClass = readfile.getAllFile(filePath).getClassPropertiesSet();

        for (ClassProperties pack : allClass) System.out.println(pack.getName());
    }
}
