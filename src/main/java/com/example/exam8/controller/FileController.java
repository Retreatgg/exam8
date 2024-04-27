package com.example.exam8.controller;


import com.example.exam8.dto.FileDto;
import com.example.exam8.model.File;
import com.example.exam8.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class FileController {

    private final FileService fileService;

    @GetMapping("")
    public String files(Model model) {
        List<File> files = fileService.getFiles();
        model.addAttribute("files", files);
        return "file/files";
    }

    @GetMapping("file/add")
    public String formAddFile() {
        return "file/loadFile";
    }

    @PostMapping("file/add")
    public String addFile(FileDto fileDto) {
        fileService.createFile(fileDto);
        return "redirect:/";
    }

    @GetMapping("file/{id}")
    public String file(@PathVariable Long id, Model model) {
        model.addAttribute("file", fileService.getFile(id));
        return "file/file";
    }

}
