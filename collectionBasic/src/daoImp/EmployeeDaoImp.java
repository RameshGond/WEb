package daoImp;

import dao.EmployeeDao;
import dto.EmployeeDto;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeDaoImp implements EmployeeDao {
    Collection<EmployeeDto> call= new ArrayList<>();
    @Override
    public void add(EmployeeDto employeeDto) {
        call.add(employeeDto);
    }

    @Override
    public void getAll() {
    for(int i = 0; i<call.size();i++){
        System.out.println(call);
    }
    }

    @Override
    public void updateByName(String lastName, String firstName) {
for(EmployeeDto dto:call){
    if(firstName.equals((dto.getFirstName()))){
        if(dto.getFirstName() !=null){
            dto.setLastName(lastName);
        }
    }
}
    }

    @Override
    public void getByName(String firstName) {
     for(EmployeeDto emp :call){
         if(firstName.equals(emp.getFirstName())){
             System.out.println(emp.toString());
         }
     }
    }

    @Override
    public String updateFirstNameByLastName(String firstName, String LastName) {
        String str =null;
        for(EmployeeDto update:call){
            if(LastName.equals(update.getLastName())){
                if(update.getLastName() != null){
                   update.setFirstName(firstName);
                }
            }
        }
        return str;
    }
}
