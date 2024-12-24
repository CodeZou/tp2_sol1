package ma.emsi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice", "En formation");

        // Création d'un gestionnaire d'employés
        EmployeeManager employeeManager = new EmployeeManager();

        // Changer le statut de l'employé et envoyer des notifications
        employeeManager.changeEmployeeStatus(employee, "Employé actif");

    }

}