package com.example.exam8.service.impl;

import com.example.exam8.dao.FileDao;
import com.example.exam8.dto.FileDto;
import com.example.exam8.model.File;
import com.example.exam8.service.FileService;
import com.example.exam8.util.FileUtil;
import com.example.exam8.util.UserUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    private final UserUtil userUtil;
    private final FileUtil fileUtil;
    private final FileDao fileDao;

    @Override
    public void createFile(FileDto fileDto) {

        File file = new File();

        String fileName = fileUtil.saveUploadedFile(fileDto.getFile(), "/files");
        file.setName(fileDto.getName());
        file.setFileName(fileName);
        file.setStatus(fileDto.getStatus());
        file.setAuthorId(3L);

        fileDao.createFile(file);
    }

    @Override
    public List<File> getFiles() {
        return fileDao.getFiles();
    }

    @Override
    public File getFile(Long id) {
        return fileDao.getFileById(id).orElseThrow(() -> new NoSuchElementException("File is not found"));
    }

    @Override
    public ResponseEntity<?> downloadFile(Long id) {
        File file = getFile(id);
        return fileUtil.getOutputFile(file.getFileName(), "/files");
    }


}
