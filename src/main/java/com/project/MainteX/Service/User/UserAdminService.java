package com.project.MainteX.Service.User;

import com.project.MainteX.Service.CRUD.CrudAdminService;
import com.project.MainteX.app.model.UserDTO;
import com.project.MainteX.app.model.UserRequestDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface UserAdminService extends CrudAdminService<UserDTO, UserRequestDTO,Long> {
    Optional<UserDTO> findByUsername(String username);
}
