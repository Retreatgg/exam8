package com.example.exam8.service;

import com.example.exam8.dto.UserRoleDto;
import org.springframework.stereotype.Service;

@Service
public interface UserRoleService {

    void createRoleForUser(UserRoleDto userRoleDto);
}
