package ma.emsi;

public class EmployeeManager {
    private EmailService emailService;
    private SMSService smsService;

    // Constructeur
    public EmployeeManager() {
        // Instanciation directe des services
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    // Méthode pour changer le statut d'un employé et envoyer les notifications
    public void changeEmployeeStatus(Employee employee, String newStatus) {
        employee.setStatus(newStatus);
        emailService.sendEmail(employee);
        smsService.sendSMS(employee);
    }
}
