package org.example.AutoWired.ReportSeric.Manager;

import org.example.AutoWired.ReportSeric.Reportss.ReprotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class ReportManager {
    private final ReprotService defaultSerive;
    private final Map<String , ReprotService> beansByName;
    private final Map<String, ReprotService> beansByformat = new HashMap<>();
    private final List<ReprotService> allServices;

    @Autowired
    @Qualifier("jasonReport")
    private ReprotService Jasoneport;

    @Autowired

    public ReportManager(Map<String, ReprotService> beansByName, List<ReprotService> allServices, ReprotService defaultSerive) {
        this.beansByName = beansByName;
        this.allServices = allServices;
        this.defaultSerive = defaultSerive;

        for(Map.Entry<String , ReprotService> e : beansByName.entrySet()){
            ReprotService svc = e.getValue();
            beansByformat.put(svc.getFormat() ,svc);
        }
    }

    public void GenerateDefault(String data){
        System.out.println("\n--generateDefault() --> uses @Primary bean--");
    }
    public void GenerateByFormat(String format , String data){
        System.out.println("\n--- generate format (" +format + ")----");
        ReprotService svc = beansByformat.get(format);
        if(svc == null){
            System.out.println("No Service found for format  : " +format);
            return;
        }
        svc.genrate(data);
    }
    public void GenerateByName(String beanName , String data){
        System.out.println("\n--- generate format (" +beanName + ")----");
        ReprotService svc =   beansByName.get(beanName);
        if(svc == null){
            System.out.println("No Service found for format  : " +beanName);
            return;
        }
        svc.genrate(data);
    }
    public void GenerateALL(String data){
        System.out.println("\n-- generateAll() -> iterate list --");
        for(ReprotService svc : allServices){
            svc.genrate(data);
        }
    }
    public void showJasonFieldInjection(String data){
        System.out.println("\n-- showJsonFieldInjection() -> @Autowired @Qualifier\n");
        Jasoneport.genrate(data);
    }
    public void demonstrateLazyPdf(String data){
        System.out.println("\n-- demonstrateLazyPdf() -> shows lazy initialization for PDF --");
        ReprotService pdf = beansByformat.get("pdf");
        if (pdf == null) {
            System.out.println("No PDF service present");
            return;
        }
        pdf.genrate(data);
    }

}
