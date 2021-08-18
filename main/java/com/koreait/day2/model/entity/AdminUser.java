// DB연결은 application.yml, application.properties, build.gradle의 dependencies에서 연결시켜줌
// annotation은 적용하고자 하는 것 바로 위에 써줌

package com.koreait.day2.model.entity;

        import lombok.AllArgsConstructor;
        import lombok.Builder;
        import lombok.Data;
        import lombok.NoArgsConstructor;

        import javax.persistence.*;
        import java.time.LocalDateTime;


// Lombok을 설치했기 때문에 가상으로 getter, setter을 만들어줌
@Data

// constructor을 사용할 수 있에 해줌
@AllArgsConstructor
@NoArgsConstructor

// JPA를 이용해서 class 이름과 동일한 table하고(camel 표기법으로 admin_user테이블과 연결시켜줌) 필드를 DB에 연결시켜줌
@Entity

// sequence와 연결하기 위해
@SequenceGenerator(
        name="seq_user",            // 직접 이름 짓기
        sequenceName = "seq_user",  // 오라클에 있는 sequence이름과 동일해야함
        initialValue = 1,           // 초기 value값
        allocationSize = 1          // size 1씩 증가
)

// 메소드체이닝을 사용할 수 있게 만들어줌 (...)연결해서 사용할 수 있게 annotation을 추가
@Builder
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user") // 20(name="seq_user")줄과 generator="seq_user"에 주는 이름이 같아야함
    private Long id;       // 일련번호
    private String userid; // 아이디
    private String userpw; // 비밀번호
    private String name;   // 이름
    private String status; // 상태
    private LocalDateTime lastLoginAt; // 마지막 접속시간
    private LocalDateTime regDate; // 가입날짜

}