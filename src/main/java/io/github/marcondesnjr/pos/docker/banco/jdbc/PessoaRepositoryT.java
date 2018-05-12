/*
 * 
 */
package io.github.marcondesnjr.pos.docker.banco.jdbc;

import io.github.marcondesnjr.pos.docker.banco.entidade.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Alternative;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */
@Alternative
public class PessoaRepositoryT implements PessoaRepository{
    
    @Override
    public List<Pessoa> readAll(){
        Pessoa p = new Pessoa();
        p.setId(new Long(1));
        p.setCpf("12312.131231");
        p.setNome("Bixo");
        
        ArrayList<Pessoa> pList = new ArrayList<>();
        pList.add(p);
        return pList;
    }

    @Override
    public Pessoa create(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
