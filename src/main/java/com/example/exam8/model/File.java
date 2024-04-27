package com.example.exam8.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class File {

    private Long id;
    private String name;
    private String fileName;
    private Long authorId;
    private String status;
}
