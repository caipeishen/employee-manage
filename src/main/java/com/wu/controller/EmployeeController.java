package com.wu.controller;

import com.wu.pojo.Department;
import com.wu.pojo.Employee;
import com.wu.service.impl.DepartmentServiceImpl;
import com.wu.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 员工请求控制器
 */
@Controller
public class EmployeeController {
    @Autowired
    private DepartmentServiceImpl departmentService;

    @Autowired
    EmployeeServiceImpl employeeService;

    /**
     * 获取员工列表
     * @param model
     * @return
     */
    @RequestMapping("/emps")
    public String list(Model model) {
        List<Employee> employees = employeeService.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    /**
     * 到添加员工界面
     * @param model
     * @return
     */
    @GetMapping("/emp")
    public String toAdd(Model model) {
        //查出部门的所有信息
        List<Department> departments = departmentService.getAll();
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    /**
     * 添加员工
     * @param employee
     * @return
     */
    @PostMapping("/emp")
    public String add(Employee employee) {
//        添加的操作
        employeeService.save(employee);
        return "redirect:/emps";
    }

    //去员工的修改页面
    @GetMapping("/upemp/{id}")
    public String toupdataEmp(@PathVariable("id") int id, Model model) {
        //查出原来的数据
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("emp", employee);

        List<Department> departments = departmentService.getAll();
        model.addAttribute("departments", departments);

        return "emp/update";
    }

    /**
     * 到更新员工界面
     * @param employee
     * @return
     */
    @PostMapping("/updateEmp")
    public String updataEmp(Employee employee) {
        employeeService.updateEmpById(employee);
        return "redirect:/emps";
    }

    /**
     * 删除员工
     * @param id
     * @return
     */
    //删除员工
    @GetMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable("id") int id) {
        employeeService.delete(id);
        return "redirect:/emps";
    }

}
