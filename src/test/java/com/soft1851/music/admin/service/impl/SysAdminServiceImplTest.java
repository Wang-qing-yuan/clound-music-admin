package com.soft1851.music.admin.service.impl;

import com.soft1851.music.admin.domain.dto.LoginDto;
import com.soft1851.music.admin.service.SysAdminService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SysAdminServiceTest {

    @Resource
    private SysAdminService sysAdminService;

    @Test
    void login() {
        LoginDto loginDto = LoginDto.builder().name("mqxu").password("123456").build();
        sysAdminService.login(loginDto);
    }
}