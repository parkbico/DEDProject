package com.ded.admin.web.dto;

import com.ded.admin.domain.csQna.BoardQna;
import com.ded.admin.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardQnaResponseDto {
    private Long qnaSeq;
    private int category;
    private String title;
    private String content;
    private int status;
    private int fileYn;
    private String registerUser;
    private LocalDateTime registerDate;

    public BoardQnaResponseDto(BoardQna entity){
        //Entity의 필트 중 일부만 사용하므로, 생성자로 Entity 를 받아 필드에 값을 넣는다. 
        // 굳이 모든 필드를 가진 생성자가 필요하진 않으므로 Dto는 Entity를 받아 처리
        this.qnaSeq = entity.getQnaSeq();
        this.category = entity.getCategory();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.status = entity.getStatus();
        this.fileYn = entity.getFileYn();
        this.registerUser = entity.getRegisterUser();
        this.registerDate = entity.getRegisterDate();
    }
    
}
