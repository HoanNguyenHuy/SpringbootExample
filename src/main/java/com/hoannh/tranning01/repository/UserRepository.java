package com.hoannh.tranning01.repository;

import com.hoannh.tranning01.model.User;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface UserRepository extends CrudRepository<User, Long> {
    User findById(long id);
    List<User> findByAndGroupId(long groupId);
    User findByIdentityNumber(String identityNumber);
}
