package com.itheima.domain;
//lombok

import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
