import jdk.jfr.Category;

import javax.management.Notification;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Task {
    private String title;
    private String description;
    private LocalDate dueDate;
    //private  priority;
    private boolean isCompleted;
    private boolean isRecurring;
    //private  category;
    private User assignedUser;
    //private  notifications;

    public Task() {

    }

    public Task(String title, String description, LocalDate dueDate, boolean isCompleted, boolean isRecurring, User assignedUser) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;
        this.isRecurring = false;
        this.assignedUser = assignedUser;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public boolean isIsRecurring() {
        return isRecurring;
    }

    public void setIsRecurring(boolean idRecurring) {
        this.isRecurring = idRecurring;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public void introducereTask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Titlul task-ului: ");
        this.title = sc.nextLine();
        System.out.println("Descrie task-ul");
        this.description = sc.nextLine();

       /* boolean validDate = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        while (!validDate) {

            System.out.println("Introduceti termenul pana la care trebuie sa fie gata in format (zz-LL-aaaa)");
            if (sc.nextLine()==formatter) {
                this.dueDate = LocalDate.parse(sc.nextLine(), formatter);
                validDate = true;

            } else System.out.println("Data introdusa gresit - trebuie sa fie gata in format (zz-LL-aaaa) ");
        }*/
        this.isCompleted = false;

        boolean raspunsValid = false;
        while (!raspunsValid) {
            System.out.println("Doriti ca acest task sa fie recurent? Raspundeti cu DA sau NU");
            if (sc.nextLine() == "DA") {
                this.isRecurring = true;
                raspunsValid = true;
                //seteaza recurenta
            } else if (sc.nextLine() == "NU") {
                this.isRecurring = false;
                raspunsValid = true;
            } else {
                System.out.println("Raspundeti cu DA sau NU");
            }
        }


    }



    public void marcheazaSarcinaTerminata() {
        if (!isCompleted) {
            isCompleted = true;
            System.out.println("Felicitari! Task-ul" + title + "A fost terminat");
            //adaugare mesaj de felicitare daca s-a incadrat in due date cu Target
        } else {
            System.out.println("Task-ul a fost deja terminata");
        }
    }



   /*

addNotification(): Permite adăugarea unei notificări pentru sarcină.

updateTask(): Permite actualizarea unei sarcini cu noi valori pentru titlu, descriere, dată limită și prioritate.

isOverdue(): Verifică dacă sarcina este depășită (termenele limită sunt trecute fără ca sarcina să fie completată).

displayTaskDetails(): Afișează toate detaliile relevante ale sarcinii, precum titlu, descriere, dată limită, stare și prioritate.*/


}
