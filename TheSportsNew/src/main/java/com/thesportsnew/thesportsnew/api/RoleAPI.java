package com.thesportsnew.thesportsnew.api;

import com.thesportsnew.thesportsnew.dto.RoleDTO;
import com.thesportsnew.thesportsnew.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleAPI {
    @Autowired
    private IRoleService iRoleService;
    @GetMapping("/role")
    public List<RoleDTO> getRole(){
        return iRoleService.getRole();
    }
    @PostMapping("/role")
    public RoleDTO createRole(@RequestBody RoleDTO role){
        return iRoleService.saveOrUpdate(role);
    }
    @PutMapping(value = "/role/{id}")
    public RoleDTO updateRole(@RequestBody RoleDTO roleDTO , @PathVariable("id") long id){
        roleDTO.setId(id);
        return iRoleService.saveOrUpdate(roleDTO);
    }
}
