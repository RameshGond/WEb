package dao;

import dto.EmployeeDto;

public interface EmployeeDao {
    void add(EmployeeDto employeeDto);
    void getAll();
    void updateByName(String lastName,String firstName);
    void getByName(String firstName);
    String updateFirstNameByLastName(String firstName, String LastName);
}
