package com.mycompany.myapp.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.mycompany.myapp.web.rest.TestUtil;

public class AdminEmployeTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdminEmploye.class);
        AdminEmploye adminEmploye1 = new AdminEmploye();
        adminEmploye1.setId(1L);
        AdminEmploye adminEmploye2 = new AdminEmploye();
        adminEmploye2.setId(adminEmploye1.getId());
        assertThat(adminEmploye1).isEqualTo(adminEmploye2);
        adminEmploye2.setId(2L);
        assertThat(adminEmploye1).isNotEqualTo(adminEmploye2);
        adminEmploye1.setId(null);
        assertThat(adminEmploye1).isNotEqualTo(adminEmploye2);
    }
}
