package src.day5;

/**
 * Created by vsanghav on 8/5/2016.
 */

import java.io.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter name of file 1: ");
        File first = new File(sc.nextLine());
        InputStream input = null;

        while(true) {
            try
            {
                input = new FileInputStream(first);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("There is no file with this name. Please reenter name of file 1: ");
                first = new File(sc.nextLine());
            }
        }


        while(true){

            System.out.println("Please enter name of file 2: ");
            File second = new File(sc.nextLine());

            if(second.exists()==true)
            {
                System.out.println("File with this name already exists.");
            }
            else {
                try {
                    Files.copy(input, second.toPath());
                    System.out.println("Copy Successful");
                    break;
                } catch (SecurityException s) {
                    System.out.println("Not enough permission to create file");
                    s.printStackTrace();
                } catch (IOException e) {
                    System.out.println("IO error occured while copying");
                    e.printStackTrace();
                }
            }
        }


    }
}
