package com.inflow.crud.DTO;



import java.util.ArrayList;
import java.util.List;

public class DepartmentDTO {
    private int id;
    private String name;
    private String stream;
    private List< EmployeeDTO > employeeDTOS = new ArrayList<>();

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

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public void setemployeeDTOS(List< EmployeeDTO > employeeDTOS) {
        this.employeeDTOS = employeeDTOS;
    }

    public List< EmployeeDTO > getemployeeDTOS() {
        return employeeDTOS;
    }

    public void saveEmployee(EmployeeDTO employeeDTO) {
        if (employeeDTO != null) {
            this.employeeDTOS.add(employeeDTO);
        }
    }
    public EmployeeDTO getEmployeeById(int id){
        EmployeeDTO employeeDTO = this.employeeDTOS.get(id);
    return employeeDTO;
    }
    public EmployeeDTO deleteEmployeeById(int id){

            EmployeeDTO employeeDTO = this.employeeDTOS.remove(id);

        return employeeDTO;
    }

    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stream='" + stream + '\'' +
                ", employeeDTOS=" + employeeDTOS +
                '}';
    }

}
