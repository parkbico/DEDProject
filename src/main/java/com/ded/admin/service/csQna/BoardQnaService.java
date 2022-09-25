package com.ded.admin.service.csQna;


import com.ded.admin.domain.csQna.BoardQna;
import com.ded.admin.domain.csQna.BoardQnaRepository;
import com.ded.admin.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BoardQnaService {
    private final BoardQnaRepository boardQnaRepository;

    @Transactional
    public Long save(BoardQnaSaveRequestDto requestDto){
        return boardQnaRepository.save(requestDto.toEntity()).getQnaSeq();
    }
//
    @Transactional
    public Long update(Long qnaSeq , BoardQnaUpdateRequestDto requestDto){
        //update 기능에서 쿼리를 날리는 부분이 없습니다.
        // 이게 가능한 이유는 JPA의 영속성 컨텍스트 때문!
        // 영속성 컨텍스트 : 엔티티를 영구 저장하는 환경 -> 개념만 보기
        // JPA 의 핵심 내용은 엔티티가 영속성 컨텍스트에 포함되어 있냐 아냐냐로 갈림
        // JPA 의 엔티티 매니저가 활성화된 상태로 트랜잭션 안에서 데이터베이스에서 데이터를 가져오면 이 데이터는 영속성 컨텍스트가 유지된 상태입니다.
        // (Spring Data Jpa를 쓴다면 활성화 되어있는게 기본 옵션이다)
        // 이 상태에서 해당 데이터의 값을 변경하면 트랜잭션이 끝나는 시점에 해당 테이블에 변경분을 반영한다.
        // 즉, Entity 객체의 값만 변경하면 별도로 update 쿼리를 날릴 필요가 없다는것!
        // 이 개념을 더티 체킹이라고 한다.
        BoardQna boardQna = boardQnaRepository.findById(qnaSeq).orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. qnaSeq="+qnaSeq));

        boardQna.update(requestDto.getStatus() , requestDto.getAnswerContent() , requestDto.getAnswerUser()
                , requestDto.getAnswerDate());

        return qnaSeq;
    }

    public BoardQnaResponseDto findById(Long qnaSeq){
        BoardQna entity = boardQnaRepository.findById(qnaSeq).orElseThrow(()->new IllegalArgumentException("해당 Q&A가 없습니다. qnaSeq="+qnaSeq));

        return new BoardQnaResponseDto(entity);
    }
//
//    @Transactional(readOnly = true)
//    public List<PostsListResponseDto> findAllDesc() {
//        return postsRepository.findAllDesc().stream()
//                .map(PostsListResponseDto::new)
//                .collect(Collectors.toList());
//    }
//
    @Transactional(readOnly = true)
    public List<BoardQnaListResponseDto> findAllAsc() {
        return boardQnaRepository.findAll(Sort.by(Sort.Direction.ASC, "qnaSeq")).stream()
                .map(BoardQnaListResponseDto::new)
                .collect(Collectors.toList());
    }
//
//    @Transactional
//    public void delete (Long id) {
//        Posts posts = postsRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. 없습니다. id=" + id));
//
//        postsRepository.delete(posts);
//    }


}
