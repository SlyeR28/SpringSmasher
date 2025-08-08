package org.example.AutoWired.ReportSeric.Reportss;

import org.springframework.stereotype.Component;

@Component("jasonReport")
public class JasonReport implements  ReprotService{
    public JasonReport() {
        System.out.println("Jason Report Initialized....");
    }

    @Override
    public void genrate(String data) {
        System.out.println("Generating Jason report...: " +data);
    }

    @Override
    public String getFormat() {
        return "Jason";
    }
}
