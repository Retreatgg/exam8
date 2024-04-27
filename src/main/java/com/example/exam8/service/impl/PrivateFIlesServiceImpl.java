package com.example.exam8.service.impl;

import com.example.exam8.dao.PrivateFilesDao;
import com.example.exam8.dto.PrivateFileDto;
import com.example.exam8.model.PrivateFile;
import com.example.exam8.service.PrivateFilesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PrivateFIlesServiceImpl implements PrivateFilesService {

    private final PrivateFilesDao privateFilesDao;

    @Override
    public String createPrivateFile(String fileName) {
        PrivateFile privateFile = new PrivateFile();
        String linkName = generateLink(fileName);

        privateFile.setEnabled(true);
        privateFile.setLinkName(linkName);
        privateFile.setFileName(fileName);

        privateFilesDao.createPrivateFile(privateFile);

        return linkName;
    }

    @Override
    public String generateLink(String name) {
        String uuid = UUID.randomUUID().toString();
        return name + uuid;
    }

    public void changeStatusLink(PrivateFileDto privateFileDto) {
        PrivateFile privateFile = getFileByLink(privateFileDto.getLinkName());
        privateFilesDao.changeStatusLink(privateFile);
    }

    @Override
    public PrivateFile getFileByLink(String linkName) {
        return privateFilesDao.getIdByName(linkName).orElseThrow(() -> new NoSuchElementException("File is not found"));
    }
}
