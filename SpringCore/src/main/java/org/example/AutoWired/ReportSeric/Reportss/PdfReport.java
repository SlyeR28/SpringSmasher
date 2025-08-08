package org.example.AutoWired.ReportSeric.Reportss;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("pdfReport")
@Lazy
public class PdfReport implements ReprotService {

    @Override
    public String getFormat() {
        return "pdf";
    }

    public PdfReport() {
        System.out.println("PDF ... Initialized....");
    }

    @Override
    public void genrate(String data) {
        System.out.println("Generating PDF Report :" +data);
    }
}
