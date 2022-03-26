package com.thesportsnew.thesportsnew.service;

import com.thesportsnew.thesportsnew.dto.RoleDTO;

import java.util.List;

public interface IRoleService  {
    RoleDTO saveOrUpdate(RoleDTO model);
    List<RoleDTO> getRole();
}
