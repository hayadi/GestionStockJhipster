package com.mycompany.myapp.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.mycompany.myapp.web.rest.TestUtil;

public class ParamFournisseurTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ParamFournisseur.class);
        ParamFournisseur paramFournisseur1 = new ParamFournisseur();
        paramFournisseur1.setId(1L);
        ParamFournisseur paramFournisseur2 = new ParamFournisseur();
        paramFournisseur2.setId(paramFournisseur1.getId());
        assertThat(paramFournisseur1).isEqualTo(paramFournisseur2);
        paramFournisseur2.setId(2L);
        assertThat(paramFournisseur1).isNotEqualTo(paramFournisseur2);
        paramFournisseur1.setId(null);
        assertThat(paramFournisseur1).isNotEqualTo(paramFournisseur2);
    }
}
