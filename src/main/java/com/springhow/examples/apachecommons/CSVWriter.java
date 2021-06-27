package com.springhow.examples.apachecommons;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

    public static void main(String[] args) throws IOException {
        //data
        String[][] employees = {
                {"Man", "Sparkes", "msparkes0@springhow.com", "Engineering"},
                {"Dulcinea", "Terzi", "dterzi1@springhow.com", "Engineering"},
                {"Tamar", "Bedder", "tbedder2@springhow.com", "Legal"},
                {"Vance", "Scouller", "vscouller3@springhow.com", "Sales"},
                {"Gran", "Jagoe", "gjagoe4@springhow.com", "Business Development"}
        };
        //create a CSV printer
        CSVPrinter printer = new CSVPrinter(new FileWriter("employees.csv"), CSVFormat.DEFAULT);
        //create header row
        printer.printRecord("FirstName", "LastName", "Email", "Department");
        // create data rows
        for (String[] employee : employees) {
            printer.printRecord(employee);
        }

        //close the printer after file is complete
        printer.flush();
        printer.close();
    }
}
