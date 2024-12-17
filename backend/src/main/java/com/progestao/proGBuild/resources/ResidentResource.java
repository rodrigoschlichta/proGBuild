package com.progestao.proGBuild.resources;

import com.progestao.proGBuild.entities.ResidentEntity;
import com.progestao.proGBuild.services.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/residents")
public class ResidentResource {

    @Autowired
    private ResidentService residentService;

    @GetMapping
    public List<ResidentEntity> findAll(){
        return residentService.findAll();
    }

    @GetMapping("/{id}")
    public ResidentEntity findById(@PathVariable Long id) {
        return residentService.findById(id);
    }

}
