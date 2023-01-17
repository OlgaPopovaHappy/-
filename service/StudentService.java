package service;

import data.Student;
import data.StudentGroup;
import data.comparators.UserComparator;
import repository.StudentRepository;

import java.util.Collections;
import java.util.List;

public class StudentService implements DataService<Student> {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createUser(Student user) {
        return studentRepository.save(user);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public StudentGroup getGroup(int entity) {
        return null;
    }

    @Override
    public void sortUsers(List<Student> users) {
        Collections.sort(users);
    }

    @Override
    public void sortUsersByName(List<Student> users) {
        Collections.sort(users, new UserComparator());
    }

    @Override
    public void saveStudent(Student entity) {

    }

    @Override
    public void deleteStudent(Student entity) {
        studentRepository.delete(entity);
    }

    public void deleteStudentFio(String fio) {

    }

    public void deleteStudentNumberGroupAndDateOfBirth(int numberGroup, int dateOfBirth) {

    }

}