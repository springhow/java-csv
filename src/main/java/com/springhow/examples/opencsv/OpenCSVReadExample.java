package com.springhow.examples.opencsv;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class OpenCSVReadExample {
    public static void main(String[] args) throws IOException, CsvException {
        //Read all in one go

       CSVReader reader = new CSVReader(new FileReader("employees.csv"));
       //Read all in one go
       List<String[]> rows = reader.readAll();
       for (String[] row : rows) {
           System.out.println(row[0] + "," + row[1] + "," + row[2] + "," + row[3]);
       }
       reader.close();

       //read line by line
       reader = new CSVReader(new FileReader("employees.csv"));
       String[] nextLine;
       while ((nextLine = reader.readNext()) != null) {
           System.out.println(nextLine[0] + "," + nextLine[1] + "," + nextLine[2] + "," + nextLine[3]);
       }
       reader.close();

        //read line by line
        List<Employee> employees = new CsvToBeanBuilder(new FileReader("employees.csv"))
                .withType(Employee.class)
                .build()
                .parse();
        System.out.println(employees);




    }
}
