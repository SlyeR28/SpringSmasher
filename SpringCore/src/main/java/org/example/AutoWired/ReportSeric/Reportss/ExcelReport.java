package org.example.AutoWired.ReportSeric.Reportss;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("excelReport")
@Primary
public class ExcelReport implements  ReprotService{
    public ExcelReport() {
        System.out.println("Excel Report service Initialized......");
    }

    @Override
    public void genrate(String data) {
        System.out.println("Generating Excel Report..... : " +data);

    }

    @Override
    public String getFormat() {
        return "Excel";
    }
}
