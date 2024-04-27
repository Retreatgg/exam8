package com.example.exam8.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PrivateFileDto {

    private String fileName;
    private String linkName;
}
