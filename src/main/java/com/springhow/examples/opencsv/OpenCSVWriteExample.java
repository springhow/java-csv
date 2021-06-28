package com.springhow.examples.opencsv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OpenCSVWriteExample {
    public static void main(String[] args) throws IOException, CsvException, SQLException {
        //Read all in one go

        CSVWriter csvWriter = new CSVWriter(new FileWriter("list.csv"));
        csvWriter.writeNext(new String[]{"John", "Doe", "jdoe@example.com", "Sales"});
        csvWriter.writeNext(new String[]{"Jane", "Doe", "jane.doe@example.com", "HR"});
        csvWriter.close();

//        List<String[]> lines = getRecordsAsList();
//        csvWriter = new CSVWriter(new FileWriter("list.csv"));
//        csvWriter.writeAll(lines);
//        csvWriter.close();
//
//        csvWriter = new CSVWriter(new FileWriter("list.csv"));
//        Connection connection = DriverManager.getConnection("");
//        Statement stmt = connection.createStatement();
//        ResultSet resultSet = stmt.executeQuery("select * from employees");
//        csvWriter.writeAll(resultSet,true);
//        csvWriter.close();
//        connection.close();
    }

    private static List<String[]> getRecordsAsList() {
        return Collections.emptyList();
    }
}
