package com.example.exam8.service.impl;

import com.example.exam8.dao.UserRoleDao;
import com.example.exam8.dto.UserRoleDto;
import com.example.exam8.model.UserRole;
import com.example.exam8.service.UserRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {

    private final UserRoleDao userRoleDao;
    @Override
    public void createRoleForUser(UserRoleDto userRoleDto) {
        UserRole userRole = new UserRole();
        userRole.setRoleId(userRoleDto.getRoleId());
        userRole.setUserId(userRoleDto.getUserId());
        userRoleDao.createRoleForUser(userRole);
    }
}
