package com.koreait.day2.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data

@AllArgsConstructor
@NoArgsConstructor

@Entity

@SequenceGenerator(
        name="sequence_users",
        sequenceName = "sequence_users",
        initialValue = 1,
        allocationSize = 1
)


@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_users")
    private Long id;
    private String userid;
    private String userpw;
    private String hp;
    private String email;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;

}
/*  User 클래스에 데이터를 oracle에 저장하는 단위테스트 메소드를 작성
    (id 시퀀스로 일련번호 등록)
 */