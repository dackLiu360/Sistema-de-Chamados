/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleTest;

import br.controle.ControleTecnicos;
import br.entidade.Tecnico;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author DackLiu360
 */
public class ControleTecnicoTest {


    /*
    *Teste responsável por inserir um técnico.
    *Para sucesso, o nome e o telefone que foi informado para criação deverá ser o que foi guardado.
    */    
    @Test
    public void inserirTecnicoTest() {
        ControleTecnicos ct = new ControleTecnicos();
        Tecnico tc = new Tecnico("Lucas", 31437974);
        Tecnico insert = ct.inserir(tc.getTelefone(), tc.getNome());
        assertTrue(((tc.getTelefone() == insert.getTelefone())) && (tc.getNome().equals(insert.getNome())));

    }

}
