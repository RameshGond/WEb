package com.inflow.crud.DAO;

import com.inflow.crud.DTO.EmployeeDTO;

public interface EmployeeDAO {
    void add(EmployeeDTO dto);
    void getAll();
    void updateByName(String lName,String  name);
    void getByName(String name);
    String updateNameBYlName(String name,String lName);

}
