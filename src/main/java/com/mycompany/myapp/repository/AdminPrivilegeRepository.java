package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.AdminPrivilege;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the AdminPrivilege entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AdminPrivilegeRepository extends JpaRepository<AdminPrivilege, Long> {
}
