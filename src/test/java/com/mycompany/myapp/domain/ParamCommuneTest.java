package com.mycompany.myapp.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.mycompany.myapp.web.rest.TestUtil;

public class ParamCommuneTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ParamCommune.class);
        ParamCommune paramCommune1 = new ParamCommune();
        paramCommune1.setId(1L);
        ParamCommune paramCommune2 = new ParamCommune();
        paramCommune2.setId(paramCommune1.getId());
        assertThat(paramCommune1).isEqualTo(paramCommune2);
        paramCommune2.setId(2L);
        assertThat(paramCommune1).isNotEqualTo(paramCommune2);
        paramCommune1.setId(null);
        assertThat(paramCommune1).isNotEqualTo(paramCommune2);
    }
}
