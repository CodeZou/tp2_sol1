package ma.emsi;

public class SMSService {
    // Méthode pour envoyer un SMS avec le statut de l'employé
    public void sendSMS(Employee employee) {
        System.out.println("Envoi d'un SMS à " + employee.getName() + " avec le statut : " + employee.getStatus());
    }
}
