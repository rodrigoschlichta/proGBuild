package com.progestao.proGBuild.services;

import com.progestao.proGBuild.entities.ResidentEntity;
import com.progestao.proGBuild.repositories.ResidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentService {

    @Autowired
    private ResidentRepository residentRepository;

    public List<ResidentEntity> findAll(){
        return residentRepository.findAll();
    }
}
