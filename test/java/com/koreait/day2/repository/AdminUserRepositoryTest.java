package com.koreait.day2.repository;

import com.koreait.day2.Day2ApplicationTests;
import com.koreait.day2.model.entity.AdminUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.time.LocalDateTime;

public class AdminUserRepositoryTest extends Day2ApplicationTests { // AdminUserRepositoryTest 클래스 생성

    @Autowired
    private AdminUserRepository adminUserRepository;


    // 실제 테스트 할 곳곳
    @Test
    public void create(){
        AdminUser adminUser = AdminUser.builder()
                // set 해줌
                .userid("admin")
                .userpw("1234")
                .name("관리자")
                .status("use")
                .regDate(LocalDateTime.now())
                .build();   // 해당 데이터값 adminUser객체에 저장
        AdminUser newAdminUser = adminUserRepository.save(adminUser);   // 새 객체를 만들어서 save시켜줌
        // Assertions.assertNotNull(newAdminUser);
    }
}