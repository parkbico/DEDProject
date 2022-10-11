package com.ded.admin.web.dto;

import com.ded.admin.domain.csQna.BoardQna;
import com.ded.admin.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class BoardQnaSaveRequestDto {
    private int category;
    private String title;
    private String content;
    private int status;
    private int fileYn;
    private String registerUser;
    //private LocalDateTime registerDate;


    @Builder
    public BoardQnaSaveRequestDto(
            int category, String title, String content
          , int status , int fileYn ,  String registerUser){
        this.category = category;
        this.title = title;
        this.content = content;
        this.status = status;
        this.fileYn = fileYn;
        this.registerUser = registerUser;
    }

    public BoardQna toEntity(){
        return BoardQna.builder()
                .category(category).title(title).content(content)
                .status(status).fileYn(fileYn).registerUser(registerUser).build();
    }

}
