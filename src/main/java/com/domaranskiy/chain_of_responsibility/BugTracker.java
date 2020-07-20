package com.domaranskiy.chain_of_responsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reporrtNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSnotifier(Priority.ASAP);

        reporrtNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reporrtNotifier.notifyManager("Everything is OK",Priority.ROUTINE);
        reporrtNotifier.notifyManager("Something went wrong!",Priority.IMPORTANT);
        reporrtNotifier.notifyManager("We've had a problem here!!!",Priority.ASAP);

    }
}