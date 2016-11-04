package entidadeTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.entidade.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31437974
 */
public class PessoaTest {

    @Test
    public void cadastroPessoaTeste() {
        Pessoa p1 = new Pessoa("Lucas", 1234567);
        assertEquals("Lucas", p1.getNome());
        assertEquals(1234567, p1.getTelefone());
    }

    @Test
    public void editarPessoaTest() {
        Pessoa p2 = new Pessoa("Jose", 45876589);
        p2.setNome("Renan");
        p2.setTelefone(47541125);
        assertNotSame("Jose", p2.getNome());
        assertNotSame(45876589, p2.getTelefone());
    }   

}
