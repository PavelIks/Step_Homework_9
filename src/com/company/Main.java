package com.company;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        String fileName1 = "KUKU1.txt";
        String fileName2 = "KUKU2.txt";
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);
        if(file1.exists() || file2.exists())
        {
            try
                    (
                            FileInputStream fo1 = new FileInputStream(fileName1);
                            FileInputStream fo2 = new FileInputStream(fileName2);
                    )
            {
                System.out.println("+");

                byte[] buffer1 = new byte[fo1.available()];
                fo1.read(buffer1);
                String data1 = new String(buffer1);
                System.out.println(data1);

                byte[] buffer2 = new byte[fo2.available()];
                fo2.read(buffer2);
                String data2 = new String(buffer2);
                System.out.println(data2);

                if (data1.indexOf(data2) != -1)
                {
                    System.out.println("+");
                }
                else
                {
                    System.out.println("-");
                }
            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        else
        {
            System.out.println("-");
        }
    }
}