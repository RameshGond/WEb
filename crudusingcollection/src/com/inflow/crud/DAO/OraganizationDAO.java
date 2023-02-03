package com.inflow.crud.DAO;

import com.inflow.crud.DTO.OrganizationDTO;

public interface OraganizationDAO {
    boolean save(OrganizationDTO dto1);

    void fetchAll();

    void getAddressByName(String name);

    void updteAddressByName(String Address, String names);

    void deleteaddressByName(String Address, String names);
}
