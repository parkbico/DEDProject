package com.ded.admin.domain.tbContentMain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TbContentMainRepository extends JpaRepository<TbContentMain, Integer> {
    //TbContentMain 클래스로 DB를 접근하게 해줄 레포지토리
    //기본적인 CRUD 메소드가 자동으로 생성


}
