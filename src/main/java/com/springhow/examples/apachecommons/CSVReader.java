package com.springhow.examples.apachecommons;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import javax.xml.bind.annotation.XmlType;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) throws IOException {

        CSVParser csvParser = new CSVParser(new FileReader("employees.csv"), CSVFormat.DEFAULT);

        for (CSVRecord record : csvParser) {
            System.out.println(record.get(0) + "," + record.get(1) + "," + record.get(2) + "," + record.get(3));
        }
        csvParser.close();
        System.out.println("\n\n");

        CSVParser csvRecordsWithHeader
                = CSVFormat.DEFAULT.withHeader("FirstName","LastName","Email")
                .parse(new FileReader("employees.csv"));
        for (CSVRecord record : csvRecordsWithHeader) {
            System.out.println(record.get("FirstName") + "," + record.get("LastName") + "," + record.get("Email"));
        }
        System.out.println("\n\n");

        CSVParser csvRecordsWithFirstLineHeader
                = CSVFormat.DEFAULT.withFirstRecordAsHeader()
                .parse(new FileReader("employees.csv"));
        for (CSVRecord record : csvRecordsWithFirstLineHeader) {
            System.out.println(record.get("FirstName") + "," + record.get("Email") );
        }
        System.out.println("\n\n");

        CSVParser csvRecordsWithEnum
                = CSVFormat.DEFAULT.withHeader(Headers.class)
                .parse(new FileReader("employees.csv"));
        for (CSVRecord record : csvRecordsWithEnum) {
            System.out.println(record.get(Headers.FirstName) + "," + record.get(Headers.Email));
        }
        System.out.println("\n\n");
    }
}
