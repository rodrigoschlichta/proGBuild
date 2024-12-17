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

    public ResidentEntity findById(Long id) {
        return residentRepository.findById(id).orElse(null);
    }

    public ResidentEntity save(ResidentEntity resident) {
        return residentRepository.save(resident);
    }

    public void delete(Long id) {
        residentRepository.deleteById(id);
    }
}
