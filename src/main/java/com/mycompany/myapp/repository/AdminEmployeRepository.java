package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.AdminEmploye;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the AdminEmploye entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AdminEmployeRepository extends JpaRepository<AdminEmploye, Long> {
}
