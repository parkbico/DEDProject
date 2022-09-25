package com.ded.admin.domain.csQna;

import com.ded.admin.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
//Entity :  테이블과 링크될 클래스임을 나타냄
//기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍(_) 으로 테이블 이름을 매칭함
// SalesManager.java -> sales_manager table
//public class BoardQna extends BaseTimeEntity {
public class BoardQna {
    //Posts 클래스는 실제 DB의 테이블과 매칭될 클래스이며 보통 Entity 클래스라고 합니다.
    //JPA를 사용하면 DB데이터에 작업할 경우 실제 쿼리를 날리기보다는, 이 Entity 클래스의 수정을 통해 작업합니다.

    @Id //해당 테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성 규칙을 나타냄
    //스프링부터 2.0에서는 이 옵션을 추가해야만 auto_increment가 된다.
    private Long qnaSeq;
    private int category;

    @Column(length = 500, nullable = false) //테이블의 컬럼을 나타내며 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 칼럼이 됩니다.
    //사용 이유 : 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용
    private String title;

    @Column(length = 500, columnDefinition = "TEXT" , nullable = false)
    private String content;

    private int status;
    private int fileYn;

    private String registerUser;
    private LocalDateTime registerDate;

    private int answerStatus; //status 로 함께 사용 , 생성은 해두나 개발 시 사용하지 않겠음
    private String answerContent;
    private String answerUser;
    private LocalDateTime answerDate;




    @Builder //해당 클래스의 빌더 패턴 클래스를 생성
    // 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public BoardQna(int category , String title, String content , int status , int fileYn
            , String registerUser , LocalDateTime registerDate
            , int answerStatus , String answerContent , String answerUser , LocalDateTime answerDate){
        this.category = category;
        this.title = title;
        this.content = content;
        this.status = status;
        this.fileYn = fileYn;
        this.registerUser = registerUser;
        this.registerDate = registerDate;

        this.answerStatus = answerStatus;
        this.answerContent = answerContent;
        this.answerUser = answerUser;
        this.answerDate = answerDate;
    }
//
    public void update(int status  , String answerContent , String answerUser , LocalDateTime answerDate){
        //관리자가 답변 달았을때의 업데이트
        this.status = status;
        this.answerContent = answerContent;
        this.answerUser = answerUser;
        this.answerDate = answerDate;
    }

}
