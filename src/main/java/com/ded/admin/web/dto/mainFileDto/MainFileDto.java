package com.ded.admin.web.dto.mainFileDto;

import com.ded.admin.domain.mainFile.MainFile;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MainFileDto {
    private int fSeq;
    private String savePath;
    private String saveName;
    private String originalName;
    private String extension;

    @Builder
    public MainFileDto(int fSeq , String savePath , String saveName , String originalName , String extension){
        this.fSeq = fSeq;
        this.savePath = savePath;
        this.saveName = saveName;
        this.originalName = originalName;
        this.extension = extension;
    }

    public MainFile toEntity(){
        return MainFile.builder().fSeq(fSeq).savePath(savePath).saveName(saveName).originalName(originalName).extension(extension).build();
    }

}
