package com.example.exam8.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrivateFile {

    private Long id;
    private String fileName;
    private String linkName;
    private Boolean enabled;
}
