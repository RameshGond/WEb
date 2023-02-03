package dao;

import dto.OrganizationDto;

public interface OrganizationDao {
boolean save(OrganizationDto orgdto);
void fetchAll();
void  getAddressByName(String name);
void updateAddressByName(String address,String name);
void deteleAddressByName(String address,String name);


}
