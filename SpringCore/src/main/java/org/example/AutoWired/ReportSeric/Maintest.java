package org.example.AutoWired.ReportSeric;

import org.example.AutoWired.ReportSeric.Manager.ReportManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maintest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Reprots.xml");
        ReportManager rmm = context.getBean(ReportManager.class);
        rmm.GenerateALL("SalesData");
        rmm.demonstrateLazyPdf("SalesData");
    }
}
