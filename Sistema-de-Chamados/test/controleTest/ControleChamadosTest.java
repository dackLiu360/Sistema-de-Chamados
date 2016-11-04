/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleTest;

import br.persistencia.ChamadoDAO;
import br.controle.ControleChamados;
import br.entidade.BancoDeDados;
import br.entidade.Chamado;
import br.entidade.ClienteEmpresa;
import br.entidade.Empresa;
import br.entidade.RegistroChamado;
import br.entidade.SistemaOperacional;
import br.entidade.Status;
import br.entidade.Tecnico;
import br.entidade.TipoConexao;
import br.entidade.TipoProblema;
import java.util.Collection;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author DackLiu360
 */
public class ControleChamadosTest {

    @Test
    public void inserirChamadoRedeTest() {

        Chamado chamado = new Chamado(3, "Problema no Modem", "O Modem não liga", 5, (new Tecnico("João da Silva", 44587896L)), (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), SistemaOperacional.WINDOWS + "", "10", TipoConexao.ADSL + "", "19216801");
        ControleChamados ct = new ControleChamados();
        chamado = ct.InserirChamadoRede(chamado.getTitulo(), chamado.getDescricao(), chamado.getPrioridade(), chamado.getTecnico(), chamado.getCliente(), chamado.getSistemaOperacional(), chamado.getVersaoSO(), chamado.getTipoConexao(), chamado.getEnderecoRede());
        Chamado chamadoInserido = ct.buscaPeloCodigo(chamado.getCodigo());
        Assert.assertTrue((chamado.getTitulo().equals(chamadoInserido.getTitulo())) && (chamado.getDescricao().equals(chamadoInserido.getDescricao())) && (chamado.getPrioridade() == chamadoInserido.getPrioridade()) && ((chamado.getTecnico().getNome().equals(chamadoInserido.getTecnico().getNome())) && (chamado.getTecnico().getTelefone() == chamadoInserido.getTecnico().getTelefone())) && (chamado.getCliente().getCpf() == chamadoInserido.getCliente().getCpf()) && (chamado.getSistemaOperacional().equals(chamadoInserido.getSistemaOperacional())) && (chamado.getVersaoSO().equals(chamadoInserido.getVersaoSO())) && (chamado.getTipoConexao().equals(chamadoInserido.getTipoConexao())) && (chamado.getEnderecoRede().equals(chamadoInserido.getEnderecoRede())));
    }

    @Test
    public void inserirChamadoBancoDeDadosTest() {
        Chamado chamado = new Chamado("Tabela Inexistente", "Os responsáveis pela criação das tabelas, esqueceram uma ", 8, (new Tecnico("Júlio da Silva", 44547896L)), (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), "Windows", "10", BancoDeDados.MySql + "");
        ControleChamados ct = new ControleChamados();
        chamado = ct.InserirChamadoBancoDeDados(chamado.getTitulo(), chamado.getDescricao(), chamado.getPrioridade(), chamado.getTecnico(), chamado.getCliente(), chamado.getSistemaOperacional(), chamado.getVersaoSO(), chamado.getBancoDeDados());
        Chamado chamadoInserido = ct.buscaPeloCodigo(chamado.getCodigo());
        Assert.assertTrue((chamado.getTitulo().equals(chamadoInserido.getTitulo())) && (chamado.getDescricao().equals(chamadoInserido.getDescricao())) && (chamado.getPrioridade() == chamadoInserido.getPrioridade()) && ((chamado.getTecnico().getNome().equals(chamadoInserido.getTecnico().getNome())) && (chamado.getTecnico().getTelefone() == chamadoInserido.getTecnico().getTelefone())) && (chamado.getCliente().getCpf() == chamadoInserido.getCliente().getCpf()) && (chamado.getSistemaOperacional().equals(chamadoInserido.getSistemaOperacional())) && (chamado.getVersaoSO().equals(chamadoInserido.getVersaoSO())) && (chamado.getBancoDeDados().equals(chamadoInserido.getBancoDeDados())));
    }

    @Test
    public void inserirChamadoDesempenhoTest() {
        Chamado chamado = new Chamado("Tela Azul", "Ao abrir o Internet Explorer o computador exibe a tela azul da morte  ", 9, (new Tecnico("Júlio da Silva", 44547896L)), (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), "Windows", "10", "Abrir Internet Explorer", 10);
        ControleChamados ct = new ControleChamados();
        chamado = ct.InserirChamadoDesempenho(chamado.getTitulo(), chamado.getDescricao(), chamado.getPrioridade(), chamado.getTecnico(), chamado.getCliente(), chamado.getSistemaOperacional(), chamado.getVersaoSO(), chamado.getOperacao(), chamado.getDuracaoOperacao());
        Chamado chamadoInserido = ct.buscaPeloCodigo(chamado.getCodigo());
        Assert.assertTrue((chamado.getTitulo().equals(chamadoInserido.getTitulo())) && (chamado.getDescricao().equals(chamadoInserido.getDescricao())) && (chamado.getPrioridade() == chamadoInserido.getPrioridade()) && ((chamado.getTecnico().getNome().equals(chamadoInserido.getTecnico().getNome())) && (chamado.getTecnico().getTelefone() == chamadoInserido.getTecnico().getTelefone())) && (chamado.getCliente().getCpf() == chamadoInserido.getCliente().getCpf()) && (chamado.getSistemaOperacional().equals(chamadoInserido.getSistemaOperacional())) && (chamado.getVersaoSO().equals(chamadoInserido.getVersaoSO())) && (chamado.getOperacao().equals(chamadoInserido.getOperacao())) && (chamado.getDuracaoOperacao() == chamadoInserido.getDuracaoOperacao()));
    }
    
    @Test
    public void alterarChamadoTest() {
        Chamado chamado = new Chamado("Tabela Inexistente", "Os responsáveis pela criação das tabelas, esqueceram uma ", 8, (new Tecnico("João da Silva", 44587896L)), (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), "Windows", "10", BancoDeDados.MySql + "");
        ControleChamados ct = new ControleChamados();
        chamado = ct.InserirChamadoBancoDeDados(chamado.getTitulo(), chamado.getDescricao(), chamado.getPrioridade(), chamado.getTecnico(), chamado.getCliente(), chamado.getSistemaOperacional(), chamado.getVersaoSO(), chamado.getBancoDeDados());
        ct.alterarChamado(chamado, Status.encerrado + "", "O responsável pela criação da tabela de fato esqueceu de criar a tabela Videogames, do sistema", "Atualização do script de geração do banco de dados");
        assertEquals(chamado.getStatus(),"encerrado" );
        assertEquals(chamado.getCausaProblema(),"O responsável pela criação da tabela de fato esqueceu de criar a tabela Videogames, do sistema");
        assertEquals(chamado.getSolucaoProblema(),"Atualização do script de geração do banco de dados");
    }

}
