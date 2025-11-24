package com.weller.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClazzQueryParam {
    /*
     * 用于分页查询类
     */
    private Integer page = 1;
    private Integer pageSize = 10;

    private String name;  //班级名称

    private LocalDate begin;  //开始时间
    private LocalDate end;    //结束时间
}
