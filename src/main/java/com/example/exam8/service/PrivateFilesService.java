package com.example.exam8.service;

import com.example.exam8.model.PrivateFile;
import org.springframework.stereotype.Service;

@Service
public interface PrivateFilesService {

    String createPrivateFile(String fileName);

    String generateLink(String name);

    PrivateFile getFileByLink(String link);
}
