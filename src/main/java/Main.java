import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        Scanner in = new Scanner (System.in);
        String path;
        System.out.println("Please provide the path for the file: ");
        path = in.next();
        try {
            read.readFile(path);
        } catch (NumberFormatException e) {
            System.out.println("Invalid value: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Cannot interact with the file: " + e.getMessage());
        }
    }

}
