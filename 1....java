package com.company;


import javax.annotation.processing.SupportedSourceVersion;
import java.io.*;


public class Main {
    public static void main(String[] args) {
//        String fileName=  "text.txt";
//        проверка того что файл есть по пути
//        File file = new File(fileName);
//        if(file.exists())
//            System.out.println("+");
//        else
//            System.out.println("-");
//        //могу ли я читать
//        if(file.canRead())
//            System.out.println("+");
//        else
//            System.out.println("-");
//        //могу ли я писать
//        if(file.canWrite())
//            System.out.println("+");
//        else
//            System.out.println("-");
//        System.out.println(file.getParent());
//        System.out.println(file.getName());
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getFreeSpace());
//        System.out.println(file.getUsableSpace());
//        System.out.println(file.getTotalSpace());
//          file.delete();

//          write to file
//        String data = "I love Java";
//        try(FileOutputStream fo = new FileOutputStream(fileName)){
//            byte[] buffer = data.getBytes();
//
//            fo.write(buffer);
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Успех!");

        //      read from file
//        try(FileInputStream fo = new FileInputStream(fileName)){
////            byte[] buffer = new byte[fo.available()];
////            fo.read(buffer);
////            выведит БАЙТЫ !
////            System.out.println(buffer);
//
////            читать полностью
////            byte[] buffer = new byte[fo.available()];
////            fo.read(buffer);
////            String data = new String(buffer);
////            System.out.println(data);
//
//
////            по байтово
////            int i = -1;
////            while ((i=fo.read())!= -1){
////                System.out.print((char)i);
////            }
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("\nУспех!");

//        try(FileReader reader = new FileReader(fileName)){
//            char [] arr = new char[256];
//            reader.read(arr);
//            for (int i =0; i< 256; i++){
//                System.out.print(arr[i]);
//            }
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }

        //      перезапись
//        try(FileWriter writer = new FileWriter(fileName, false)){
//            writer.write("Hello from c#!");
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
        //      дозапись
//        try(FileWriter writer = new FileWriter(fileName, true)){
//            writer.write("Hello from JAVA!");
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }


        File dir = new File(".");
//        System.out.println(dir.getParent());
//        System.out.println(dir.getName());
//        System.out.println(dir.getPath());
        System.out.println(dir.getAbsolutePath());
        //      листинг по файлам
//        for(File i : dir.listFiles()){
//            System.out.println(i.getName());
//            System.out.println(i.getPath());
//        }
//        for(String i : dir.list())
//        {
//            System.out.println(i);
//        }

        for(File i : dir.listFiles()){
            if(i.isDirectory()){
                System.out.print("Dir\t");
            }
            if(i.isFile()){
                System.out.print("File\t");
            }
            System.out.println(i.getName() + "\t" + i.getTotalSpace() + " bytes");
        }
    }

}