package org.bruteforce;

import java.io.*;

public class NumberGenerator {
    private final static String filePath = "C:\\Users\\astan\\Documents\\TestForIt.txt";
    private static final File file = new File(filePath);

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
            readAndPrintFile();
        } catch (IOException e) {
            logError(e);
        }
    }
    private static void readAndPrintFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String currentLine;
        while((currentLine = reader.readLine()) != null){
            System.out.println(currentLine);
        }
        reader.close();
    }

    public static String getFileSize() {
        return "This are file size: " + calculateFileSizeInBytes() + "\t//"
                + calculateFileSizeInKiloBytes() + "\t//"
                + calculateFileSizeInMegaBytes();
    }
    public static String calculateFileSizeInBytes() {
        return file.length() + "bytes";
    }
    public static String calculateFileSizeInKiloBytes() {
        return (double) (file.length() / 1024) + "KB";
    }
    public static String calculateFileSizeInMegaBytes() {
        return (double) (file.length() / (1024 * 1024))+ "MB";
    }


    public static Exception logError(Exception e) {  //TODO - A bad example must be corrected.
        return e;
    }



}



