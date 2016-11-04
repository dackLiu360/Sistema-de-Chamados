/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadeTest;

import br.entidade.ClienteEmpresa;
import br.entidade.Empresa;
import br.entidade.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31437974
 */
public class ClienteEmpresaTest {

    @Test
    public void cadastrarClienteEmpresatest() {
        Empresa emp = new Empresa(1000, "Mackenzie");
        Pessoa p1 = new Pessoa("Lucas", 1234567);
        ClienteEmpresa ce1 = new ClienteEmpresa(456, emp, 36411351848L, p1.getNome(), p1.getTelefone());
        assertEquals((Integer) 456, ce1.getCodigo());
        assertEquals(1000, emp.getNumeroContrato());
        assertEquals("Mackenzie", emp.getNomeEmpresa());
        assertEquals(36411351848L, ce1.getCpf());
        assertEquals("Lucas", p1.getNome());
        assertEquals(1234567, p1.getTelefone());
    }

    @Test
    public void editaClienteEmpresaTest() {
        Empresa emp2 = new Empresa(1000, "Mackenzie2");
        Pessoa p2 = new Pessoa("Fernando", 222222);
        ClienteEmpresa ce1 = new ClienteEmpresa(456, emp2, 1351848, p2.getNome(), p2.getTelefone());
        ce1.setCpf(1236458);
        ce1.setCodigo(7856);
        assertNotSame(1351848,ce1.getCpf());
        assertNotSame(456,ce1.getCodigo());
        
    }       

}
