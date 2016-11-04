/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadeTest;

import br.entidade.Chamado;
import br.entidade.ClienteEmpresa;
import br.entidade.Empresa;
import br.entidade.Pessoa;
import br.entidade.Tecnico;
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
public class ChamadoTest {

    @Test
    public void cadastrarChamadoTest() {
        Empresa emp = new Empresa(1000, "Mackenzie");
        Pessoa p1 = new Pessoa("Lucas", 123456789);
        Tecnico t1 = new Tecnico("Fernanda", 987654321);
        ClienteEmpresa ce1 = new ClienteEmpresa(123, emp, 1351848, p1.getNome(), p1.getTelefone());
        Chamado ch = new Chamado(ce1.getCodigo(), "Problema", "Problema tecnicos na internet", 5, t1, ce1, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");

        assertEquals("Problema", ch.getTitulo());
        assertEquals("Problema tecnicos na internet", ch.getDescricao());
        assertEquals(5, ch.getPrioridade());
        assertEquals("WINDOWS", ch.getSistemaOperacional());
        assertEquals("VISTA", ch.getVersaoSO());
        assertEquals("ADSL", ch.getTipoConexao());
        assertEquals("192.168.2.1", ch.getEnderecoRede());

    }

    @Test
    public void editarChamadoTest() {
        Empresa emp2 = new Empresa(1000, "Mackenzie2");
        Pessoa p2 = new Pessoa("Renan", 2222222);
        Tecnico t2 = new Tecnico("Julia", 333333);
        ClienteEmpresa ce2 = new ClienteEmpresa(456, emp2, 1351848, p2.getNome(), p2.getTelefone());
        Chamado ch2 = new Chamado(ce2.getCodigo(), "Problema", "Problema tecnicos na internet", 5, t2, ce2, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");

        ch2.setTitulo("Solução");
        ch2.setDescricao("Problema nos cabos de comunicação");
        ch2.setPrioridade(7);
        ch2.setSistemaOperacional("MACOS");
        ch2.setVersaoSO("El Captain");
        ch2.setTipoConexao("Radio");
        ch2.setEnderecoRede("192.456.3.2");
        assertNotSame("Problema", ch2.getTitulo());
        assertNotSame("Problema tecnicos na internet", ch2.getDescricao());
        assertNotSame(5, ch2.getPrioridade());
        assertNotSame("WINDOWS", ch2.getSistemaOperacional());
        assertNotSame("VISTA", ch2.getVersaoSO());
        assertNotSame("ADSL", ch2.getTipoConexao());
        assertNotSame("192.168.2.1", ch2.getTipoConexao());

    }
}
