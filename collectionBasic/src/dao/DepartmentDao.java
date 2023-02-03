package dao;

import dto.DepartmentDto;

public interface DepartmentDao {
   void create(DepartmentDto departmentDto);
   void printAll();
   void updateNameByStream(String name,String steam);




}
