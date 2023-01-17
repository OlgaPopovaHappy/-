package terminal;

import data.Student;
import service.StudentService;
import terminal.executable.*;

public class CommandExecutableFactory {
    private StudentService studentService;


    public CommandExecutableFactory() {
    }

    public CommandExecutableFactory(StudentService studentService) {
        this.studentService = studentService;
    }


    public CommandExecutable create(String[] input) {

        switch (input[0]) {

            case "add":
                new CreateStudentExecutable(studentService, new Student(input[1]));
                break;
            case "delete":
                new DeleteStudentExecutable(studentService, new Student(input[1]));
                break;
            case "deleteFio":
                new DeleteStudentFioExecutable(studentService, new Student(input[1]));
                break;
            case "deleteNumberGroupAndDataOBirth":
                new DeleteStudentNumberGroupAndDateOfBirth(studentService, new Student(input[1]));

            default:
                System.out.println("Такой команды нет");
                break;
        }
        return null;
    }
}