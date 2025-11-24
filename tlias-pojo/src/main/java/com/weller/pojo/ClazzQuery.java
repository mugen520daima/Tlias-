package com.weller.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClazzQuery {
    private Integer id;
    private String name;
    private String room;
    private LocalDate beginDate; //开课时间
    private LocalDate endDate; //结课时间
    private Integer masterId;
    private String masterName;
    private String createTime;
    private String updateTime;
    private String subject;
    private String status;
}
