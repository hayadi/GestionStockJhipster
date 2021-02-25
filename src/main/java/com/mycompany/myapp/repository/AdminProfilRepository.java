package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.AdminProfil;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the AdminProfil entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AdminProfilRepository extends JpaRepository<AdminProfil, Long> {
}
