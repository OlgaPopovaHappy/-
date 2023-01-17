package service;


import data.Student;
import data.StudentGroup;
import data.User;

import java.util.List;

public interface DataService<U extends User> {

    U createUser(U user);

    U findById(int id);


    StudentGroup getGroup(int entity);

    void sortUsers(List<U> users);

    void sortUsersByName(List<U> users);

    void saveStudent(Student entity);

    void deleteStudent(Student entity);


}