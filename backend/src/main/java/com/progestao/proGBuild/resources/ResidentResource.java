package com.progestao.proGBuild.resources;

import com.progestao.proGBuild.entities.ResidentEntity;
import com.progestao.proGBuild.services.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResidentEntity insert(@RequestBody ResidentEntity resident) {
        return residentService.save(resident);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        residentService.delete(id);
    }
}
