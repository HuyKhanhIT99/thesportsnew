package com.thesportsnew.thesportsnew.converter;

import com.thesportsnew.thesportsnew.dto.RoleDTO;
import com.thesportsnew.thesportsnew.entity.RoleEntity;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter {
    public RoleEntity toEntity(RoleDTO roleDTO){
        RoleEntity entity = new RoleEntity();
        entity.setCode(roleDTO.getCode());
        entity.setName(roleDTO.getName());
        return entity;
    }
    public RoleEntity toEntity(RoleDTO roleDTO , RoleEntity entity){
        entity.setCode(roleDTO.getCode());
        entity.setName(roleDTO.getName());
        return entity;
    }
    public RoleDTO toDTO(RoleEntity entity){
        RoleDTO dto = new RoleDTO();
        if (entity.getId()!=0){
            dto.setId(entity.getId());
        }
        dto.setCode(entity.getCode());
        dto.setName(entity.getName());
        return dto;
    }
}
