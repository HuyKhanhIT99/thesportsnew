package com.thesportsnew.thesportsnew.service.impl;


import com.thesportsnew.thesportsnew.converter.RoleConverter;
import com.thesportsnew.thesportsnew.dto.RoleDTO;
import com.thesportsnew.thesportsnew.entity.RoleEntity;
import com.thesportsnew.thesportsnew.repository.RoleRepository;
import com.thesportsnew.thesportsnew.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private RoleRepository repo;
    @Autowired
    private RoleConverter roleConverter;

    @Override
    public RoleDTO saveOrUpdate(RoleDTO model) {
        if(model.getId()==0){
            RoleEntity entity =roleConverter.toEntity(model);
            model = roleConverter.toDTO(repo.save(entity));
        }
        else{
            Optional<RoleEntity> oldEntity = repo.findById(model.getId());

            RoleEntity entity =roleConverter.toEntity(model,oldEntity.get());
            model = roleConverter.toDTO(repo.save(entity));
        }
        return model;

    }
    @Override
    public List<RoleDTO> getRole() {
        RoleDTO dto = new RoleDTO();
        List<RoleEntity> roles = repo.findAll();

        if(roles.size()>0){
            for (RoleEntity item: roles) {
                RoleDTO dtoItem = roleConverter.toDTO(item);
                dto.getLists().add(dtoItem);
            }
        }else dto.setLists(null);
        return dto.getLists();
    }



}
