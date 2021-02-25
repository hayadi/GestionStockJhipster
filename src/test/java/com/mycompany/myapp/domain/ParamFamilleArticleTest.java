package com.mycompany.myapp.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.mycompany.myapp.web.rest.TestUtil;

public class ParamFamilleArticleTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ParamFamilleArticle.class);
        ParamFamilleArticle paramFamilleArticle1 = new ParamFamilleArticle();
        paramFamilleArticle1.setId(1L);
        ParamFamilleArticle paramFamilleArticle2 = new ParamFamilleArticle();
        paramFamilleArticle2.setId(paramFamilleArticle1.getId());
        assertThat(paramFamilleArticle1).isEqualTo(paramFamilleArticle2);
        paramFamilleArticle2.setId(2L);
        assertThat(paramFamilleArticle1).isNotEqualTo(paramFamilleArticle2);
        paramFamilleArticle1.setId(null);
        assertThat(paramFamilleArticle1).isNotEqualTo(paramFamilleArticle2);
    }
}
