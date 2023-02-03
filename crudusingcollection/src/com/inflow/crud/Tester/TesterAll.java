package com.inflow.crud.Tester;

import com.inflow.crud.DTO.DepartmentDTO;
import com.inflow.crud.DTO.EmployeeDTO;
import com.inflow.crud.DTO.OrganizationDTO;
import com.inflow.crud.Implementation.DepartmentImpl;
import com.inflow.crud.Implementation.EmployeeOperation;
import com.inflow.crud.Implementation.OraganizationDAOImp;

import java.util.HashMap;
import java.util.Map;

public class TesterAll {
    public static void main(String[] args) {
        Map< Integer, OrganizationDTO > map = new HashMap<>();
        EmployeeDTO employeeDTO = new EmployeeDTO();
        DepartmentDTO departmentDTO = new DepartmentDTO();
        OrganizationDTO organizationDTO1 = new OrganizationDTO();
        OraganizationDAOImp oraganizationDAOImp = new OraganizationDAOImp();
        DepartmentDTO departmentDTO2 = new DepartmentDTO();
        EmployeeDTO employeeDTO2 = new EmployeeDTO();


        map.put(organizationDTO1.getId(), organizationDTO1);

        System.out.println(".....employee details.....");
        employeeDTO.setId(1);
        employeeDTO.setName("sumesh");
        employeeDTO.setlName("neelaguri");
        employeeDTO.setEmail("umeshbneelaguri@gmail.com");
        employeeDTO.setAge(65);
        employeeDTO.setPhoneNum(987654321);
        employeeDTO.setSex("male");

        employeeDTO2.setId(1);
        employeeDTO2.setName("mukhtinath");
        employeeDTO2.setlName("neelaguri");
        employeeDTO2.setEmail("Mukathi@gmail.com");
        employeeDTO2.setAge(49);
        employeeDTO2.setPhoneNum(987654321);
        employeeDTO2.setSex("male");

        System.out.println("......department details.....");
        departmentDTO.setId(1);
        departmentDTO.setName("ise");
        departmentDTO.setStream("be");
        departmentDTO.saveEmployee(employeeDTO);

        departmentDTO2.setId(2);
        departmentDTO2.setName("ramesh");
        departmentDTO2.setStream("be");
        departmentDTO2.saveEmployee(employeeDTO2);
        System.out.println("getEmployee details by id");
        EmployeeDTO employeeById = departmentDTO.getEmployeeById(0);
        System.out.println(employeeById);
       /* System.out.println("deleteEmployeeById");
        EmployeeDTO employeeDTO1 = departmentDTO2.deleteEmployeeById(0);
        System.out.println(employeeDTO1);*/


        System.out.println("organization details");
        organizationDTO1.setId(1);
        organizationDTO1.setName("inflowsol");
        organizationDTO1.setAddress("bengaluru");
        organizationDTO1.addDepartmentDTO(departmentDTO);
        organizationDTO1.addDepartmentDTO(departmentDTO2);
        System.out.println("......getDepartmentById....");
        DepartmentDTO departmentById = organizationDTO1.getDepartmentById(1);
        System.out.println(departmentById);
        oraganizationDAOImp.save(organizationDTO1);
        oraganizationDAOImp.fetchAll();
        System.out.println("updateDepartmentNameById()");
        organizationDTO1.updateDepartmentNameById("inflowsolution",2);
        oraganizationDAOImp.fetchAll();
    }
}
