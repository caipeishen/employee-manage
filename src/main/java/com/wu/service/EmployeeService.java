package com.wu.service;

import com.wu.pojo.Employee;

import java.util.List;

/**
 * EmployeeService
 */
public interface EmployeeService {
    List<Employee> getAll(String username);

    //通过ID查询员工
    Employee getEmployeeById(int id);

    //通过ID删除员工
    int delete(int id);

    //增加一个员工
    int save(Employee employee);

    // 更新员工
    int updateEmpById(Employee employee);
}
