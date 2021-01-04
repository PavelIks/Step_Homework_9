package com.company;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.annotation.processing.SupportedSourceVersion;
import java.io.*;

/*Задание 1 Пользователь вводит с клавиатуры пути к двум текстовым файла.
Программа должна проверить совпадают ли их строки. Если нет, то вывести
несовпадающую строку из каждого файла.*/

/*class Main
{
    public static void main(String args[]) throws IOException
    {
        String fileName1 = "KUKU1.txt";
        String fileName2 = "KUKU2.txt";
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);
        if (file1.exists() || file2.exists())
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
            } catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        else
            {
                System.out.println("-");
        }
    }
}*/


/*Задание 2 Пользователь с клавиатуры вводит путь к файлу.
Программа должна найти длину самой длинной строки. После работы программы на
экран отображается полученное число и сама строка.*/

class Main
{
    public static void main(String args[]) throws IOException
    {
        String a = "KUKU1.txt";
        File file = new File(a);
        FileInputStream fileStream = new FileInputStream(file);
        byte[] byteArray = new byte[(int)file.length()];
        fileStream.read(byteArray);
        String str1 = new String(byteArray);
        String[] paragraphs = str1.toString().split("\n");

        String[] words1 = str1.split(" ");
        int length1 = 0;
        for (String word : words1)
        {
            if (length1 < word.length())
            {
                length1 = word.length();
            }
        }

        for (int i = 0; i < paragraphs.length-1; i++)
        {
            if (paragraphs[i].length() > paragraphs[i + 1].length())
            {
                String temp = paragraphs[i];
                paragraphs[i] = paragraphs[i + 1];
                paragraphs[i + 1] = temp;
            }
        }

        System.out.println("Всего символов в файле: " + str1.length());
        System.out.println("Количество символов у самого длинного абзаца: " + paragraphs[paragraphs.length-1].length());
        System.out.println("Количество абзацов: " + paragraphs.length);
        System.out.println("Строка самого длинного абзаца: " + paragraphs[paragraphs.length-1]);
    }
}