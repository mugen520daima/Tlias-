package com.weller.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentQueryParam {
    private String name;
    private String degree;
    private String clazzId;
    private Integer page = 1;
    private Integer pageSize = 10;
}
