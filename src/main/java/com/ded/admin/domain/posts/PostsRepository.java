package com.ded.admin.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts , Long> {
    //Posts 클래스로 Database를 접근하게 해줄 Repository
    //보통 Dao 라고 불리는 DB Layer 접근자
    //JPA 에서는 Repository 라고 부르며 인터페이스로 생성
    //인터페이스 생성 후 JpaRepository< Entity 클래스 , PK 타입 > 을 상속하면 기본적인 CRUD 메소드가 자동으로 생성됨
    //주의할점 : Entity 클래스와 기본 Entity Repository 는 함께 위치해야 한다.
    //Entity 클래스는 기본 Repository 없이는 제대로 역할을 할 수가 없음.


    //SpringdataJpa에서 제공하지 않는 메소드는 쿼리로 작성해도 된다
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
