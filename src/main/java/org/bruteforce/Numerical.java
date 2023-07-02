package org.bruteforce;

import java.io.*;

public class Numerical {
    private final static String filePath = "C:\\Users\\astan\\Documents\\TestForIt.txt"; //The file path is here

    public static void FileWriter(Integer currentNumber, Integer lastNumber) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        int sizeOfLastNumber = lastNumber.toString().length(); // Size of the variable lastNumber

        for(int i = currentNumber; i <= lastNumber; i++){
            int sizeOfCurrentNumber = currentNumber.toString().length();  //Size of the variable currentNumber
            if(sizeOfCurrentNumber < sizeOfLastNumber) {
                StringBuilder addZero = new StringBuilder();
                while (sizeOfCurrentNumber < sizeOfLastNumber) {
                    addZero.append("0");   // add zeros in front of the numbers like: 001, 002, 045, 121
                    sizeOfCurrentNumber += 1;
                }
                writer.write((addZero.toString() + currentNumber) + "\n");
            } else {
                writer.write((currentNumber) + "\n");
            }
            currentNumber += 1;
        }
        writer.write("///////This is The End!!!///////");
        writer.close();
    }

    public static void FileReader()  {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while((currentLine = reader.readLine()) != null){
                System.out.println(currentLine);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getFileSize() {
        File file = new File(filePath);
        String onBytes = file.length() + "bytes";
        String onKB = (double) (file.length() / 1024) + "KB";
        String onMB = (double) (file.length() / (1024 * 1024))+ "MB";

        return "This are file size: " + onBytes + "\t//" + onKB + "\t//" + onMB;
    }

}



