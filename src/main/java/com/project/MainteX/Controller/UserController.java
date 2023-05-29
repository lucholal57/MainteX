package com.project.MainteX.Controller;

import com.project.MainteX.Service.User.UserAdminService;
import com.project.MainteX.app.api.UsersApiDelegate;
import com.project.MainteX.app.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

public class UserController implements UsersApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private UserAdminService userAdminService;

    public UserController(UserAdminService theUserAdminService) {
        userAdminService = theUserAdminService;

    }

    @Override
    public ResponseEntity<UserResponseContainerDTO> createUser(UserRequestDTO userRequestDTO) {
        return UsersApiDelegate.super.createUser(userRequestDTO);
    }

    @Override
    public ResponseEntity<EmptyResponseDTO> deleteUser(Long userId) {
        return UsersApiDelegate.super.deleteUser(userId);
    }

    @Override
    public ResponseEntity<UserListResponseContainerDTO> getAllUser() {
        return UsersApiDelegate.super.getAllUser();
    }

    @Override
    public ResponseEntity<UserResponseContainerDTO> getUser(Long userId) {
        return UsersApiDelegate.super.getUser(userId);
    }

    @Override
    public ResponseEntity<UserResponseContainerDTO> updateUser(Long userId, UserDTO userDTO) {
        return UsersApiDelegate.super.updateUser(userId, userDTO);
    }
}
