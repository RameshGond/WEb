package com.inflow.crud.DAO;

import com.inflow.crud.DTO.DepartmentDTO;

public interface DepartmentDAO {
    void create(DepartmentDTO departmentDTO);
    void printAll();
    void updateNameBYStream(String nam,String steam);
}
