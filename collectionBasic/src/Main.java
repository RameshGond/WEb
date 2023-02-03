import daoImp.DepartmentDaoImp;
import daoImp.EmployeeDaoImp;
import daoImp.OrganizationDaoImp;
import dto.DepartmentDto;
import dto.EmployeeDto;
import dto.OrganizationDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, DepartmentDto> map =new HashMap<>();
        DepartmentDto departmentDto=new DepartmentDto();
        DepartmentDaoImp departmentDaoImp= new DepartmentDaoImp();
        departmentDto.setId(1);
        departmentDto.setName("EEE");
        departmentDto.setStream("engineering");
        departmentDaoImp.create(departmentDto);
        departmentDaoImp.printAll();
        departmentDaoImp.updateNameByStream("rrr","engineering");
        departmentDaoImp.printAll();

        OrganizationDto organizationDto = new OrganizationDto();
        OrganizationDaoImp organizationDaoImp = new OrganizationDaoImp();
        organizationDto.setId(1);
        organizationDto.setName("VTU");
        organizationDto.setAddress("kARNATAKA");
        organizationDto.addDepartmentDto(departmentDto);
        organizationDaoImp.save(organizationDto);
        organizationDaoImp.fetchAll();
        organizationDto.updateDepartmentNameById("aaa",1);
        organizationDaoImp.fetchAll();

        EmployeeDto employeeDto = new EmployeeDto();
        EmployeeDaoImp employeeDaoImp =new EmployeeDaoImp();
        employeeDto.setId(1);
        employeeDto.setFirstName("Ramesh");
        employeeDto.setLastName("Gond");
        employeeDto.setAge(29);
        employeeDto.setEmail("ramesh@gmail.com");
        employeeDto.setPhoneNum(543456);
        employeeDto.setSex("mail");
        employeeDaoImp.add(employeeDto);
        employeeDaoImp.getAll();
}}

