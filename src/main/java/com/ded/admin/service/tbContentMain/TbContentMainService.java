package com.ded.admin.service.tbContentMain;

import com.ded.admin.domain.tbContentMain.TbContentMainRepository;
import com.ded.admin.web.dto.PostsListResponseDto;
import com.ded.admin.web.dto.tbContentMainDto.TbContentMainListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TbContentMainService {
    private final TbContentMainRepository tbContentMainRepository;

    @Transactional(readOnly = true)
    public List<TbContentMainListResponseDto> findAllDesc() {
        return tbContentMainRepository.findAll().stream()
                .map(TbContentMainListResponseDto::new)
                .collect(Collectors.toList());
    }


}
