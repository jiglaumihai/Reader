import java.io.*;

public class ReadFile extends Main {


    public void readFile (String filename) throws IOException{
        BufferedReader reader = null;
        int total = 0;

        try { // exceptions will call up the call stack
            reader = new BufferedReader(new FileReader(filename));
            String line = null;
            while ((line = reader.readLine())!= null){
                String[] parts = line.split(" ");
                total += Integer.valueOf(parts[1]);
                System.out.println("Value: " + Integer.valueOf(parts[1]) + " was added to the total");
            }
            System.out.println("The total is: " + total);
        }
        finally {
            try {
                if (reader.readLine() != null)
                    reader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

