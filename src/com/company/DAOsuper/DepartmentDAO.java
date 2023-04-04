package com.company.DAOsuper;

import com.company.fashiondesigner.Department;

import java.sql.SQLException;
import java.util.Map;

public interface DepartmentDAO {
    Department getByID(int ID) throws SQLException;

    void createDepartment(Department department);

    void changeInfo(int ID);

    void delete(int ID);

}
