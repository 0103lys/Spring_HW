package com.koreait.day2.repository;

import com.koreait.day2.model.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository annotation으로 써줌으로써 JPA를 사용할 수 있게 JPA Repository를 만들고 데이터를 담을 수 있음
@Repository                                                        //  ↓ 각각의 값을 identity하게 넣어줄 수 있는 (숫자)Long형 넣어주기
public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {
//                                                          ↑ (DTO,VO)데이터를 담을 수 있는 class 넣어주기

    // AdminUserRepository를 사용
}
