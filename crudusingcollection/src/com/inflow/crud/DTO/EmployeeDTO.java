package com.inflow.crud.DTO;

public class EmployeeDTO {
    private int id;
    private String name;
    private String lName;
    private String email;
    private int phoneNum;
    private int age;
    private String sex;

    public EmployeeDTO() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getlName() {
        return lName;
    }


    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getAge(int i) {
        return age;
    }

    public void setAge(int     age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum=" + phoneNum +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

}
