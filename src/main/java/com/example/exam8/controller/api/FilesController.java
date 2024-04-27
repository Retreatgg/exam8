package com.example.exam8.controller.api;

import com.example.exam8.model.File;
import com.example.exam8.service.FileService;
import com.example.exam8.service.UserService;
import com.example.exam8.util.FileUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
@RequiredArgsConstructor
@RequestMapping("files")
public class FilesController {

    private final FileService fileService;
    private final UserService userService;
    private final FileUtil fileUtil;

    @GetMapping("{id}")
    public ResponseEntity<?> download(@PathVariable Long id) {
        return fileService.downloadFile(id);
    }
}
