package com.joaosalvalagio.lagrimadealuno.repositories;

import com.joaosalvalagio.lagrimadealuno.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
