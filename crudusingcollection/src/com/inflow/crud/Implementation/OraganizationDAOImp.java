package com.inflow.crud.Implementation;

import com.inflow.crud.DAO.OraganizationDAO;
import com.inflow.crud.DTO.OrganizationDTO;

import java.util.HashSet;
import java.util.Set;

public class OraganizationDAOImp implements OraganizationDAO {
    Set< OrganizationDTO > orgDTO = new HashSet< OrganizationDTO >();


    @Override
    public boolean save(OrganizationDTO dto1) {
        this.orgDTO.add(dto1);
        return true;
    }

    @Override
    public void fetchAll() {
        for (OrganizationDTO dto : orgDTO) {
            if (dto != null) {
                System.out.println(dto);
            }

        }

    }

    @Override
    public void getAddressByName(String name) {
        for (OrganizationDTO dto : orgDTO) {
            if (name.equals(dto.getName())) {
                System.out.println(dto.getAddress());
            }

        }
    }

    @Override
    public void updteAddressByName(String Address, String names) {
        for (OrganizationDTO organizationDTO : orgDTO) {
            if (names.equals(organizationDTO.getName())) {
                organizationDTO.setAddress(Address);
            }

        }

    }

    @Override
    public void deleteaddressByName(String name, String Address) {
        System.out.println("deleteNameByAddress().....started");
        for (OrganizationDTO dto : orgDTO) {
            if (Address.equals(dto.getAddress())) {
                dto.setName(null);
            }

        }
    }


}
