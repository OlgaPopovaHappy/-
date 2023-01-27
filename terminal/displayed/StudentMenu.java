package terminal.displayed;

public class StudentMenu {
    public static void displayMenu(){
        System.out.println("Введите команду и данные студента через пробел.");
        System.out.println("Примеры: /add /student Попова Ольга Николаевна 1980,\n" +
                "         /delete /student Попова Ольга Николаевна 1980");
    }
}