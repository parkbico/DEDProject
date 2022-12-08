package com.ded.admin.domain.mainFile;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
//@Table(name="tb_content_main_file")
@Entity
public class MainFile {
    //파일 시퀀스
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fSeq;

    //FK로 쓸 메인데이터의 PK
    private int cId;
    //저장경로
    private String savePath;
    //저장 파일명
    private String saveName;
    //원본 파일명
    private String originalName;
    //파일 확장자
    private String extension;

    @Builder
    public MainFile(int fSeq , int cId , String savePath , String saveName , String originalName , String extension){
        this.fSeq = fSeq;
        this.cId = cId;
        this.savePath = savePath;
        this.saveName = saveName;
        this.originalName = originalName;
        this.extension = extension;
    }
}
