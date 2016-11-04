/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadeTest;

import br.entidade.Pessoa;
import br.entidade.Tecnico;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31437974
 */
public class TecnicoTest {
    
    @Test
    public void cadastrarTecnicoTest() {
        Pessoa t1 = new Tecnico("Lucas",87854757);
        assertEquals("Lucas", t1.getNome());
        assertEquals(87854757, t1.getTelefone());
    }
    @Test
    public void editarTecnicoTest(){
        Pessoa t2 = new Tecnico("Lucas2",87574785);
        t2.setNome("Raul");
        t2.setTelefone(47581530);
        assertNotSame("Lucas2", t2.getNome());
        assertNotSame(87574785, t2.getTelefone());
    }
    
    

    
}
