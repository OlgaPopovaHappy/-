package data;

public class Teacher extends User {
    private String rank;

    public Teacher(String fio, String passport, int id, String rank) {
        super(fio, passport, id);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
