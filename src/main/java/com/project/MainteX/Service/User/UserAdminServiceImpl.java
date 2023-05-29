package com.project.MainteX.Service.User;

import com.project.MainteX.Repository.UserRepository;
import com.project.MainteX.app.model.UserDTO;
import com.project.MainteX.app.model.UserRequestDTO;

import java.util.List;
import java.util.Optional;

public class UserAdminServiceImpl implements UserAdminService {
    private UserRepository userRepository;
    public UserAdminServiceImpl(UserRepository theUserRepository) {
        userRepository = theUserRepository;
    }

    @Override
    public List<UserDTO> getAll() throws RuntimeException {
        return null;
    }

    @Override
    public UserDTO get(Long id) throws RuntimeException {
        return null;
    }

    @Override
    public UserDTO create(UserRequestDTO element) throws RuntimeException {
        return null;
    }

    @Override
    public UserDTO update(UserDTO element) throws RuntimeException {
        return null;
    }

    @Override
    public void delete(Long id) throws RuntimeException {

    }

    @Override
    public Optional<UserDTO> findByUsername(String username) {
        return Optional.empty();
    }
}
