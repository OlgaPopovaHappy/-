package terminal.executable;

import data.User;
import service.StudentService;

public class DeleteStudentFioExecutable implements CommandExecutable {

    private StudentService studentService;
    private User user;

    public DeleteStudentFioExecutable(StudentService studentService, User user) {
        this.studentService = studentService;
        this.user = user;
    }

    @Override
    public void execute() {
        studentService.deleteStudentFio(user.getFio());
        System.out.printf("Student removed - %s", user.getFio());
    }
}
