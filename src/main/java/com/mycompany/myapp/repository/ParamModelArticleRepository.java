package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ParamModelArticle;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ParamModelArticle entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ParamModelArticleRepository extends JpaRepository<ParamModelArticle, Long> {
}
