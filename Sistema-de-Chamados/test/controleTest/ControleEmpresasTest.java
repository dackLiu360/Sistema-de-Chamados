/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleTest;

import br.controle.ControleEmpresas;
import br.entidade.Empresa;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DackLiu360
 */
public class ControleEmpresasTest {

   /*

    @Test
    public void inserirEmpresaDuplicadaTest() {
        ControleEmpresas ct = new ControleEmpresas();
        Empresa em1 = ct.retorna(1236545, "Lojas Marabras");
        Assert.assertNull(ct.inserir(em1.getNumeroContrato(), em1.getNomeEmpresa()));

    }
    
     @Test
    public void inserirEmpresaTest() {
        ControleEmpresas ct = new ControleEmpresas();
        Empresa em = new Empresa(1236545, "Lojas Marabras");
        ct.inserir(em.getNumeroContrato(), em.getNomeEmpresa());
        Empresa emInserida = ct.retorna(1236545, "Lojas Marabras");
        Assert.assertTrue((emInserida.getNomeEmpresa().equals(em.getNomeEmpresa())) && (emInserida.getNumeroContrato() == em.getNumeroContrato()));
    }

    @Test
    public void buscarEmpresaTest() {
        Empresa em = new Empresa(989438, "Hello world");
        ControleEmpresas ct = new ControleEmpresas();
        ct.inserir(em.getNumeroContrato(), em.getNomeEmpresa());
        Empresa emInserida = ct.retorna(989438, "Hello world");
        Assert.assertEquals(989438, emInserida.getNumeroContrato());
        Assert.assertEquals("Hello world", emInserida.getNomeEmpresa());
    }

    @Test
    public void buscarTodasEmpresasTest() {
        ControleEmpresas ct = new ControleEmpresas();
        Assert.fail("O metodo de leitura não existe");
    }


    @Test
    public void verificarSeNomeEmpresaExisteTest() {
        ControleEmpresas ct = new ControleEmpresas();
        int retorno = ct.validar(12345687, "Samsung");
        Assert.assertEquals(2, retorno);
    }

    @Test
    public void verificarNmrContratoExisteTest() {
        ControleEmpresas ct = new ControleEmpresas();
        int retorno = ct.validar(12345, "existe");
        Assert.assertEquals(3, retorno);
    }

    @Test
    public void verificarNomeENmrContratoExisteTest() {
        ControleEmpresas ct = new ControleEmpresas();
        int retorno = ct.validar(12345, "Samsung");
        Assert.assertEquals(1, retorno);
    }

    @Test
    public void verificarDisponibilidadeNomeNmrContratoTest() {
        ControleEmpresas ct = new ControleEmpresas();
        int retorno = ct.validar(12345678, "Casas Bahia");
        Assert.assertEquals(4, retorno);
    }

    @Test
    public void verificarSeEmpresaExisteNoBancoTest() {
        Empresa em = new Empresa(125897, "Hello world");
        ControleEmpresas ct = new ControleEmpresas();
        Assert.assertTrue(ct.checar(em.getNumeroContrato(), em.getNomeEmpresa()));
    }
    */
}
