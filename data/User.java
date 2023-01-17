package data;

public abstract class User {
    private String fio;
    private String passport;
    private int id;

    public User(String fio) {
        this.fio = fio;
    }

    public User(String firstName, String lastName, int id) {
        this.fio = firstName;
        this.passport = lastName;
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
