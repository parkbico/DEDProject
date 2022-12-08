package com.ded.admin.service.mainFile;

import com.ded.admin.domain.mainFile.MainFile;
import com.ded.admin.domain.mainFile.MainFileRepository;
import com.ded.admin.web.dto.PostsSaveRequestDto;
import com.ded.admin.web.dto.mainFileDto.MainFileDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MainFileService {
    private MainFileRepository mainFileRepository;


    public void save(MainFileDto mainFileDto){


    }

}
