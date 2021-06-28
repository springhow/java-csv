package com.springhow.examples.opencsv;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvNumber;

import java.util.Date;

public class MonitoringData {
    @CsvBindByName
    @CsvNumber("###.##")                    // 000.00 format
    public int value;
    @CsvBindByName
    @CsvDate("yyyy-MM-dd")                  // 1995-10-24
    public Date capturedAt;
    public String metric;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getCapturedAt() {
        return capturedAt;
    }

    public void setCapturedAt(Date capturedAt) {
        this.capturedAt = capturedAt;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }
}
