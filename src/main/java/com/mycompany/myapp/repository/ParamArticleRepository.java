package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ParamArticle;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ParamArticle entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ParamArticleRepository extends JpaRepository<ParamArticle, Long> {
}
