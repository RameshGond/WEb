package daoImp;

import dao.OrganizationDao;
import dto.OrganizationDto;

import java.util.HashSet;
import java.util.Set;

public class OrganizationDaoImp implements OrganizationDao {
    Set<OrganizationDto> org = new HashSet<>();

    @Override
    public boolean save(OrganizationDto orgdto) {
        this.org.add(orgdto);
        return true;
    }

    @Override
    public void fetchAll() {
        for (OrganizationDto dto : org) {
            if (dto != null) {
                System.out.println(dto);
            }
        }
    }

    @Override
    public void getAddressByName(String name) {
        for (OrganizationDto dto : org) {
            if (name.equals(dto.getName())) {
                System.out.println(dto.getAddress());
            }
        }
    }

    @Override
    public void updateAddressByName(String address, String name) {
        for (OrganizationDto organizationDto : org) {
            if (name.equals(organizationDto.getName())) {
                organizationDto.setAddress(address);
            }
        }
    }

    @Override
    public void deteleAddressByName(String address, String name) {
        System.out.println("deleteNameByAddress().....started");
        for (OrganizationDto organizationDto : org) {
            if (address.equals(organizationDto.getAddress())) {
                organizationDto.setName(null);
            }
        }
    }
}
