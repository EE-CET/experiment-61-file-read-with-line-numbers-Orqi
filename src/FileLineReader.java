import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {
    public static void main(String[] args) throws Exception{
        String fileName = "input.txt";
        
        int count=1;
        try(BufferedReader br =new BufferedReader(new FileReader("input.txt"))){
                String line;
                while((line=br.readLine())!=null){
                        System.out.println(count+ ": "+line);
                        count++;
                }

        
        
    }
}}
