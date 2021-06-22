package com.chp15;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.Scanner;


public class StudentRecorder {


    public void saveRecords(){
        //create and open a file
        try(Formatter formatter = new Formatter("student_records.txt");
                Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Enter Students record and ENTER + CTRL + D to stop");
            formatter.format("%s %s %s %s %s%n", "Firstname", "Lastname",
                    "Level", "Birth Year", "Age");


            while(scanner.hasNext()){
                String firstname = scanner.next();
                String lastname = scanner.next();
                int level = scanner.nextInt();
                int yearOfBirth = scanner.nextInt();

                formatter.format("%s %s %d %d %d%n",firstname, lastname
                        ,level, yearOfBirth,
                        LocalDate.now().getYear() - yearOfBirth
                        );
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        StudentRecorder studentRecorder = new StudentRecorder();
        studentRecorder.saveRecords();
    }
}
