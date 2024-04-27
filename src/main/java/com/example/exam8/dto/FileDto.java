package com.example.exam8.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
public class FileDto {

    private String name;
    private MultipartFile file;
    private String status;

}
