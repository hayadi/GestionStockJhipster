package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ParamClient;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ParamClient entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ParamClientRepository extends JpaRepository<ParamClient, Long> {
}
