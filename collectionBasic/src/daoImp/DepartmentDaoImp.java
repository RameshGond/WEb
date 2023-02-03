package daoImp;

import dao.DepartmentDao;
import dto.DepartmentDto;

import java.util.Collection;
import java.util.LinkedList;

public class DepartmentDaoImp implements DepartmentDao {
    Collection<DepartmentDto> dto = new LinkedList<>();

    @Override
    public void create(DepartmentDto departmentDto) {
        dto.add(departmentDto);
        System.out.println("add department method running");
    }

    @Override
    public void printAll() {
        for (DepartmentDto departmentDto : dto) {
            System.out.println(departmentDto);
        }

    }

    @Override
    public void updateNameByStream(String name, String steam) {
        for (DepartmentDto departmentDto : dto) {
            if (steam.equals(departmentDto.getStream())) {
                departmentDto.setName(name);
            }
        }
    }
}
