import javax.swing.*;
import java.io.*;

public class File {
    public void readFile(JTextArea readArea, String fileName){//read a file
        try{
            BufferedReader inStream = new BufferedReader(new FileReader(fileName));
            String line = inStream.readLine();
            Integer count = 0;
            while (line !=null && count < 5){
                readArea.append(line+"\n");
                line = inStream.readLine();
                count += 1;
            }
            inStream.close();
        } catch (FileNotFoundException e) {
            readArea.setText("IOERROR: "+ fileName +"NOT found\n");
            e. printStackTrace ();
        } catch (IOException e) {
            readArea.setText("IOERROR: "+ e.getMessage() +"\n");
            e. printStackTrace ();
        }
    }
    public void writeFile(String fileName, JTextArea writeArea, String filename){
        try{

             FileWriter outStream = new FileWriter(filename);
             BufferedReader inStream = new BufferedReader(new FileReader(fileName));
             String line = inStream.readLine();
             Integer countLine = 0;

            while(line!=null  && countLine < 5){
                Integer countComma = 0;
                for(int i = 0; i < line.length(); i++){
                     char c = line.charAt(i);
                     if (c == ',') {countComma += 1;}
                     if(countComma == 3){break;}
                     outStream.write(c);
                     writeArea.append(String.valueOf(c));
                 }
                line = inStream.readLine();
                writeArea.append("\n");
                countLine += 1;

            }
            outStream.close( );

        } catch (FileNotFoundException ex) {
            writeArea.setText("IOERROR: "+ fileName +"NOT found\n");
        }
        catch (IOException e) {
            writeArea.setText("IOERROR: "+ e.getMessage() +"\n");
            e. printStackTrace ();        }
        }


    }
