package com.inflow.crud.DTO;

import java.util.ArrayList;
import java.util.List;

public class OrganizationDTO {
    private int id;
    private String name;
    private String address;
    private List< DepartmentDTO > departmentDTOs = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List< DepartmentDTO > getDepartmentDTO() {
        return departmentDTOs;
    }

    public void setDepartmentDTO(List<DepartmentDTO > departmentDTO) {
        this.departmentDTOs = departmentDTO;
    }

    public DepartmentDTO addDepartmentDTO(DepartmentDTO departmentDTO) {
        this.departmentDTOs.add(departmentDTO);
        return departmentDTO;
    }

    public void deleteDepartmentDTO(DepartmentDTO departmentDTO) {
            this.departmentDTOs.remove(departmentDTO);

    }
    public DepartmentDTO getDepartmentById(int id){
        DepartmentDTO departmentDTO = this.departmentDTOs.get(id);
        return  departmentDTO;

    }
    public void updateDepartmentNameById(String name,int id){
        for (DepartmentDTO dto: departmentDTOs) {
            if (dto != null) {
                if (id==dto.getId()) {
                   dto.setName(name);
                }

            }
        }
    }
  
    @Override
    public String toString() {
        return "OrganizationDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", departmentDTOs=" + departmentDTOs +
                '}';
    }
}
