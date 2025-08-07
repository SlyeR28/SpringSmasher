package org.example.AutoWiring.EcommercePaymentSystem;

public class NotificationService {
 private EmailSender emailSender;
 private SmsSender smsSender;

    public void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void setSmsSender(SmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public void notifyUser(){
        emailSender.EmailSender();
        smsSender.Smssender();
    }
}
