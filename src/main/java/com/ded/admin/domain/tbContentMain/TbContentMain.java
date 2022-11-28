package com.ded.admin.domain.tbContentMain;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
//@NoArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class TbContentMain {
    //테이블 PK - 자동증가 처리함
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cSeq;

    //메인 컨텐츠이기 때문에 고유 ID 갖고있음
    private String cId;
    //컨텐츠 이름
    private String name;
    //컨테츠 설명
    private String explanation;
    //컨텐츠 작가
    private String author;
    //컨텐츠 카테고리1
    private int category1;
    //컨텐츠 카테고리2
    private int category2;
    //생성일
    private String createDate;
    //수정일
    private String updateDate;

    @Builder
    public TbContentMain(int cSeq , String name ,  String explanation , String author ,
                         int category1 , int category2 , String createDate , String updateDate){
        this.cSeq = cSeq;
        this.name = name;
        this.explanation = explanation;
        this.author = author;
        this.category1 = category1;
        this.category2 = category2;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

}
