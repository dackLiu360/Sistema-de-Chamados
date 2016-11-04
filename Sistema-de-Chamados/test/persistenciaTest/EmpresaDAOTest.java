/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaTest;

import br.persistencia.EmpresaDAO;
import br.persistencia.TecnicoDAO;
import br.entidade.Empresa;
import java.util.Collection;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author 31437974
 */
public class EmpresaDAOTest {

    @Test
    public void inserirEmpresaTest() {
        Empresa empresa = new Empresa(1234, "Algar Telecom");
        EmpresaDAO empresadao = new EmpresaDAO();
        empresadao.put(empresa);

        Collection<Empresa> empresas = empresadao.getEmpresas();
        Empresa inserida = null;
        for (Empresa empresa1 : empresas) {
            if ((empresa.getNomeEmpresa().equals(empresa1.getNomeEmpresa())) && (empresa.getNumeroContrato() == empresa1.getNumeroContrato())) {
                inserida = empresa1;
            }
        }
        Assert.assertTrue(((empresa.getNomeEmpresa().equals(inserida.getNomeEmpresa())) && (empresa.getNumeroContrato() == inserida.getNumeroContrato())));

    }

    @Test
    public void leiturEmpresaTest() {
         EmpresaDAO empresadao = new EmpresaDAO();
         Assert.assertTrue(empresadao.voltaEmpresa().size() > 0);
    }
    


}
