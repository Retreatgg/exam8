package com.example.exam8.service;


import com.example.exam8.dto.FileDto;
import com.example.exam8.model.File;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FileService {
    void createFile(Authentication auth, FileDto fileDto);

    List<File> getFiles();

    File getFile(Long id);
    ResponseEntity<?> downloadFile(Long id);
    List<File> getFilesByAuthorId(Long id);
}
