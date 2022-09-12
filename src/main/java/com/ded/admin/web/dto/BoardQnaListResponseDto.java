package com.ded.admin.web.dto;

import com.ded.admin.domain.csQna.BoardQna;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardQnaListResponseDto {
    private Long qnaSeq;
    private int catetory;
    private String title;
    private String registerUser;
    private LocalDateTime registerDate;

    public BoardQnaListResponseDto(BoardQna entity) {
        this.qnaSeq = entity.getQnaSeq();
        this.catetory = entity.getCategory();
        this.title = entity.getTitle();
        this.registerUser = entity.getRegisterUser();
        this.registerDate = entity.getRegisterDate();
    }
}
