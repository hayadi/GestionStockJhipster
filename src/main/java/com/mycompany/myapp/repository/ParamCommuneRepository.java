package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ParamCommune;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ParamCommune entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ParamCommuneRepository extends JpaRepository<ParamCommune, Long> {
}
