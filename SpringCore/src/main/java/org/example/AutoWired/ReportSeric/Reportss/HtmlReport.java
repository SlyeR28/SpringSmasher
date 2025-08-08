package org.example.AutoWired.ReportSeric.Reportss;

import org.springframework.stereotype.Component;

@Component("htmlReport")
public class HtmlReport implements ReprotService{
    public HtmlReport() {
        System.out.println("Html report Initialized....");
    }

    @Override
    public void genrate(String data) {
        System.out.println("Generating Html Report ... :" +data);
    }

    @Override
    public String getFormat() {
        return "Html";
    }
}
