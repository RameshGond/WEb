package dto;

import java.util.ArrayList;
import java.util.List;

public class OrganizationDto {
    private int id;
    private String name;
    private String address;
    private List<DepartmentDto> departmentDtos =new ArrayList<>();

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

    public List<DepartmentDto> getDepartmentDtos() {
        return departmentDtos;
    }

    public void setDepartmentDtos(List<DepartmentDto> departmentDtos) {
        this.departmentDtos = departmentDtos;
    }

    @Override
    public String toString() {
        return "OrganizationDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", departmentDtos=" + departmentDtos +
                '}';
    }
    public DepartmentDto addDepartmentDto(DepartmentDto departmentDto){
        this.departmentDtos.add(departmentDto);
        return departmentDto;
    }
    public void deleteDepartmentDto(DepartmentDto departmentDto){
        this.departmentDtos.remove(departmentDto);
    }
    public DepartmentDto getDepartmentById(int id){
        DepartmentDto departmentDto = this.departmentDtos.get(id);
        return departmentDto;
    }
    public void updateDepartmentNameById(String name,int id){
        for(DepartmentDto dto:departmentDtos){
            if(dto !=null){
                if(id==dto.getId()){
                    dto.setName(name);
                }
            }
        }
    }
}
