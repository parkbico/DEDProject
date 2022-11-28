package com.ded.admin.web.dto.tbContentMainDto;

import com.ded.admin.domain.tbContentMain.TbContentMain;
import lombok.Getter;

@Getter
public class TbContentMainListResponseDto {
    private int cSeq;
    private String name;

    public TbContentMainListResponseDto(TbContentMain entity){
        this.cSeq = entity.getCSeq();
        this.name = entity.getName();
    }
}
