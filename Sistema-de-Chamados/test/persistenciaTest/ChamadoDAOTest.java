/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaTest;

import br.persistencia.ChamadoDAO;
import br.entidade.BancoDeDados;
import br.entidade.Chamado;
import br.entidade.ClienteEmpresa;
import br.entidade.Empresa;
import br.entidade.RegistroChamado;
import br.entidade.SistemaOperacional;
import br.entidade.Tecnico;
import br.entidade.TipoConexao;
import br.entidade.TipoProblema;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 31437974
 */
public class ChamadoDAOTest {

    @Test
    public void inserirChamadoTest() {
        Chamado chamado = new Chamado(3, "Problema no Modem", "O Modem não liga", 5, (new Tecnico("João da Silva", 44587896L)), (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), SistemaOperacional.WINDOWS + "", "10", TipoConexao.ADSL + "", "19216801");
        ChamadoDAO chamadodao = new ChamadoDAO();
        chamadodao.put(chamado);
        Chamado chamadoInserido = chamadodao.get(chamadodao.gerarCodigo() - 1);
        Assert.assertTrue((chamado.getTitulo().equals(chamadoInserido.getTitulo())) && (chamado.getDescricao().equals(chamadoInserido.getDescricao())) && (chamado.getPrioridade() == chamadoInserido.getPrioridade()) && ((chamado.getTecnico().getNome().equals(chamadoInserido.getTecnico().getNome())) && (chamado.getTecnico().getTelefone() == chamadoInserido.getTecnico().getTelefone())) && (chamado.getCliente().getCpf() == chamadoInserido.getCliente().getCpf()) && (chamado.getSistemaOperacional().equals(chamadoInserido.getSistemaOperacional())) && (chamado.getVersaoSO().equals(chamadoInserido.getVersaoSO())) && (chamado.getTipoConexao().equals(chamadoInserido.getTipoConexao())) && (chamado.getEnderecoRede().equals(chamadoInserido.getEnderecoRede())));
    }

    @Test
    public void inserirRegistroChamadoTest() {
        Tecnico tecnico = new Tecnico("Júlio da Silva", 44547896L);
        Chamado chamado = new Chamado("Tabela Inexistente", "Os responsáveis pela criação das tabelas, esqueceram uma ", 8, tecnico, (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), "Windows", "10", BancoDeDados.MySql + "");
        RegistroChamado registro = new RegistroChamado(TipoProblema.ProblemaBancoDeDados + "", chamado, tecnico);
        ChamadoDAO chamadodao = new ChamadoDAO();
        chamadodao.putRegistro(registro);
        Collection<RegistroChamado> registros = chamadodao.getRegistros();
        RegistroChamado inserido = null;
        for (RegistroChamado registro1 : registros) {
            if (registro1.getAssunto().equals(registro.getAssunto())) {
                if ((registro.getTecnico().getTelefone() == registro1.getTecnico().getTelefone()) && (registro.getTecnico().getNome().equals(registro1.getTecnico().getNome()))) {
                    if ((registro.getChamado().getTitulo().equals(registro1.getChamado().getTitulo())) && (registro.getChamado().getDescricao().equals(registro1.getChamado().getDescricao())) && (registro1.getChamado().getPrioridade() == registro.getChamado().getPrioridade()) && ((registro.getChamado().getTecnico().getNome().equals(registro1.getTecnico().getNome())) && (registro.getChamado().getTecnico().getTelefone() == registro1.getChamado().getTecnico().getTelefone())) && (registro.getChamado().getCliente().getCpf() == registro1.getChamado().getCliente().getCpf()) && (registro.getChamado().getSistemaOperacional().equals(registro1.getChamado().getSistemaOperacional())) && (registro.getChamado().getVersaoSO().equals(registro1.getChamado().getVersaoSO())) && (registro.getChamado().getBancoDeDados().equals(registro1.getChamado().getBancoDeDados())));
                    inserido = registro1;
                }
            }
        }
        Assert.assertNotNull(inserido);

    }

    @Test
    public void gerarCodigoTest() {
        ChamadoDAO chamadodao = new ChamadoDAO();
        Assert.assertEquals(chamadodao.getChamados().size(), chamadodao.gerarCodigo() - 1);
    }

    @Test
    public void gerarCodigoRegistroTest() {
        ChamadoDAO chamadodao = new ChamadoDAO();
        Assert.assertEquals(chamadodao.getRegistros().size(), chamadodao.gerarCodigoRegistroChamado() - 1);

    }

    public void leituraRegistrosChamadosTest() {
        Tecnico tecnico = new Tecnico("Júlio da Silva", 44547896L);
        Chamado chamado = new Chamado("Tabela Inexistente", "Os responsáveis pela criação das tabelas, esqueceram uma ", 8, tecnico, (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), "Windows", "10", BancoDeDados.MySql + "");
        RegistroChamado registro = new RegistroChamado(TipoProblema.ProblemaBancoDeDados + "", chamado, tecnico);
        ChamadoDAO chamadodao = new ChamadoDAO();
        chamadodao.putRegistro(registro);
        Assert.assertTrue(chamadodao.getRegistros().size() > 0);
    }

    public void leituraChamadosTest() {
        ChamadoDAO chamadodao = new ChamadoDAO();
        Chamado chamado = new Chamado("Tabela Inexistente", "Os responsáveis pela criação das tabelas, esqueceram uma ", 8, (new Tecnico("Júlio da Silva", 44547896L)), (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), "Windows", "10", BancoDeDados.MySql + "");
        chamadodao.put(chamado);
        Assert.assertTrue(chamadodao.getChamados().size() > 0);
    }
}
