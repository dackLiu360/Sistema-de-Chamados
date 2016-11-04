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
import br.entidade.RegistroChamado;
import br.entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31437974
 */
public class RegistroChamadoTest {

    @Test
    public void CadastroRegistroChamadoTest() {
        Empresa emp = new Empresa(1000, "Mackenzie");
        Pessoa p1 = new Pessoa("Lucas", 12345786);
        Tecnico t1 = new Tecnico("Renato", 12354789);
        ClienteEmpresa ce1 = new ClienteEmpresa(456, emp, 1351848, p1.getNome(), p1.getTelefone());
        Chamado ch = new Chamado(ce1.getCodigo(), "Problema", "Problema tecnicos na internet", 5, t1, ce1, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");
        RegistroChamado rc = new RegistroChamado("Defeitos na rede", ch, t1);
        assertEquals("Defeitos na rede", rc.getAssunto());
    }

    @Test
    public void editarRegistroChamadoTest() {
        Empresa emp2 = new Empresa(1000, "Mackenzie2");
        Pessoa p2 = new Pessoa("Leonardo", 7897547);
        Tecnico t2 = new Tecnico("Alfonso", 54548787);
        ClienteEmpresa ce2 = new ClienteEmpresa(456, emp2, 1351848, p2.getNome(), p2.getTelefone());
        Chamado ch2 = new Chamado(ce2.getCodigo(), "Problema2", "Problema tecnicos na internet2", 5, t2, ce2, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");
        RegistroChamado rc = new RegistroChamado("Defeitos na rede", ch2, t2);
        rc.setAssunto("Assunto alterado");
        assertNotSame("Defeitos na rede",rc.getAssunto());
    }
    
    
   
    
}
