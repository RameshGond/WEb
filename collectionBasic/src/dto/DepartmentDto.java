package dto;


import java.util.ArrayList;
import java.util.List;

public class DepartmentDto {
    private int id;
    private String name;
    private  String stream;
    private List<EmployeeDto> employeeDtos =new ArrayList<>();

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

    public List<EmployeeDto> getEmployeeDtos() {
        return employeeDtos;
    }

    public void setEmployeeDtos(List<EmployeeDto> employeeDtos) {
        this.employeeDtos = employeeDtos;
    }

    @Override
    public String toString() {
        return "DepartmentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stream='" + stream + '\'' +
                ", employeeDtos=" + employeeDtos +
                '}';
    }
}
