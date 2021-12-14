package com.wu.pojo;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="部门对象", description="")
//部门表
public class Department {
    private Integer id;
    private String dname;
}
