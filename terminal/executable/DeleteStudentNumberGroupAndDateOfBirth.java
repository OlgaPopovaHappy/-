package terminal.executable;

import data.Student;
import service.StudentService;

public class DeleteStudentNumberGroupAndDateOfBirth implements CommandExecutable {
    private StudentService studentService;
    private Student student;

    public DeleteStudentNumberGroupAndDateOfBirth(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.deleteStudentNumberGroupAndDateOfBirth(student.getNumberGroup(), student.getDateOfBirth());
        System.out.printf("Student removed - %s, number course - %d, date of birth - %d.",
                student.getFio(), student.getNumberGroup(), student.getDateOfBirth());
    }
}
