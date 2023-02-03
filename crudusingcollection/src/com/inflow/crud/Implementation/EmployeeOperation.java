package com.inflow.crud.Implementation;

import com.inflow.crud.DAO.EmployeeDAO;
import com.inflow.crud.DTO.EmployeeDTO;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeOperation implements EmployeeDAO {
    Collection<EmployeeDTO> c = new ArrayList<EmployeeDTO>();

    @Override
    public void add(EmployeeDTO dto) {
        c.add(dto);
    }

    @Override
    public void getAll() {
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c);

        }
    }

    @Override
    public void updateByName(String lName, String uName) {
        for (EmployeeDTO col : c) {
            if (uName.equals(col.getName())) {
                if (col.getlName() != null) {
                    col.setlName(lName);
                }

            }
        }

    }

    @Override
    public void getByName(String name) {
        for (EmployeeDTO dto : c) {
            if (name.equals(dto.getName())) {
                System.out.println(dto.toString());
            }
        }
    }

    @Override
    public String updateNameBYlName(String name, String lastName) {
        String str = null;
        for (EmployeeDTO coll : c) {
            if (lastName.equals(coll.getlName())) {
                if (coll.getlName() != null) {
                    str = coll.setName(name);
                }

            }

        }

        return str;
    }


}





