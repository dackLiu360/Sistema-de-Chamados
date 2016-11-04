/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleTest;

import br.persistencia.ClienteDAO;
import br.controle.ControleClientes;
import br.entidade.ClienteEmpresa;
import br.entidade.Empresa;
import java.util.Objects;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author DackLiu360
 */
public class ControleClientesTest {

    /**
     *Teste responsável por inserir um novo cliente
     *Para sucesso, o nome e o cpf que foi informado para criação deverá ser o que foi guardado.
     */
    @Test
    public void inserirNovoClienteTest() {
        ControleClientes ct = new ControleClientes();
        ClienteEmpresa inserted = ct.incluiNovoCliente((new Empresa(894240, "Tim")), 1445110526, "Renato", 9843232);
        ClienteDAO clientedao = ct.getClienteDAO();
        ClienteEmpresa cliente = clientedao.get(Long.parseLong("1445110526"));
        Assert.assertTrue(((cliente.getCpf() == inserted.getCpf()) && (cliente.getNome().equals(inserted.getNome())) && (cliente.getEmpresa() == inserted.getEmpresa()) && (cliente.getTelefone() == inserted.getTelefone())) && (Objects.equals(cliente.getCodigo(), inserted.getCodigo())));
    }

    /**
     *
     */
    @Test
    public void atualizarClienteTest() {
        ControleClientes ct = new ControleClientes();
        ct.incluiNovoCliente((new Empresa(123560, "Anatel")), 1445110526, "Renato", 44536651);
        ClienteEmpresa inserted2 = ct.incluiNovoCliente((new Empresa(123560, "Anatel")), 1445110526, "Jamil", 44536651);
        ClienteEmpresa cliente = ct.getClienteDAO().voltaCashCliente().get(inserted2.getCpf());
        assertEquals(inserted2.toString(),cliente.toString());
    }

    /**
     *Teste responsável por remover um cliente
     *Para sucesso, o teste deverá validar se o cliente criado foi excluido.
     */
    @Test
    public void removerClienteTest(){
        ControleClientes ct = new ControleClientes();
        ClienteEmpresa inserted = ct.incluiNovoCliente((new Empresa(12340560, "Mackenzie")), 1445110406, "Luigi", 44532151);
        ct.getClienteDAO().voltaCashCliente().remove(inserted.getCpf());
        Assert.assertNull(ct.getClienteDAO().voltaCashCliente().get(inserted.getCpf()));
    }
}
