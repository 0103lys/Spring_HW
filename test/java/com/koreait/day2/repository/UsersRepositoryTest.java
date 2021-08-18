package com.koreait.day2.repository;

import com.koreait.day2.Day2ApplicationTests;

import com.koreait.day2.model.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UsersRepositoryTest extends Day2ApplicationTests {


    @Autowired
    private UsersRepository usersRepository;

    @Test
    public void create(){
        Users users = Users.builder()
                .userid("apple")
                .userpw("1234")
                .hp("010-1111-1111")
                .email("apple@apple.com")
                .regDate(LocalDateTime.now())
                .build();
        Users newUsers = usersRepository.save(users);

    }
}
