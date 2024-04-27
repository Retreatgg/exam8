package com.example.exam8.controller;


import com.example.exam8.dto.FileDto;
import com.example.exam8.model.File;
import com.example.exam8.model.PrivateFile;
import com.example.exam8.service.FileService;
import com.example.exam8.service.PrivateFilesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class FileController {

    private final FileService fileService;
    private final PrivateFilesService privateFilesService;

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
    public String addFile(Authentication auth, FileDto fileDto) {
        fileService.createFile(auth, fileDto);
        return "redirect:/";
    }

    @GetMapping("file/generate/link/{fileName}")
    public String generateLink(@PathVariable String fileName, Model model) {
        String linkName = privateFilesService.createPrivateFile(fileName);
        model.addAttribute("link", linkName);

        return "file/private_link";
    }

    @GetMapping("/file/private/{link}")
    public String downloadPrivateFile(@PathVariable String link, Model model) {
        PrivateFile privateFile = privateFilesService.getFileByLink(link);
        model.addAttribute("file", privateFile);

        return "file/private_file";
    }

}
