package com.mycompany.myapp.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.mycompany.myapp.web.rest.TestUtil;

public class ParamUniteMesureTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ParamUniteMesure.class);
        ParamUniteMesure paramUniteMesure1 = new ParamUniteMesure();
        paramUniteMesure1.setId(1L);
        ParamUniteMesure paramUniteMesure2 = new ParamUniteMesure();
        paramUniteMesure2.setId(paramUniteMesure1.getId());
        assertThat(paramUniteMesure1).isEqualTo(paramUniteMesure2);
        paramUniteMesure2.setId(2L);
        assertThat(paramUniteMesure1).isNotEqualTo(paramUniteMesure2);
        paramUniteMesure1.setId(null);
        assertThat(paramUniteMesure1).isNotEqualTo(paramUniteMesure2);
    }
}
