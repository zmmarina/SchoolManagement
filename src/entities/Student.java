package entities;

import java.util.Date;

public class Student {
    private String name;
    private Integer classroom;
    private String address;
    private Integer telephone;
    private Date birthdate;

    private Contract contract;

    public Student(){

    }

    public Student(
            String name,
            Integer classroom,
            String address,
            Integer telephone,
            Date birthdate,
            Contract contract) {
        this.name = name;
        this.classroom = classroom;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
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
