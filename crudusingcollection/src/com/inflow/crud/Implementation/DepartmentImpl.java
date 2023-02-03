package com.inflow.crud.Implementation;

import com.inflow.crud.DAO.DepartmentDAO;
import com.inflow.crud.DTO.DepartmentDTO;

import java.util.Collection;
import java.util.LinkedList;

public class DepartmentImpl implements DepartmentDAO {
    Collection<DepartmentDTO>  dtos=new LinkedList<DepartmentDTO>();
    @Override
    public void create(DepartmentDTO departmentDTO) {

            dtos.add(departmentDTO);
            System.out.println("create method started");
    }

    @Override
    public void printAll() {
        for (DepartmentDTO departmentDTO:dtos) {
            System.out.println(departmentDTO);
        }
    }

    @Override
    public void updateNameBYStream(String nam, String steam) {
         for (DepartmentDTO departmentDTO:dtos){
             if(steam.equals(departmentDTO.getStream())){
                 departmentDTO.setName(nam);
             }
         }
    }

}
