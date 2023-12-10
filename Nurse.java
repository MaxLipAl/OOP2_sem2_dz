package Seminar.Seminar_2_from_My_DZ1;

public class Nurse {
    private String name;
    private String surName;

    public Nurse() {
    }

    public Nurse(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

     @Override
    public String toString() {
        return "Nurse{" +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
