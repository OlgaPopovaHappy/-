package data;

public class Student extends User implements Comparable<Student> {
    private String department;
    private int numberGroup;
    private int dateOfBirth;

    public Student(String fio) {
        super(fio);
    }

    public Student(int numberGroup, int dateOfBirth) {
        super(null);
        this.numberGroup = numberGroup;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String fio, String passport, int id, String department, int numberGroup,
                   int dateOfBirth) {
        super(fio, passport, id);
        this.numberGroup = numberGroup;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int course) {
        this.numberGroup = numberGroup;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.dateOfBirth, o.dateOfBirth);
    }
}
