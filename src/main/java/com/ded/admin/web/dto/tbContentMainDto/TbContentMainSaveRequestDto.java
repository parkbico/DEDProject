package com.ded.admin.web.dto.tbContentMainDto;

import com.ded.admin.domain.tbContentMain.TbContentMain;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TbContentMainSaveRequestDto {
    private String name;
    private String author;

    @Builder
    public TbContentMainSaveRequestDto(String name , String author){
        this.name = name;
        this.author = author;
    }

    public TbContentMain toEntity(){
        return TbContentMain.builder().name(name).author(author).build();
    }

}
