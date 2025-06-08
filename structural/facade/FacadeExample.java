class EmailService {
    public void sendEmail(String to, String content) {
        System.out.println("Enviando email a " + to + ": " + content);
    }
}

class ReportService {
    public void generateReport(String name) {
        System.out.println("Generando reporte: " + name);
    }
}

class NotificationFacade {
    private EmailService emailService = new EmailService();
    private ReportService reportService = new ReportService();

    public void notifyUser(String email, String reportName) {
        reportService.generateReport(reportName);
        emailService.sendEmail(email, "Tu reporte '" + reportName + "' está listo.");
    }
}
