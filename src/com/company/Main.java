package com.company;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        String fileName1=  "KUKU1.txt";
        String fileName2=  "KUKU2.txt";
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);
        if(file1.exists() || file2.exists())
        {
            System.out.println("+");
        }
        else
        {
            System.out.println("-");
        }

    }
}