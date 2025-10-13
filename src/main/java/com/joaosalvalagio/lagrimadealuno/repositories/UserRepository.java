package com.joaosalvalagio.lagrimadealuno.repositories;

import com.joaosalvalagio.lagrimadealuno.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserDetails findbyLogin(String login);
}