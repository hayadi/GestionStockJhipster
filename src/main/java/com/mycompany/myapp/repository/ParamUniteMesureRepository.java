package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ParamUniteMesure;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ParamUniteMesure entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ParamUniteMesureRepository extends JpaRepository<ParamUniteMesure, Long> {
}
