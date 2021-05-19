package entities;

import java.util.Date;

public class Student {
    private String name;
    private Integer classroom;
    private String email;
    private long telephone;
    private Date birthdate;

    private Contract contract;

    public Student(){

    }

    public Student(String name, Integer classroom, String email, long telephone, Date birthdate, Contract contract) {
        this.name = name;
        this.classroom = classroom;
        this.email = email;
        this.telephone = telephone;
        this.birthdate = birthdate;
        this.contract = contract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassroom() {
        return classroom;
    }

    public void setClassroom(Integer classroom) {
        this.classroom = classroom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}