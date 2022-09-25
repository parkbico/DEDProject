package com.ded.admin.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class BoardQnaUpdateRequestDto {
    private int status;
    private String answerContent;
    private String answerUser;
    private LocalDateTime answerDate;

    @Builder
    public BoardQnaUpdateRequestDto(int status, String answerContent , String answerUser , LocalDateTime answerDate ){
        this.status = status;
        this.answerContent = answerContent;
        this.answerUser = answerUser;
        this.answerDate = answerDate;
    }

}
