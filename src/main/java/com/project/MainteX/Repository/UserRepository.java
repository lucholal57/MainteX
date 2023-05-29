package com.project.MainteX.Repository;

import com.project.MainteX.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity,Long> {
    Optional<UserEntity> findOneByUsername(String username);
}
