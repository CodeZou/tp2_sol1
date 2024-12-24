package ma.emsi;

public class EmailService {
    // Méthode pour envoyer un email avec le statut de l'employé
    public void sendEmail(Employee employee) {
        System.out.println("Envoi d'un email à " + employee.getName() + " avec le statut : " + employee.getStatus());
    }
}
