package com.wu.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="员工对象", description="")
//员工表
public class Employee {
    private Integer id;
    private String ename;
    private String email;
    private Integer gender;
    private int did;
    private String birthday;
    private String dname;
}
