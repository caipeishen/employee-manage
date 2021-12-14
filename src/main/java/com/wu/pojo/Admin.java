package com.wu.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理员
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="管理员对象", description="")
public class Admin {
    private Integer id;
    private String username;
    private String password;
}
