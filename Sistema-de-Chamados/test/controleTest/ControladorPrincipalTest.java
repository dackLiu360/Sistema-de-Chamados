/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleTest;

import br.controle.ControladorPrincipal;
import junit.framework.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author DackLiu360
 */
public class ControladorPrincipalTest {

    @Test
    public void incializacaoTest() {
        ControladorPrincipal ct = new ControladorPrincipal();
        assertNotNull(ct.getCtrChamados());
        assertNotNull(ct.getCtrClientes());
        assertNotNull(ct.getCtrEmpresa());
        assertNotNull(ct.getCtrTecnicos());
        
    }
}
