package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ParamFamilleArticle;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ParamFamilleArticle entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ParamFamilleArticleRepository extends JpaRepository<ParamFamilleArticle, Long> {
}
